package com.Ryan;

import com.rupeng.game.GameCore;

public  class ThreadBall extends Thread
{
	public  void run()
	{
		while (true)
		{
			GameCore.pause(4);//С���˶����ٶ�
			Ball.ball();
		}
	}
}
