package Java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Java {

	static JFrame jFrame = getFrame();
	
	static JPanel jPanel = new JPanel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JComponent jComponent = new MyComponent();
		jFrame.add(jComponent);
		jFrame.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				super.mouseMoved(e);
				MyComponent.xCoord = e.getX();
				MyComponent.yCoord = e.getY();
				jComponent.repaint();
			}
		});
		
		jPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				jPanel.setBackground(Color.blue);
			}
		});
		
		
		
		AbstractAction myAction = new MyAction();
		JButton jButton = new JButton(myAction);
		jButton.setText("submit");
		jPanel.add(jButton);
		
//		KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B");
//		InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
//		inputMap.put(keyStroke, "changeColor");
//		ActionMap actionMap = jPanel.getActionMap();
//		actionMap.put("changeColor", myAction);
	}
	
	static class MyComponent extends JComponent {
		public static int xCoord;
		public static int yCoord;
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			((Graphics2D)g).drawString("Coordinate x: " + xCoord + " Coordinate y: " + yCoord, 50, 50);
		}
	}

	static class MyAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent e) {
			jPanel.setBackground(Color.blue);
		}
	}
	
	static JFrame getFrame() {
		JFrame jFrame = new JFrame() {};
		jFrame.setVisible(true);
		jFrame.setBounds(750, 250, 500, 500);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return jFrame;		
	}
}
