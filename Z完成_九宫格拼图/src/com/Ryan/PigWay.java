package com.Ryan;

import java.awt.Point;
import java.awt.event.KeyEvent;

import com.rupeng.game.GameCore;

public final class PigWay
{
	/**
	 * 
	 * @param imagesNum 需要交换的图片编号
	 */
	protected static void barter(int imagesNum)// 因为总是跟9号图片交换，所以只有一个图片的编号
	{
		Point p9 = GameCore.getImagePosition(9);
		Point pi = GameCore.getImagePosition(imagesNum);
		GameCore.setImagePosition(imagesNum, p9.x, p9.y);
		GameCore.setImagePosition(9, pi.x, pi.y);
		return;
	}

	protected static void run()
	{
		Point p9 = GameCore.getImagePosition(9);
		int vk = -1;
		while (vk == -1)
		{
			vk = GameCore.getPressedKeyCode();
		}
		PigInit.setCount(PigInit.getCount() + 1);// 步数自增1
		GameCore.setGameTitle("Pig" + "       步数：" + PigInit.getCount());
		int imX = p9.x;
		int imY = p9.y;
		if (KeyEvent.VK_S == vk && imY != PigInit.getY())
		{
			// 交换图片位置
			vk = -1;// 更改按键的值，避免一直执行
			for (int i = 1; i <= 9; i++)
			{
				Point pi = GameCore.getImagePosition(i);
				if (pi.x == p9.x && pi.y == p9.y - 229)
				{
					barter(i);
					return;
				}
			}
		}
		if (KeyEvent.VK_W == vk && imY != PigInit.getY() + (229 * 2))
		{
			// 交换图片位置
			vk = -1;// 更改按键的值，避免一直执行
			for (int i = 1; i <= 9; i++)
			{
				Point pi = GameCore.getImagePosition(i);
				if (pi.x == p9.x && pi.y == p9.y + 229)
				{
					barter(i);
					return;
				}
			}
		}
		if (KeyEvent.VK_A == vk && imX != PigInit.getX() + 229 * 2)
		{
			// 交换图片位置
			vk = -1;// 更改按键的值，避免一直执行
			for (int i = 1; i <= 9; i++)
			{
				Point pi = GameCore.getImagePosition(i);
				if (pi.x == p9.x + 229 && pi.y == p9.y)
				{
					barter(i);
					return;
				}
			}
		}
		if (KeyEvent.VK_D == vk && imX != PigInit.getX())
		{
			// 交换图片位置
			vk = -1;// 更改按键的值，避免一直执行
			for (int i = 1; i <= 9; i++)
			{
				Point pi = GameCore.getImagePosition(i);
				if (pi.x == p9.x - 229 && pi.y == p9.y)
				{
					barter(i);
					return;
				}
			}
		}
	}
}
