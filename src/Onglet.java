import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;

public class Onglet {
	public static void main(String[] args) {
		JFrame f = new JFrame("New tab");
		f.addWindowListener(new WindowAdapter() {
			public void closeWindow(WindowEvent e) {
				System.exit(0);
			}
		});
		JTabbedPane tabs = new JTabbedPane();
		
		JPanel tab1 = new JPanel();
		JLabel label = new JLabel("Welcome");
		tab1.add(label);
		tabs.addTab("onglet 1", null, tab1);
		
		JPanel tab2 = new JPanel();
		JTextField txt = new JTextField(30);
		tab2.add(txt);
		tabs.addTab("onglet 2", null, tab2);
		
		Container contentPane = f.getContentPane();
		contentPane.add(tabs);
		f.pack();
		f.setVisible(true);
	}
}
