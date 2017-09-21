package com.Ryan;

import com.rupeng.game.GameCore;

public class BallExpedite
{
	/*
	 * 根据挡板和小球的移动方向判断小球是否应该加速，
	 * 只是X轴方向加速，并且加速最多在原始基础上加1
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
	 * 0表示挡板没有动，1表示向左运动，2表示向右运动
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
	 * 0表示球没有动，1表示向左运动，2表示向右运动
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
