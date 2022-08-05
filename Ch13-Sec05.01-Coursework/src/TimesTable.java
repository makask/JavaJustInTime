import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimesTable extends JFrame{
	
	
	    // Constructor
		public TimesTable(int number1, int number2) 
		{
			
			setTitle("Times table");
			Container contents = getContentPane();
			// We want the planet names to appear in one line.
			contents.setLayout(new GridLayout(number2, 0, 20, 10));
			
			for(int index = 1; index <= number2; index++) {
				contents.add(new JLabel(String.valueOf(index)));
				contents.add(new JLabel(String.valueOf("X")));
				contents.add(new JLabel(String.valueOf(number1)));
				contents.add(new JLabel(String.valueOf("=")));
				contents.add(new JLabel(String.valueOf(index * number1)));
			}//for
		
			
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			pack();
		}// HelloSolarSystem
		
		// Create a HelloSolarSystem and make it appear on screen.
		public static void main(String[] args) {
			TimesTable theTimesTable = new TimesTable(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
			theTimesTable.setVisible(true);
		}// main

}