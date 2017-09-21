package com.Ryan;


import com.rupeng.game.GameCore;

public class ThreadFire implements Runnable
{
	static//只是执行创建编号为201的爆炸效果一次
	{
	GameCore.createSprite(301, "bomb");
	}
	 public void run()
	{
		
		GameCore.playSpriteAnimate(301, "fire", true);
		GameCore.setSpritePosition(301, GameCore.getSpritePosition(300).x-10, GameCore.getSpritePosition(300).y-20);
		GameCore.pause(800);
		GameCore.setSpritePosition(301, -100,-100 );
	}

}

