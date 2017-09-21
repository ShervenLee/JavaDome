package com.Ryan;

import com.rupeng.game.GameCore;

public class BallExpedite
{
	/*
	 * ���ݵ����С����ƶ������ж�С���Ƿ�Ӧ�ü��٣�
	 * ֻ��X�᷽����٣����Ҽ��������ԭʼ�����ϼ�1
	 */
	protected static  void ballExpedite()
	{
		if(dangBan()!=ball())
		{
			if(Ball.getBallVX()<=2)
			{
				return;
			}
			if (isBallMeetDangBan())
			Ball.setBallVX(Ball.getBallVX()-1);
		}
		if(dangBan()==ball())
		{
			if(Ball.getBallVX()>=3)
			{
				return;
			}
			if (isBallMeetDangBan())
			Ball.setBallVX(Ball.getBallVX()+1);
		}
	}
	/**
	 * 
	 * @return
	 * 0��ʾ����û�ж���1��ʾ�����˶���2��ʾ�����˶�
	 */
	private static int dangBan()
	{
		int lodX=GameCore.getSpritePosition(300).x;
		GameCore.pause(1);
		int newX=GameCore.getSpritePosition(300).x;
		if(lodX>newX)
			return 1;
		if (lodX<newX)
			return 2;
		return 0;
	}
	/**
	 * 
	 * @return
	 * 0��ʾ��û�ж���1��ʾ�����˶���2��ʾ�����˶�
	 */
	private static int ball()
	{
		int lodX=GameCore.getImagePosition(999).x;
		GameCore.pause(1);
		int newX=GameCore.getImagePosition(999).x;
		if(lodX>newX)
			return 1;
		if (lodX<newX)
			return 2;
		return 0;
	}
	/**
	 * 
	 */
	private static boolean isBallMeetDangBan()
	{
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
			return true;
		}
		return false;
	}
}
