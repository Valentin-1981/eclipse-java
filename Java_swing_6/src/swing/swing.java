package swing;

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
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
//import javax.swing.JRadioButton;
//import javax.swing.border.Border;

public class swing {

	static JFrame jFrame = getFrame();
	
	static JPanel jPanel = new JPanel();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jFrame.add(jPanel);
		
		JPopupMenu jPopupMenu = new JPopupMenu();
		jPopupMenu.add(new JMenuItem("one"));
		jPopupMenu.add(new JMenuItem("two"));
		jPanel.setComponentPopupMenu(jPopupMenu);
	}
	
	
	
	static JFrame getFrame() {
		JFrame jFrame = new JFrame();
		jFrame.setVisible(true);
		jFrame.setBounds(750, 250, 500, 500);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return jFrame;		
	}
}




