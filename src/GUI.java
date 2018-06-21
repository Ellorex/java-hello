import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;

public class GUI {
	 public static void main(String[] args) {
		 JFrame fenetre = new JFrame();
		 fenetre.setBounds(0,0,400,500);
		 fenetre.setTitle("ma premièrefenêtre en java");

		 //  fenetre.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 JButton bouton = new JButton();
		 JButton bouton1 = new JButton();
		 JButton bouton2 = new JButton();
		 bouton.setText("Cliquez ici");
		 bouton1.setText("Ou là");
		 bouton2.setText("Voire ici");
		 
		 JPanel panel = new JPanel();
		 panel.add(bouton);
		 panel.add(bouton1);
		 panel.add(bouton2);
		 
		 JTextArea textarea = new JTextArea("Tapez votre texte ici",10, 20);
		 JScrollPane scroll = new JScrollPane(textarea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 panel.add(scroll);

		 fenetre.getContentPane().add(panel);
		 fenetre.setVisible(true);
	 }
}
