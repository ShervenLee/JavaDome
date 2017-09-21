package com.Ryan;

import com.rupeng.game.GameCore;

public class Init
{

	private static int dangBanX = 400;
	private static int dangBanY = 500;
	static
	{
		com.ryancore.Image.imagePut(999, "挡板.png", dangBanX, dangBanY);
		GameCore.createSprite(300, "ball");
		GameCore.playSpriteAnimate(300, "rotate", true);
	}

	private static int ballX = dangBanX + GameCore.getImageWidth(999) / 2 - GameCore.getSpriteWidth(300) / 2;
	private static int ballY = dangBanY - GameCore.getSpriteHeight(300);

	static
	{
		GameCore.setSpritePosition(300, ballX, ballY - 1);// 起始时不放在木板上,刚好与木板相撞会有问题
	}

	public static int getBallX()
	{
		return ballX;
	}

	public static void setBallX(int ballX)
	{
		Init.ballX = ballX;
	}

	public static int getBallY()
	{
		return ballY;
	}

	public static void setBallY(int ballY)
	{
		Init.ballY = ballY;
	}

	public static int getDangBanX()
	{
		return dangBanX;
	}

	public static void setDangBanX(int dangBanX)
	{
		Init.dangBanX = dangBanX;
	}

	public static int getDangBanY()
	{
		return dangBanY;
	}

	public static void setDangBanY(int dangBanY)
	{
		Init.dangBanY = dangBanY;
	}

	static
	{
		GameCore.playSound("背景音乐.mp3", true);
		GameCore.loadBgView("背景.jpeg");
		GameCore.setGameTitle("打砖块");
		GameCore.setGameSize(1014, 588);// 砖块宽度84，这样刚好放置12个，以后再增加游戏参数
	}

	protected static void init()
	{

		String[] imageName = { "方块1.png", "方块2.png", "方块3.png", "方块4.png", "方块5.png", "方块6.png", "方块7.png", "方块1.png",
				"方块2.png", "方块3.png", "方块4.png", "方块5.png" };
		for (int i = 0; i < 6; i++)
		{
			com.ryancore.Image.imageRandPut(12 * i, imageName, 0, 23 * i);
		}
	}

}
