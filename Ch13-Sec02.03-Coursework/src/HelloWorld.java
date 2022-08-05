import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld extends JFrame {
	
	public static void main(String[] args) {
		HelloWorld theHelloWorld = new HelloWorld();
		theHelloWorld.setVisible(true);
	}// main
	
	// Constructor
	public HelloWorld() 
	{
		setTitle("Tere maailm!!!");
		Container contents = getContentPane();
		contents.add(new JLabel("Tere tulemas Java planeedile!!!"));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}// HelloWorld

}// class HelloWorld
