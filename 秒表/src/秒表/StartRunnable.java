package Ãë±í;

public class StartRunnable   implements Runnable
{
	public MainInterface mainInterface;
	public StartRunnable(MainInterface mainInterface)
	{
		this.mainInterface=mainInterface;
	}

	public void run()
	{
		Integer f=0,s=0,mm=0;
		while (mainInterface.getStatus() != 0)
		{
			try
			{
				Thread.sleep(10);
			} catch (Exception e)
			{
				
			}
			mm+=10;
			if(mm>1000)
			{
				mm=0;
				s++;
			}
			if(s>60)
			{
				s=0;
				f++;
			}
			mainInterface.getTimeLabel().setText(f+":"+s+":"+mm.toString().charAt(0));
		}

	}

}
