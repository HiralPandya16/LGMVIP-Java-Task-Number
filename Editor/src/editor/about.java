package editor;

import java.awt.Font;
import javax.swing.*;

public class about extends JFrame {

    about() {
        setBounds(100, 100, 500, 400);
        setTitle("About Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("ICON.jpg"));
        setIconImage(icon.getImage());

        setLayout(null);
        JLabel text = new JLabel("<html>Welcome to Notepad, <br> Notepad is a simple text editor that allows you to create and edit plain text files. It is usually included in the Windows operating system. Notepad has some basic features such as find and replace, word wrap, font selection, and printing. However, it does not have advanced features such as syntax highlighting, auto-completion, or spell checking.<br> all right reserved @2023</html>");
        text.setBounds(50, 10, 400, 300);
        text.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        add(text);
    }

    public static void main(String[] args) {

        new about().setVisible(true);

    }

}
