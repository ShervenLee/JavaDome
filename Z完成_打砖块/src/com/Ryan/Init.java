package com.Ryan;

import com.rupeng.game.GameCore;

public class Init
{

	private static int dangBanX = 400;
	private static int dangBanY = 500;
	static
	{
		com.ryancore.Image.imagePut(999, "����.png", dangBanX, dangBanY);
		GameCore.createSprite(300, "ball");
		GameCore.playSpriteAnimate(300, "rotate", true);
	}

	private static int ballX = dangBanX + GameCore.getImageWidth(999) / 2 - GameCore.getSpriteWidth(300) / 2;
	private static int ballY = dangBanY - GameCore.getSpriteHeight(300);

	static
	{
		GameCore.setSpritePosition(300, ballX, ballY - 1);// ��ʼʱ������ľ����,�պ���ľ����ײ��������
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
		GameCore.playSound("��������.mp3", true);
		GameCore.loadBgView("����.jpeg");
		GameCore.setGameTitle("��ש��");
		GameCore.setGameSize(1014, 588);// ש����84�������պ÷���12�����Ժ���������Ϸ����
	}

	protected static void init()
	{

		String[] imageName = { "����1.png", "����2.png", "����3.png", "����4.png", "����5.png", "����6.png", "����7.png", "����1.png",
				"����2.png", "����3.png", "����4.png", "����5.png" };
		for (int i = 0; i < 6; i++)
		{
			com.ryancore.Image.imageRandPut(12 * i, imageName, 0, 23 * i);
		}
	}

}
