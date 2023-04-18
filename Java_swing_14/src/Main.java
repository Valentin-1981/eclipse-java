import javax.swing.*;
import java.awt.*;

public class Main {
    static JFrame jFrame = getFrame();

    static JPanel jPanel = new JPanel() {};

    public static void main(String[] args) {
        System.out.println("Hello world!");
        jFrame.add(jPanel);
        jPanel.setLayout(null);
        jPanel.setLayout(new MyLayout());
        jPanel.add(new JButton("submit 1"));
        jPanel.add(new JButton("submit 2"));
        jPanel.add(new JButton("submit 3"));

//        JButton jButton = new JButton("submit");
//        jButton.setBounds(50, 50, 150, 40);
//        jPanel.add(jButton);

    }

    static class MyLayout implements LayoutManager {

        @Override
        public void addLayoutComponent(String name, Component comp) {

        }

        @Override
        public void removeLayoutComponent(Component comp) {

        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            return null;
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return null;
        }

        @Override
        public void layoutContainer(Container parent) {
            for(int i = 0; i < parent.getComponentCount(); i++){
                Component component = parent.getComponent(i);
                component.setBounds(i * 100, i * 40, 100, 40);
            }
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