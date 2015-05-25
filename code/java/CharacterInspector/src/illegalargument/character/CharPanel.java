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

package illegalargument.character;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedMap;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class CharPanel {

  private final JPanel panel = new JPanel();
  private final Model model = new Model();
  private final JTextArea area = new JTextArea();
  private ComboBoxModel charsetModel;
  private ComboBoxModel modeModel;
  private Document docModel;

  public CharPanel() {
    panel.setLayout(new BorderLayout());
    panel.add(createTopPanel(), BorderLayout.NORTH);
    panel.add(new JScrollPane(area), BorderLayout.CENTER);

    Font mono = Font.decode("Monospaced");
    area.setEditable(false);
    area.setText(model.getReport());
    area.setFont(mono);
  }

  public JPanel getPanel() {
    return panel;
  }

  private JPanel createTopPanel() {
    JPanel top = new JPanel();
    top.setLayout(new BorderLayout());

    top.add(createModes(), BorderLayout.WEST);
    top.add(createField(), BorderLayout.CENTER);
    top.add(createCharsets(), BorderLayout.EAST);

    return top;
  }

  private JComboBox createCharsets() {
    SortedMap<String, Charset> all = Charset.availableCharsets();
    Set<Charset> set = new LinkedHashSet<Charset>();
    set.addAll(all.values());
    Iterator<Charset> it = set.iterator();
    while (it.hasNext()) {
      if (!it.next().canEncode()) {
        it.remove();
      }
    }
    charsetModel = new DefaultComboBoxModel(set
        .toArray(new Charset[set.size()]));

    Charset def = Charset.defaultCharset();
    charsetModel.setSelectedItem(def);
    model.setCharset(def);

    JComboBox charsets = new JComboBox();
    charsets.setToolTipText("encoding for byte representation");
    charsets.setModel(charsetModel);
    charsets.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        onChange();
      }
    });
    return charsets;
  }

  private JComboBox createModes() {
    modeModel = new DefaultComboBoxModel(Model.Mode.values());

    modeModel.setSelectedItem(Model.Mode.GLYPHS);
    model.setMode(Model.Mode.GLYPHS);

    JComboBox modes = new JComboBox();
    modes.setToolTipText("input mode");
    modes.setModel(modeModel);
    modes.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        onChange();
      }
    });
    return modes;
  }

  private JTextField createField() {
    String data = "55";
    JTextField text = new JTextField(data);
    model.setData(data);
    docModel = text.getDocument();
    docModel.addDocumentListener(new DocumentListener() {
      public void changedUpdate(DocumentEvent e) {
        onChange();
      }

      public void insertUpdate(DocumentEvent e) {
        onChange();
      }

      public void removeUpdate(DocumentEvent e) {
        onChange();
      }
    });

    return text;
  }

  private void onChange() {
    try {
      model.setData(docModel.getText(0, docModel.getLength()));
      model.setCharset((Charset) charsetModel.getSelectedItem());
      model.setMode((Model.Mode) modeModel.getSelectedItem());

      area.setText(model.getReport());
    } catch (BadLocationException e) {
      area.setText(e.getLocalizedMessage());
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Unicode Character Inspector");
    Icons.setIcon(frame);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new CharPanel().panel);
    frame.setSize(640, 400);
    frame.setVisible(true);
  }

}
