import com.sun.nio.sctp.MessageInfo;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

import static javax.swing.JOptionPane.YES_NO_OPTION;

public class Main {
    static JFrame jFrame = getFrame();

    static JPanel jPanel = new JPanel() {};

    public static void main(String[] args) {
        System.out.println("Hello world!");
        jFrame.add(jPanel);
        JButton jButton = new JButton("show dialog");
        jPanel.add(jButton);


        jButton.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JFileChooser fileChooser = new JFileChooser();
                Color color = JColorChooser.showDialog(jPanel, "title", Color.blue);
                jPanel.setBackground(color);
//                int i = fileChooser.showDialog(jPanel, "save as");
//                System.out.println(i);
//                File file = fileChooser.getSelectedFile();
//                System.out.println(file.getName());
            }

        }));

        jPanel.revalidate();
    }


    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}