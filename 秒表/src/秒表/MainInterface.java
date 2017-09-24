package Ãë±í;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainInterface
{

	private Integer status = 0;// start or stop ×´Ì¬,0==stop,1==start

	public Integer getStatus()
	{
		return status;
	}

	public void setStatus(Integer status)
	{
		this.status = status;
	}

	private JFrame frame;
	private JLabel timeLabel;

	public JFrame getFrame()
	{
		return frame;
	}

	public JLabel getTimeLabel()
	{
		return timeLabel;
	}

	public JButton getStartStopButton()
	{
		return startStopButton;
	}

	private JButton startStopButton;

	/**
	 * Create the application.
	 */
	public MainInterface()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 132);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		startStopButton = new JButton("\u5F00\u59CB/\u505C\u6B62");
		startStopButton.setBounds(315, 10, 93, 74);
		frame.getContentPane().add(startStopButton);

		timeLabel = new JLabel("0:0:0");
		timeLabel.setForeground(Color.BLUE);
		timeLabel.setFont(new Font("ËÎÌå", Font.PLAIN, 50));
		timeLabel.setBounds(38, 10, 234, 74);
		frame.getContentPane().add(timeLabel);
		frame.setVisible(true);
	}
}
