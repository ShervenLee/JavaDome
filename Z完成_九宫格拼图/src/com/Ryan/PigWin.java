package com.Ryan;

import java.awt.Point;

import com.rupeng.game.GameCore;

public final class PigWin
{
	protected static void run()
	{
		int x = -1, y = -1;
		for (int i = 1; i < 9; i++)// ǰ��8������ȷ����ô�ھŸ�Ҳ��ȷ
		{
			if (i == 1 || i == 4 || i == 7)
				x = PigInit.getX() + 0;
			else
			{
				if (i == 2 || i == 5 || i == 8)
					x = PigInit.getX() + 229;
				else
				{
					if (i == 3 || i == 6 || i == 9)
						x = PigInit.getX() + 229 * 2;
				}
			}
			if (i == 1 || i == 2 || i == 3)
				y = PigInit.getY() + 0;
			else
			{
				if (i == 4 || i == 5 || i == 6)
					y = PigInit.getY() + 229;
				else
				{
					if (i == 7 || i == 8 || i == 9)
						y = PigInit.getY() + 229 * 2;
				}
			}
			Point pi = GameCore.getImagePosition(i);
			System.out.println("X-->" + x + "Y-->" + y + "-->" + pi.x + "==" + pi.y);
			if (pi.x != x || pi.y != y)
			{
				return;
			}
		}
		GameCore.closeSound("��������.mp3");
		GameCore.playSound("ʤ������.mp3", false);
		GameCore.alert("YOU WIN !");
		GameCore.exit();
		return;// ������ɶ�����ȷ�ģ��ͷ���Ӯ
	}
}