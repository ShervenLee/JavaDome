package com.Ryan;


public class ThreadJudegeBallSquare extends Thread
{
	public  void run()
	{
		while(true)
		{
			JudegeBallSquare.run();
		}
	}
}
