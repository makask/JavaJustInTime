import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
// Program to display a Hello World greeting in a window.
public class HelloWorld extends JFrame {
	
	// Constructor
	public HelloWorld() {
		setTitle("Hello World");
		Container contents = getContentPane();
		contents.add(new JLabel("Greetings to all who dwell on Planet Earth!"));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}// HelloWorld
	
	// Create a HelloWorld and make it appear on screen.
	public static void main(String[] args) {
		HelloWorld theHelloWorld = new HelloWorld();
		theHelloWorld.setVisible(true);
	}// main
	
}// class HelloWorld
