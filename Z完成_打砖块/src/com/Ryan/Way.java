package com.Ryan;

import java.awt.event.KeyEvent;

import com.rupeng.game.GameCore;

public class Way
{
	private static int v=4;//速度4像素,方向向右
	protected static void way()
	{
		/*
		 * x=v0*t+(1/2)*a*t*t
		 * 此处匀速运动x=vo*t
		 */
		GameCore.pause(5);
		int vk=GameCore.getPressedKeyCode();
		int temv=v;
		while( vk!=KeyEvent.VK_A&&vk!=KeyEvent.VK_D)
		{
			vk=GameCore.getPressedKeyCode();
		}
		if(vk==KeyEvent.VK_A)
		{
			temv=-v;
		}
		else if (vk==KeyEvent.VK_D)
		{
			temv=v;
		}
		int nowX=GameCore.getImagePosition(999).x+temv;
		if (nowX<=0||nowX>GameCore.getGameWidth()-GameCore.getImageWidth(999))
		{
			return;
		}
		GameCore.setImagePosition(999, nowX, Init.getDangBanY());
	}
}
