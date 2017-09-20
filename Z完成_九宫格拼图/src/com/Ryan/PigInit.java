package com.Ryan;

import java.awt.Color;

import com.rupeng.game.GameCore;

public final class PigInit
{
	private static int X = 0, Y = 0;
	private static int count = 0;

	protected static int getCount()
	{
		return count;
	}

	protected static int getX()
	{
		return X;
	}

	protected static int getY()
	{
		return Y;
	}

	protected static void run()
	{
		int x = X;
		int y = Y;
		GameCore.setGameSize(692 + 687, 715);
		GameCore.createText(999, "【我是对照图】");
		GameCore.setTextColor(999, Color.WHITE);
		GameCore.setTextFontSize(999, 30);
		GameCore.setTextPosition(999, x + 229 * 3, y + 650);
		GameCore.loadBgView("背景.jpg");
		GameCore.setGameTitle("Pig");
		GameCore.playSound("背景音乐.mp3", true);
		//对照图
		GameCore.createImage(0, "0.jpg");
		GameCore.setImagePosition(0, x + 229 * 3, y);
		int k=1;
		for(int j=0;j<3;j++)
		for(int i=0;i<3;i++)
		{
			GameCore.createImage(k, "0_0"+k+".jpg");
			GameCore.setImagePosition(1, x+i*229, y+j*229);
			k++;
		}
		int initX[] =
		{ x, x + 229, x + 229 * 2, x, x + 229, x + 229 * 2, x, x + 229, x + 229 * 2 };
		int initY[] =
		{ y, y, y, y + 229, y + 229, y + 229, y + 229 * 2, y + 229 * 2, y + 229 * 2 };
		for (int i = 1; i <= 9; i++)
		{
			do
			{
				int t = GameCore.rand(0, 9);// 不会出现9这个数字，
				if (initX[t] != -1)
				{
					GameCore.setImagePosition(i, initX[t], initY[t]);
					initX[t] = initY[t] = -1;
					break;
				}
			} while (true);
		}
	}

	protected static void setCount(int count)
	{
		PigInit.count = count;
	}

	protected static void setX(int x)
	{
		if(x<0)return;
		X = x;
	}

	protected static void setY(int y)
	{
		if(y<0)return;
		Y = y;
	}
}