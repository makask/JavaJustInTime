import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Program to display a greeting to all nine planets, in a window.
public class HelloSolarSystem extends JFrame {
	
	// Constructor
	public HelloSolarSystem() 
	{
		setTitle("Hello Solar System");
		Container contents = getContentPane();
		// We want the planet names to appear in one line.
		contents.setLayout(new FlowLayout());
		
		contents.add(new JLabel("Hello Mercury!"));
		contents.add(new JLabel("Hello Venus!"));
		contents.add(new JLabel("Hello Earth!"));
		contents.add(new JLabel("Hello Mars!"));
		contents.add(new JLabel("Hello Jupiter!"));
		contents.add(new JLabel("Hello Saturn!"));
		contents.add(new JLabel("Hello Uranus!"));
		contents.add(new JLabel("Hello Neptune!"));
		contents.add(new JLabel("Goodbye Pluto!"));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}// HelloSolarSystem
	
	// Create a HelloSolarSystem and make it appear on screen.
	public static void main(String[] args) {
		HelloSolarSystem theHelloSolarSystem = new HelloSolarSystem();
		theHelloSolarSystem.setVisible(true);
	}// main
}// class HelloSolarSystem
