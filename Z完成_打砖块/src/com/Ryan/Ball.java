package com.Ryan;



import com.rupeng.game.GameCore;

public class Ball
{
	private static int ballV=1;
	private static int ballVX=GameCore.rand(1, 3);
	private static int ballVY=-(3-ballVX);
	/*
	 * 暂时不适用随机初始化的方式控制起始方向
	 */
//	private static int ballVX=2;
//	private static int ballVY=-1;D
	public static void ball()
	{
		int temVX=GameCore.getSpritePosition(300).x+ballVX;
		int temVY=GameCore.getSpritePosition(300).y+ballVY;
		/*
		 * 判断是否碰到墙的边缘，底部不用判断，JudgeWin类有判断机制
		 */
		if (temVX<=0||temVX>=GameCore.getGameWidth()-GameCore.getSpriteWidth(300))
		{
			ballVX=-ballVX;
			GameCore.playSound("撞墙音乐.mp3", false);
			
		}
		else
		{
			if (temVY<=0)
			{
				ballVY=-ballVY;
				GameCore.playSound("撞墙音乐.mp3", false);
				
			}
		}
		/*
		 * 当撞到挡板则反弹
		 */
		{
			/*
			 * 球的Y坐标+球高度==挡板上表面Y坐标
			 * 并且
			 * 球X坐标+球二分之一宽度>挡板X坐标
			 * 并且
			 * 球X坐标+球宽度<挡板X坐标+挡板宽度
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
				GameCore.playSound("撞墙音乐.mp3", false);
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
