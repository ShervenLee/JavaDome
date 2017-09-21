package com.Ryan;


public class ThreadWin extends Thread
{
	public void run()
	{
		while(true)
		{
			JudgeWin.judgeWin();
		}
	}
}
