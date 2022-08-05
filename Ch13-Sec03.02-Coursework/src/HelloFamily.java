import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloFamily extends JFrame{
	
	// Constructor
		public HelloFamily() 
		{
			setTitle("Hello Family");
			Container contents = getContentPane();
			// We want the planet names to appear in one line.
			contents.setLayout(new FlowLayout());
			
			contents.add(new JLabel("Hello Peeter!"));
			contents.add(new JLabel("Hello Ott!"));
			contents.add(new JLabel("Hello Ülle!"));
			contents.add(new JLabel("Hello Ingrid!"));
			contents.add(new JLabel("Hello Valeri!"));
			contents.add(new JLabel("Hello Aino!"));
			contents.add(new JLabel("Hello Osvald!"));
			contents.add(new JLabel("Hello Piret!"));
			contents.add(new JLabel("Hello Kati!"));
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			pack();
		}// HelloSolarSystem
		
		// Create a HelloSolarSystem and make it appear on screen.
		public static void main(String[] args) {
			HelloFamily theHelloFamily = new HelloFamily();
			theHelloFamily.setVisible(true);
		}// main

}
