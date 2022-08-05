import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StopClock extends JFrame implements ActionListener {
	
	private boolean isRunning = false;
	
	private long startTime = 0;
	
	private long stopTime = 0;
	
	private final JLabel startTimeJLabel = new JLabel("Not started");
	
	private final JLabel stopTimeJLabel = new JLabel("Not started");
	
	private final JLabel splitTimeJLabel = new JLabel("Not started");
	
	private final JLabel elapsedTimeJLabel = new JLabel("Not started");
	
	public StopClock() {
		
		setTitle("Stop Clock");
		
		Container contents = getContentPane();
		
		contents.setLayout(new GridLayout(0,1));
		
		contents.add(new JLabel("Started at:"));
		contents.add(startTimeJLabel);
		
		contents.add(new JLabel("Stopped at:"));
		contents.add(stopTimeJLabel);
		
		contents.add(new JLabel("Split time:"));
		contents.add(splitTimeJLabel);
		
		contents.add(new JLabel("Elapsed time (seconds):"));
		contents.add(elapsedTimeJLabel);
		
		JButton splitJButton = new JButton("Split");
		contents.add(splitJButton);
		
		JButton startStopJButton = new JButton("Start / Stop");
		startStopJButton.addActionListener(this);
		contents.add(startStopJButton);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		
	}// StopClock
	
	public void actionPerformed(ActionEvent event)
	{
		if(!isRunning)
		{
			// Start the clock.
			startTime = System.currentTimeMillis();
			startTimeJLabel.setText("" + startTime);
			stopTimeJLabel.setText("Running...");
			elapsedTimeJLabel.setText("Running...");
			isRunning = true;
		}// if
		else // isRunning
		{
			// Stop the clock and show the updated times.
			stopTime = System.currentTimeMillis();
			stopTimeJLabel.setText("" + stopTime);
			long elapsedMilliSeconds = stopTime - startTime;
			elapsedTimeJLabel.setText("" + elapsedMilliSeconds / 1000.0);
			isRunning = false;
		}// else
		// It is a good idea to pack again 
		// because the size of the labels may have changed.
		pack();
	}// actionPerformed
	
	// Create a StopClock and make it appear on screen.
	public static void main(String[] args) {
		StopClock theStopClock = new StopClock();
		theStopClock.setVisible(true);
	}// main

}// class StopClock
