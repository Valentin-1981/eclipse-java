package Java;

import javax.swing.*;
import javax.swing.border.Border;

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
//		jPanel.add(new JPasswordField(20));
		jPanel.add(new JCheckBox("checkbox label"));
		JRadioButton radioButton1 = new JRadioButton("one");
		JRadioButton radioButton2 = new JRadioButton("two");
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(radioButton1);
		buttonGroup.add(radioButton2);
		jPanel.add(radioButton1);
		jPanel.add(radioButton2);
		Border border = BorderFactory.createEtchedBorder();
		Border border1 = BorderFactory.createTitledBorder(border, "title");
		JComboBox<String> comboBox = new JComboBox();
		comboBox.addItem("one");
		comboBox.addItem("two");
		comboBox.addItem("three");
		jPanel.add(comboBox);
		jPanel.setBorder(border1);
	}
	
	
	
	static JFrame getFrame() {
		JFrame jFrame = new JFrame() {};
		jFrame.setVisible(true);
		jFrame.setBounds(750, 250, 500, 500);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return jFrame;		
	}
}