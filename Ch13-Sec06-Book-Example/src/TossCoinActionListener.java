import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
// The ActionListener for CoinTosser`s TossCoin JButton. Each time 
// actionPerformed is called, we count the number of tosses, and update the 
// given JLabel with that count, plus either "Heads" or "Tails".
public class TossCoinActionListener implements ActionListener {
	
	// The JLabel that needs to be updated.
	private final JLabel headsOrTailsJLabel;
	
	// We count the tosses, so it is clear when we have a new toss.
	private int noOfTosses = 0;
	
	// Constructor
	public TossCoinActionListener(JLabel requiredHeadsOrTailsJLabel)
	{
		headsOrTailsJLabel = requiredHeadsOrTailsJLabel;
	}// TossCoinActionListener
	
	// Action performed: update noOfTosses and headsOrTailsJLabel.
	public void actionPerformed(ActionEvent event)
	{
		noOfTosses++;
		if(Math.random() >= 0.5)
			headsOrTailsJLabel.setText("Toss " + noOfTosses + ": Heads");
		else
			headsOrTailsJLabel.setText("Toss " + noOfTosses + ": Tails");
	}// actionPerformed
	
}// class TossCoinActionListener
