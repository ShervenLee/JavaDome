package com.Ryan;

import com.rupeng.game.GameCore;

public final class GameMain implements Runnable
{
	public static void main(String[] args)
	{
		GameCore.start(new GameMain());
	}

	private static void play()
	{
		PigInit.run();
		while (true)
		{
			PigWay.run();
			GameCore.pause(200);// ���������ƶ����ţ�ԭ����
			PigWin.run();
		}
	}

	public void run()
	{
		while (true)
			play();
	}
}
