import javax.swing.*;
import java.awt.*;

public class Main {
    static JFrame jFrame = getFrame();

    static JPanel jPanel = new JPanel() {};

    public static void main(String[] args) {
        System.out.println("Hello world!");
        jFrame.add(jPanel);
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);
        GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
        gridBagConstraints1.weightx = 0;
        gridBagConstraints1.weighty = 0;
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.gridy = 0;
        gridBagConstraints1.gridheight = 2;
        gridBagConstraints1.gridwidth = 2;
        jPanel.add(new JTextArea(4, 20), gridBagConstraints1);


        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.weightx = 0;
        gridBagConstraints2.weighty = 0;
        gridBagConstraints2.gridx = 2;
        gridBagConstraints2.gridy = 0;
        gridBagConstraints2.gridheight = 1;
        gridBagConstraints2.gridwidth = 2;
        jPanel.add(new JButton("Button 1"), gridBagConstraints2);

        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.weightx = 0;
        gridBagConstraints3.weighty = 0;
        gridBagConstraints3.gridx = 2;
        gridBagConstraints3.gridy = 1;
        gridBagConstraints3.gridheight = 1;
        gridBagConstraints3.gridwidth = 1;
        jPanel.add(new JButton("Button 2"), gridBagConstraints3);

        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.weightx = 0;
        gridBagConstraints4.weighty = 0;
        gridBagConstraints4.gridx = 3;
        gridBagConstraints4.gridy = 1;
        gridBagConstraints4.gridheight = 1;
        gridBagConstraints4.gridwidth = 1;
        jPanel.add(new JButton("Button 3"), gridBagConstraints4);

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