package com.Ryan;



import com.rupeng.game.GameCore;

public class Ball
{
	private static int ballV=1;
	private static int ballVX=GameCore.rand(1, 3);
	private static int ballVY=-(3-ballVX);
	/*
	 * ��ʱ�����������ʼ���ķ�ʽ������ʼ����
	 */
//	private static int ballVX=2;
//	private static int ballVY=-1;D
	public static void ball()
	{
		int temVX=GameCore.getSpritePosition(300).x+ballVX;
		int temVY=GameCore.getSpritePosition(300).y+ballVY;
		/*
		 * �ж��Ƿ�����ǽ�ı�Ե���ײ������жϣ�JudgeWin�����жϻ���
		 */
		if (temVX<=0||temVX>=GameCore.getGameWidth()-GameCore.getSpriteWidth(300))
		{
			ballVX=-ballVX;
			GameCore.playSound("ײǽ����.mp3", false);
			
		}
		else
		{
			if (temVY<=0)
			{
				ballVY=-ballVY;
				GameCore.playSound("ײǽ����.mp3", false);
				
			}
		}
		/*
		 * ��ײ�������򷴵�
		 */
		{
			/*
			 * ���Y����+��߶�==�����ϱ���Y����
			 * ����
			 * ��X����+�����֮һ���>����X����
			 * ����
			 * ��X����+����<����X����+������
			 */
			if(
					GameCore.getSpritePosition(300).y+GameCore.getSpriteHeight(300)
					>=Init.getDangBanY()
					&&
					GameCore.getSpritePosition(300).y+GameCore.getSpriteHeight(300)
					<=Init.getDangBanY()+GameCore.getImageHeight(999)
					&&
					GameCore.getSpritePosition(300).x+GameCore.getSpriteWidth(300)/2
					>GameCore.getImagePosition(999).x
					&&
					GameCore.getSpritePosition(300).x
					<GameCore.getImagePosition(999).x+GameCore.getImageWidth(999)
			 )
			{
				GameCore.playSound("ײǽ����.mp3", false);
				ballVY=-ballVY;
			}

		}
		
		temVX=GameCore.getSpritePosition(300).x+ballVX;
		temVY=GameCore.getSpritePosition(300).y+ballVY;
		GameCore.setSpritePosition(300, temVX, temVY);
		GameCore.getGameWidth();
	}
	
	public static int getBallV()
	{
		return ballV;
	}
	public static void setBallV(int ballV)
	{
		Ball.ballV = ballV;
	}

	public static int getBallVY()
	{
		return ballVY;
	}

	public static void setBallVY(int ballVY)
	{
		Ball.ballVY = ballVY;
	}

	public static int getBallVX()
	{
		return ballVX;
	}

	public static void setBallVX(int ballVX)
	{
		Ball.ballVX = ballVX;
	}
	
}
