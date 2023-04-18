import com.sun.nio.sctp.MessageInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.YES_NO_OPTION;

public class Main {
    static JFrame jFrame = getFrame();

    static JPanel jPanel = new JPanel() {};

    public static void main(String[] args) {
        System.out.println("Hello world!");
        jFrame.add(jPanel);
        JButton jButton = new JButton("show dialog");
        jPanel.add(jButton);
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
////                JOptionPane.showMessageDialog(jPanel, "This is my dialog",  "title", JOptionPane.ERROR_MESSAGE);
////                System.out.println(JOptionPane.showConfirmDialog(jPanel, "some message", "title", JOptionPane.YES_NO_OPTION));
////                JOptionPane.showOptionDialog(jPanel, "message", "title", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"one", "two", "three"}, "two");
//                System.out.println(JOptionPane.showInputDialog(jPanel, "show message"));
//            }
//        });

        jButton.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog myDialog = new MyDialog();
                myDialog.setVisible(true);
            }
        }));
    }

    static class MyDialog extends JDialog {
        public MyDialog() {
            super(jFrame, "title", true);
            add(new TextField(), BorderLayout.NORTH);
            add(new JButton("button"), BorderLayout.SOUTH);
            setBounds(500, 500, 250, 150);
        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}