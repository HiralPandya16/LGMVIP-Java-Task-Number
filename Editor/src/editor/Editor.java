package editor;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Editor extends JFrame implements ActionListener {

    JMenuBar menubar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMenu format = new JMenu("Format");
    JMenu help = new JMenu("Help");

    JMenuItem newfile = new JMenuItem("New");
    JMenuItem openfile = new JMenuItem("Open");
    JMenuItem savefile = new JMenuItem("Save");
    JMenuItem print = new JMenuItem("Print");
    JMenuItem close = new JMenuItem("Close");

    JMenuItem cut = new JMenuItem("Cut");
    JMenuItem copy = new JMenuItem("Copy");
    JMenuItem paste = new JMenuItem("Paste");
    JMenuItem selectAll = new JMenuItem("Select All");

    JCheckBoxMenuItem wordwrap = new JCheckBoxMenuItem("Word Wrap");
    JMenuItem font = new JMenuItem("Font");

    JMenuItem about = new JMenuItem("About");

    JTextArea text = new JTextArea();

    Editor() {
        setTitle("NotePad");
        setBounds(100, 100, 700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("ICON.jpg"));
        setIconImage(icon.getImage());

        setJMenuBar(menubar);
        menubar.add(file);

        file.add(newfile);
        file.add(openfile);
        file.add(savefile);
        file.add(print);
        file.add(close);
        newfile.addActionListener(this);
        openfile.addActionListener(this);
        savefile.addActionListener(this);
        print.addActionListener(this);
        close.addActionListener(this);

        menubar.add(edit);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        menubar.add(format);
        format.add(wordwrap);
        // format.add(font);
        wordwrap.addActionListener(this);
        // font.addActionListener(this);

        menubar.add(help);
        help.add(about);
        about.addActionListener(this);

        JScrollPane scroll = new JScrollPane(text);
        add(scroll);
        text.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setBorder(BorderFactory.createEmptyBorder());

        newfile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        openfile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        savefile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK));
        close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));

        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
        selectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));

        wordwrap.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK));

       
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equalsIgnoreCase("New")) {
            text.setText(null);
        } else if (e.getActionCommand().equalsIgnoreCase("Open")) {
            JFileChooser filechoose = new JFileChooser();
            FileNameExtensionFilter textFilter = new FileNameExtensionFilter("Only text File(.txt)", "txt");
            filechoose.setAcceptAllFileFilterUsed(false);
            filechoose.addChoosableFileFilter(textFilter);

            int action = filechoose.showOpenDialog(null);

            if (action != JFileChooser.APPROVE_OPTION) {
                return;
            } else {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(filechoose.getSelectedFile()));
                    text.read(reader, null);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

        } else if (e.getActionCommand().equalsIgnoreCase("Save")) {
            JFileChooser filechoose = new JFileChooser();
            FileNameExtensionFilter textFilter = new FileNameExtensionFilter("Only text File(.txt)", "txt");
            filechoose.setAcceptAllFileFilterUsed(false);
            filechoose.addChoosableFileFilter(textFilter);

            int action = filechoose.showSaveDialog(null);
            if (action != JFileChooser.APPROVE_OPTION) {
                return;
            } else {

                String fileName = filechoose.getSelectedFile().getAbsolutePath().toString();
                if (!fileName.contains(".txt")) {
                    fileName = fileName + ".txt";
                }
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                    text.write(writer);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }

        } else if (e.getActionCommand().equalsIgnoreCase("Print")) {
            try {
                text.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (e.getActionCommand().equalsIgnoreCase("Close")) {
            System.exit(0);

        } else if (e.getActionCommand().equalsIgnoreCase("Cut")) {
            text.cut();

        } else if (e.getActionCommand().equalsIgnoreCase("Copy")) {
            text.copy();

        } else if (e.getActionCommand().equalsIgnoreCase("Paste")) {
            text.paste();

        } else if (e.getActionCommand().equalsIgnoreCase("Select All")) {
            text.selectAll();

        } else if (e.getActionCommand().equalsIgnoreCase("About")) {
            new about().setVisible(true);
        } else if (e.getActionCommand().equalsIgnoreCase("Word Wrap")) {
            if (wordwrap.isSelected() == true) {
                text.setLineWrap(true);
                text.setWrapStyleWord(true);
            }
        }

    }

    
     public static void main(String[] args) throws Exception{
         
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         
        new Editor().setVisible(true);

    }
}
