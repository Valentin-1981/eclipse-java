
import javax.swing.*;
import java.awt.*;
public class Main {
    static JFrame jFrame = getFrame();

    public static void main(String[] args) {

//        System.out.println("Hello world!");
//        jFrame.add(new JButton("one"), BorderLayout.NORTH);
//        jFrame.add(new JButton("two"), BorderLayout.SOUTH);
//        jFrame.add(new JButton("three"), BorderLayout.WEST);
//        jFrame.add(new JButton("four"), BorderLayout.EAST);
//        jFrame.add(new JButton("five"), BorderLayout.CENTER);

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.setLayout(new GridLayout(2, 2));
        jPanel.add(new JButton("one"));
        jPanel.add(new JButton("two"));
        jPanel.add(new JButton("three"));
        jPanel.add(new JButton("four"));
    }


    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250,  500, 500);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        return jFrame;
    }

}
