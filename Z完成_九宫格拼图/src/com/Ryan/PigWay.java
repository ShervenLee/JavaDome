package com.Ryan;

import java.awt.Point;
import java.awt.event.KeyEvent;

import com.rupeng.game.GameCore;

public final class PigWay
{
	/**
	 * 
	 * @param imagesNum ��Ҫ������ͼƬ���
	 */
	protected static void barter(int imagesNum)// ��Ϊ���Ǹ�9��ͼƬ����������ֻ��һ��ͼƬ�ı��
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
		PigInit.setCount(PigInit.getCount() + 1);// ��������1
		GameCore.setGameTitle("Pig" + "       ������" + PigInit.getCount());
		int imX = p9.x;
		int imY = p9.y;
		if (KeyEvent.VK_S == vk && imY != PigInit.getY())
		{
			// ����ͼƬλ��
			vk = -1;// ���İ�����ֵ������һֱִ��
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
			// ����ͼƬλ��
			vk = -1;// ���İ�����ֵ������һֱִ��
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
			// ����ͼƬλ��
			vk = -1;// ���İ�����ֵ������һֱִ��
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
			// ����ͼƬλ��
			vk = -1;// ���İ�����ֵ������һֱִ��
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
