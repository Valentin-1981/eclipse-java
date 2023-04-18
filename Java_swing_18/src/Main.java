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
//                MyDialog myDialog = new MyDialog();
//                myDialog.setVisible(true);
                JFileChooser fileChooser = new JFileChooser();
//                fileChooser.showOpenDialog(jPanel);
//                fileChooser.showSaveDialog(jPanel);

//                fileChooser.setSelectedFile(new File("."));
//                fileChooser.setMultiSelectionEnabled(true);
//                fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//                fileChooser.setFileFilter(new FileFilter() {
//                    @Override
//                    public boolean accept(File f) {
//                        if(f.getName().endsWith("gif")){
//                            return true;
//                        }
//                        return false;
//                    }
//
//                    @Override
//                    public String getDescription() {
//                        return "only gif files";
//                    }
//                });

//                TextField textField = new TextField("blabla", 50);
//                fileChooser.add(textField, BorderLayout.SOUTH);
//
//                fileChooser.addPropertyChangeListener(new PropertyChangeListener() {
//                    @Override
//                    public void propertyChange(PropertyChangeEvent evt) {
////                        textField.setText(evt.getPropertyName());
//                        textField.setText(evt.getSource().toString());
//                    }
//                });

                int i = fileChooser.showDialog(jPanel, "save as");
                System.out.println(i);
                File file = fileChooser.getSelectedFile();
                System.out.println(file.getName());
            }

        }));

        jPanel.revalidate();
    }

//    static class MyDialog extends JDialog {
//        public MyDialog() {
//            super(jFrame, "title", true);
//            add(new TextField(), BorderLayout.NORTH);
//            add(new JButton("button"), BorderLayout.SOUTH);
//            setBounds(500, 500, 250, 150);
//        }
//    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }
}