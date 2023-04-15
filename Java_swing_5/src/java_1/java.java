package java_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
//import javax.swing.BorderFactory;
//import javax.swing.ButtonGroup;
//import javax.swing.JCheckBox;
//import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
//import javax.swing.JRadioButton;
//import javax.swing.border.Border;

public class java {

	static JFrame jFrame = getFrame();
	
	static JPanel jPanel = new JPanel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		jFrame.add(jPanel);
//		jPanel.add(new JPasswordField(20));
//		jPanel.add(new JCheckBox("checkbox label"));
		JMenuBar jMenuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		file.add(new JMenuItem("Open"));
		JMenuItem save = file.add(new JMenuItem("Save"));
		save.setEnabled(false);
		file.addSeparator();
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));
		
		edit.add(new JMenuItem("Cut"));
		edit.add(new JMenuItem("Copy"));
		edit.add(new JMenuItem("Paste"));
		
		
		jMenuBar.add(file);
		jMenuBar.add(edit);
		JMenu options = new JMenu("options");
		edit.add(options);
		options.add("one");
		options.add("two");	
		
		edit.add(new JCheckBoxMenuItem("Checkbox"));
		
		ButtonGroup buttonGroup = new ButtonGroup();
		JRadioButtonMenuItem menuItem_1 = new JRadioButtonMenuItem("Radio 1");
		JRadioButtonMenuItem menuItem_2 = new JRadioButtonMenuItem("Radio 2");
		buttonGroup.add(menuItem_1);
		buttonGroup.add(menuItem_2);
		edit.add(menuItem_1);
		edit.add(menuItem_2);
		
		jFrame.setJMenuBar(jMenuBar);
		jFrame.revalidate();
		
		
		
		
		
//		JRadioButton radioButton1 = new JRadioButton("one");
//		JRadioButton radioButton2 = new JRadioButton("two");
//		ButtonGroup buttonGroup = new ButtonGroup();
//		buttonGroup.add(radioButton1);
//		buttonGroup.add(radioButton2);
//		jPanel.add(radioButton1);
//		jPanel.add(radioButton2);
//		Border border = BorderFactory.createEtchedBorder();
//		Border border1 = BorderFactory.createTitledBorder(border, "title");
//		JComboBox<String> comboBox = new JComboBox();
//		comboBox.addItem("one");
//		comboBox.addItem("two");
//		comboBox.addItem("three");
//		jPanel.add(comboBox);
//		jPanel.setBorder(border1);
	}
	
	
	
	static JFrame getFrame() {
		JFrame jFrame = new JFrame();
		jFrame.setVisible(true);
		jFrame.setBounds(750, 250, 500, 500);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return jFrame;		
	}
}