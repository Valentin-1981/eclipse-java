package class_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class class_1 {

	static JFrame jFrame = getFrame();
	
	static JPanel jPanel = new JPanel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jFrame.add(jPanel);
		AbstractAction myAction = new MyAction();
		JButton jButton = new JButton(myAction);
		jButton.setText("submit");
		jPanel.add(jButton);
		
		KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B");
		InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		inputMap.put(keyStroke, "changeColor");
		ActionMap actionMap = jPanel.getActionMap();
		actionMap.put("changeColor", myAction);
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
