package ryan;

import javax.swing.JOptionPane;

class MouseClick implements Runnable
{
	MainFrame mainFrame = null;
	MouseObject mouse = new MouseObject();

	public void setExit(boolean exit)
	{
		mouse.setExit(exit);
	}

	public MouseClick(MainFrame mainFrame)
	{
		this.mainFrame = mainFrame;
	}

	public void run()
	{
		Integer time = 0;
		Integer count = 0;
		String timeBuf = null;
		String countBuf = null;
		if (!mainFrame.getTimeText().getText().matches("[0-9]+"))
		{
			JOptionPane.showMessageDialog(null, "You input information Err!", "Err", JOptionPane.ERROR_MESSAGE);
			mainFrame.getTimeText().setText("0");
		}
		if (!mainFrame.getCountText().getText().matches("[-]*[0-9]+"))
		{
			JOptionPane.showMessageDialog(null, "You input information Err!", "Err", JOptionPane.ERROR_MESSAGE);
			mainFrame.getCountText().setText("0");
		}
		timeBuf = mainFrame.getTimeText().getText();
		countBuf = mainFrame.getCountText().getText();
		time = Integer.parseInt(timeBuf);
		count = Integer.parseInt(countBuf);
		if(count!=-1)
		{
			for (int i = 0; i < count; i++)
			{
				System.out.println(i);
				mouse.liftDownUp();
				try
				{
					Thread.sleep(time);
				} catch (InterruptedException e1)
				{
					e1.printStackTrace();
				}

			}
			mainFrame.getStart().setEnabled(true);
		}
		else
		{
			while(true)
			{
				System.out.println(0);
				mouse.liftDownUp();
				try
				{
					Thread.sleep(time);
				} catch (InterruptedException e1)
				{
					e1.printStackTrace();
				}

			}
		}
		

	}
}
