package ryan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp
{

	static MainFrame mainFrame = null;

	public static void main(String[] args)
	{
		mainFrame = new MainFrame();
		MouseClick mouseClick=new MouseClick(mainFrame);
		Thread thread=new Thread(mouseClick);
		mainFrame.getExit().addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				mouseClick.setExit(false);
				thread.stop();
				mainFrame.getStart().setEnabled(true);
			}
		});
		mainFrame.getStart().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					mainFrame.getStart().setEnabled(false);
					Thread.sleep(2000);
				} catch (InterruptedException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					thread.start();
			}
		});
	}
}
