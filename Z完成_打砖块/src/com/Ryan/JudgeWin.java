package com.Ryan;


import com.rupeng.game.GameCore;

public class JudgeWin
{
	private static int count=0;//��¼�������ש�����
	public static int getCount()
	{
		return count;
	}
	public static void setCount(int count)
	{
		JudgeWin.count = count;
	}
	protected static void judgeWin(){
		GameCore.pause(200);//�������̫Ƶ��
		if(count==72)
		{
				��ש��MAIN.closeThreadBallAndDangBan();
				��ש��MAIN.closeThreadJudegeBallSquare();
				GameCore.playSound("ʤ������.mp3", false);
			GameCore.alert("��Ӯ�ˣ�\n\t");
			System.exit(0);
		}
		if(GameCore.getSpritePosition(300).y>
		Init.getDangBanY()+GameCore.getImageHeight(999))
		{
			/*
			 * �ر����˶����߳�
			 */
			��ש��MAIN.closeThreadBallAndDangBan();
			��ש��MAIN.closeThreadJudegeBallSquare();
			GameCore.alert("G A M E   O V E R\n\t");
			System.exit(0);
//			if(GameCore.confirm("G A M E   O V E R\n\t������"))
//			{
//				
//				count=0;
//				//Init.init();
//				��ש��MAIN.main(null);
//			}
//			else
//			{
//				System.exit(0);
//			}
			
		}
	}
}
