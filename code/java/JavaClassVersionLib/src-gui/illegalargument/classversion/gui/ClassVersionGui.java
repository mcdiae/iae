/*
 Copyright (c) 2009 McDowell

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */

package illegalargument.classversion.gui;

import illegalargument.classversion.ClassScanner;
import illegalargument.classversion.ClassVersion;
import illegalargument.classversion.JavaVersion;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Small GUI application for displaying class version information.
 * 
 * @author McDowell
 */
public class ClassVersionGui {

  private DefaultTableModel model;
  private JFrame frame;
  private JFileChooser chooser;

  private JFrame getFrame() {
    if (frame == null) {
      frame = new JFrame("Java Class Version Scanner");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setJMenuBar(createMenuBar());
      frame.setContentPane(createContentPane());
      frame.setSize(600, 400);
      if (Compatability.hasMethod(JFrame.class,
          "setIconImages", new Class[] { List.class })) {
        frame.setIconImages(loadIcons());
      } else {
        frame.setIconImage(loadIcon());
      }
    }
    return frame;
  }

  private JMenuBar createMenuBar() {
    JMenuItem openFile = new JMenuItem(
        "Open File/Directory...");
    openFile.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        onOpenFile();
      }
    });
    JMenuItem exit = new JMenuItem("Exit");
    exit.setMnemonic('x');
    exit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        getFrame().dispose();
        System.exit(0);
      }
    });

    JMenu file = new JMenu("File");
    file.setMnemonic('f');
    file.add(openFile);
    file.add(exit);

    JMenuBar menuBar = new JMenuBar();
    menuBar.add(file);
    return menuBar;
  }

  private DefaultTableModel getTableModel() {
    if (model == null) {
      Object[] headers = { "Java", "Class", "Class File",
          "Location" };
      model = new DefaultTableModel(headers, 0);
    }
    return model;
  }

  private JTable createTable() {
    JTable table = new JTable();
    table.setModel(getTableModel());
    if (Compatability.hasMethod(JTable.class,
        "setAutoCreateRowSorter",
        new Class[] { Boolean.TYPE })) {
      table.setAutoCreateRowSorter(true);
    }
    return table;
  }

  private JComponent createContentPane() {
    JScrollPane scrollPane = new JScrollPane(createTable());
    return scrollPane;
  }

  private void addRow(File location, String className,
      ClassVersion classVersion) {
    JavaVersion javaVersion = JavaVersion
        .forClassVersion(classVersion);
    getTableModel().addRow(
        new Object[] { javaVersion.toString(),
            classVersion.toString(), className,
            location.toString() });
  }

  private void removeAllRows() {
    DefaultTableModel model = getTableModel();
    while (model.getRowCount() > 0) {
      model.removeRow(0);
    }
  }

  private void onOpenFile() {
    if (chooser == null) {
      chooser = new JFileChooser();
      chooser
          .setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
      chooser
          .addChoosableFileFilter(new LocationFileFilter());
      chooser.setDialogType(JFileChooser.OPEN_DIALOG);
      chooser.setMultiSelectionEnabled(true);
    }
    int ret = chooser.showOpenDialog(getFrame());
    if (ret == JFileChooser.APPROVE_OPTION) {
      File[] selected = chooser.getSelectedFiles();
      scan(selected);
    }
  }

  private void scan(File[] locations) {
    removeAllRows();
    for (int i = 0; i < locations.length; i++) {
      try {
        class VisitorImpl implements ClassScanner.Visitor {
          public void visitClass(File location,
              String classFile, ClassVersion version) {
            addRow(location, classFile, version);
          }
        }
        ClassScanner.visitTarget(locations[i],
            new VisitorImpl());
      } catch (IOException e) {
        JOptionPane.showMessageDialog(getFrame(), e
            .getLocalizedMessage(), "SCAN ERROR",
            JOptionPane.ERROR_MESSAGE);
      }
    }
  }

  private List loadIcons() {
    List icons = new ArrayList();
    String[] names = { "icon16.jpg", "icon32.jpg",
        "icon64.jpg" };
    String path = "/"
        + getClass().getPackage().getName().replace('.',
            '/') + "/";
    for (int i = 0; i < names.length; i++) {
      URL url = getClass().getResource(path + names[i]);
      icons.add(new ImageIcon(url).getImage());
    }
    return icons;
  }

  private Image loadIcon() {
    String path = "/"
        + getClass().getPackage().getName().replace('.',
            '/') + "/icon16.jpg";
    URL url = getClass().getResource(path);
    return new ImageIcon(url).getImage();
  }

  public static void main(String[] args) {
    new ClassVersionGui().getFrame().setVisible(true);
  }

}
