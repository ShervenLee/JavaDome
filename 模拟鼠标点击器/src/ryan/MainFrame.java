package ryan;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame
{
	private JFrame mainFrame = null;
	private JLabel timeLabel = null;
	private JLabel countLabel = null;
	private JTextField timeText = null;
	private JTextField countText = null;
	private JButton start = null;
	private JButton exit = null;

	public JTextField getTimeText()
	{
		return timeText;
	}

	public void setTimeText(JTextField timeText)
	{
		this.timeText = timeText;
	}

	public JTextField getCountText()
	{
		return countText;
	}

	public void setCountText(JTextField countText)
	{
		this.countText = countText;
	}

	public JButton getStart()
	{
		return start;
	}

	public void setStart(JButton start)
	{
		this.start = start;
	}

	public JButton getExit()
	{
		return exit;
	}

	public void setExit(JButton exit)
	{
		this.exit = exit;
	}

	public MainFrame()
	{
		mainFrame = new JFrame("MouseClick");
		mainFrame.setBounds(400, 200, 400, 200);
		mainFrame.setDefaultCloseOperation(3);
		mainFrame.setLayout(null);
		Init();
		mainFrame.setVisible(true);
	}

	private void Init()
	{
		Integer labelX = 30;
		Integer labelY = 30;
		Integer textX = 100;
		Integer textY = 30;
		timeLabel = new JLabel("Time  /ms");
		timeLabel.setBounds(labelX, labelY + 60, 60, 30);
		countLabel = new JLabel("Count");
		countLabel.setBounds(labelX, labelY, 160, 30);
		timeText = new JTextField();
		timeText.setBounds(textX, textY + 60, 100, 30);
		timeText.setText("0");
		countText = new JTextField();
		countText.setBounds(textX, textY, 100, 30);
		countText.setText("0");
		start = new JButton("Start");
		start.setBounds(250, 20, 80, 50);
		exit = new JButton("Exit");
		exit.setBounds(250, 90, 80, 50);
		mainFrame.add(timeLabel);
		mainFrame.add(countLabel);
		mainFrame.add(timeText);
		mainFrame.add(countText);
		mainFrame.add(start);
		mainFrame.add(exit);
	}

}
