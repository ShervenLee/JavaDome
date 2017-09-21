package com.Ryan;

public class ThreadBallExpedite extends Thread
{
	public void run()
	{
		while(true)
		{
			BallExpedite.ballExpedite();
		}
	}
}
