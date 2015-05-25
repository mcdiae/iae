/*
Copyright (c) 2010 McDowell

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

package demo.fluentio.examples;

import static demo.fluentio.Closers.closer;
import static demo.fluentio.Doctors.DETECT_BOM;
import static demo.fluentio.Doctors.bom;
import static demo.fluentio.Drains.drain;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import static javax.swing.JFileChooser.OPEN_DIALOG;
import static javax.swing.JFileChooser.SAVE_DIALOG;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import demo.fluentio.Closer;
import demo.fluentio.IO;

/*******************************************************************************
 * A simple text editor that uses the I/O API. This editor supports
 * byte-order-marks.
 * 
 * @author McDowell
 */
public class TextEditor {

  private void save(File output, String data) throws IOException {
    Closer closer = closer();
    try {
      Writer writer = IO.open(closer, output)
                        .utf8()
                        .doctor(bom())
                        .die();
      writer.write(data);
    } finally {
      closer.close();
    }
  }

  private String load(File input) throws IOException {
    Closer closer = closer();
    try {
      InputStreamReader reader = IO.access(closer, input)
                                   .doctor(DETECT_BOM)
                                   .die();
      return drain(reader, new StringBuilder()).toString();
    } finally {
      closer.close();
    }
  }

  private final JFrame frame = new JFrame("Text Editor");
  private final JTextArea text = new JTextArea();
  private final JFileChooser chooser = new JFileChooser();

  private TextEditor() {
    JMenuItem open = new JMenuItem("Open...");
    open.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        load();
      }
    });
    JMenuItem save = new JMenuItem("Save as...");
    save.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        save();
      }
    });

    JMenu menu = new JMenu("File");
    menu.add(open);
    menu.add(save);
    JMenuBar menuBar = new JMenuBar();
    menuBar.add(menu);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);
    frame.setJMenuBar(menuBar);
    frame.setContentPane(new JScrollPane(text));
    frame.setVisible(true);
  }

  private void save() {
    try {
      chooser.setDialogType(SAVE_DIALOG);
      if (chooser.showDialog(frame, "Save") == APPROVE_OPTION) {
        String data = text.getText();
        File file = chooser.getSelectedFile();
        save(file, data);
      }
    } catch (IOException e) {
      JOptionPane.showMessageDialog(frame, "Error: " + e.getLocalizedMessage());
    }
  }

  private void load() {
    try {
      chooser.setDialogType(OPEN_DIALOG);
      if (chooser.showDialog(frame, "Open") == APPROVE_OPTION) {
        File file = chooser.getSelectedFile();
        String data = load(file);
        text.setText(data);
      }
    } catch (IOException e) {
      JOptionPane.showMessageDialog(frame, "Error: " + e.getLocalizedMessage());
    }
  }

  public static void main(String[] args) {
    new TextEditor();
  }
}
