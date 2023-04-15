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
		jFrame.add(jPanel);
		jPanel.add(new JLabel("this is label"));
		jPanel.add(new TextField("default value", 20));
		JTextField jTextField = new JTextField();
		jTextField.getText();
		jPanel.add(new JPasswordField(20));
		
		
		JTextArea jTextArea = new JTextArea(5, 20);
		jTextArea.setLineWrap(true);
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
//		jScrollPane.add(jTextArea);
		jPanel.add(jScrollPane);
		jPanel.revalidate();	
	}
	
	
	
	static JFrame getFrame() {
		JFrame jFrame = new JFrame() {};
		jFrame.setVisible(true);
		jFrame.setBounds(750, 250, 500, 500);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return jFrame;		
	}
}