package package_1.com.lessons;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.beans.EventHandler;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.*;

import javax.swing.*;




public class Class_1 {
	static JFrame jFrame = getFrame();
	static JPanel jPanel = new JPanel();
	
	
	public static void main(String[] args) {
		JButton button = new JButton(new MyAction());
		button.setText("Press me!");
		jPanel.add(button);
//		jFrame.add(new MyComponent());
		jFrame.add(jPanel);
	}

	static class MyAction extends AbstractAction {
		MyAction() {
			putValue(AbstractAction.SHORT_DESCRIPTION, "My small action");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			jPanel.setBackground(Color.blue);
		}

		
	}
	
	static class MyComponent extends JComponent {
		@Override
		protected void paintComponent(Graphics g) {
			Font font = new Font("Bitstream Charter", Font.BOLD, 20);
			Graphics2D g2 = (Graphics2D)g;
			g2.setFont(font);
			g2.drawString("Hello world!", 50, 50);
			Point2D p1 = new Point2D.Double(70, 70);
			Point2D p2 = new Point2D.Double(170, 170);
			Line2D l2 = new Line2D.Double(p1, p2);
			g2.draw(l2);
			Ellipse2D el = new Ellipse2D.Double(70, 70, 170, 170);
			g2.setPaint(Color.RED);
			g2.draw(el);
			Rectangle2D rect = new Rectangle2D.Double(70, 70, 170, 170);
			g2.draw(rect);
			try {
				URL url = new URL("https://www.gcreddy.com/wp-content/uploads/2021/07/Java-Programming-Language.png");
				Image image = new ImageIcon(url).getImage();
				g2.drawImage(image, 200, 50, 300, 150, null);				
			} catch(MalformedURLException e) {
				e.printStackTrace();
			}
			
			
			
		}
	}
	
	static JFrame getFrame() {
		JFrame jframe = new JFrame();
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension = toolkit.getScreenSize();
//		jframe.setSize(500, 300);
//		jframe.setLocation(500, 400);
		jframe.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150 , 500, 300);
		jframe.setTitle("Title");
		
//		jframe.add(jPanel);
		
//		JButton jButton = new JButton("submit");
//		jPanel.add(jButton);
//		JButton jButton1 = new JButton("Metal");
//		jPanel.add(jButton1);
//		JButton jButton2 = new JButton("Nimbus");
//		jPanel.add(jButton2);
//		JButton jButton3 = new JButton("Motif");
//		jPanel.add(jButton3);
//		JButton jButton4 = new JButton("GTK+");
//		jPanel.add(jButton4);
		jframe.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Hello world!");
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		

		
//		jButton1.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				try {
//					UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//				} catch (Exception el) {
//					el.printStackTrace();
//				}
//			}
//			
//		});
//		jButton2.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				try {
//					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//				} catch (Exception el) {
//					el.printStackTrace();
//				}
//			}
//			
//		});
//		jButton3.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				try {
//					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//				} catch (Exception el) {
//					el.printStackTrace();
//				}
//			}
//			
//		});
//		jButton4.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				try {
//					UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//				} catch (Exception el) {
//					el.printStackTrace();
//				}
//			}
			
//		}
//	)
;
		
//		jButton.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				jPanel.setBackground(Color.BLUE);
//				jframe.setTitle(((JButton)e.getSource()).getText());
//			}
//		});
		
//		jButton.addActionListener(EventHandler.create(ActionListener.class, jframe, "title", "source.text"));
	
		return jframe;
	}
	
}
