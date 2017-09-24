package √Î±Ì;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoreCode
{
	public MainInterface mainInterface;
	StartRunnable startRunnable;
	Thread thread;

	public CoreCode(MainInterface mainInterface)
	{
		this.mainInterface = mainInterface;
		Init();

	}

	private void Init()
	{
		mainInterface.getStartStopButton().addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				startRunnable = new StartRunnable(mainInterface);
				thread = new Thread(startRunnable);
				if (mainInterface.getStatus() == 0)
				{
					mainInterface.getTimeLabel().setText("0:0:0");
					mainInterface.setStatus(1);
					thread.start();
				} else
				{
					mainInterface.setStatus(0);
					// thread.yield();//‘›Õ£
					thread.stop();
				}
			}
		});
	}

}
