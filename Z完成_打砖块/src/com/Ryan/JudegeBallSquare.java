package com.Ryan;

import com.rupeng.game.GameCore;

public class JudegeBallSquare
{
	
	public static void run()
	{
		
		for (int i = 71; i >= 0; i--)//72是方块的个数，i变量也是方块的编号
		{	
			/*
			 * 此方法通过判断球与砖块4边是否有相撞
			 */
			int squareX=GameCore.getImagePosition(i).x;
			int squareY=GameCore.getImagePosition(i).y;
			int squareWidth=GameCore.getImageWidth(i);
			int squareHeight=+GameCore.getImageHeight(i);
			int ballX=GameCore.getSpritePosition(300).x;
			int ballY=GameCore.getSpritePosition(300).y;
			int ballWidth=GameCore.getSpriteWidth(300);
			int ballHeight=GameCore.getSpriteHeight(300);
			/*
			 * Judege底边
			 */
			if(ballY<=squareY+squareHeight&&ballY>=squareY&&ballX+ballWidth/2>squareX&&ballX+ballWidth/2<squareX+squareWidth)
			{
				Ball.setBallVY(-Ball.getBallVY());
				GameCore.hideImage(i);
				GameCore.setImagePosition(i, -100, -100);
				
				JudgeWin.setCount(JudgeWin.getCount()+1);
				
				RandPlaySound.run();
				
				ThreadFire threadFire=new ThreadFire();
				threadFire.run();
				return;
			}
			/*
			 * Judege顶边
			 */
			if(ballY+ballHeight<=squareY&&ballY+ballHeight<=squareY+squareHeight&&ballX+ballWidth/2>squareX&&ballX+ballWidth/2<squareX+squareWidth)
			{
				Ball.setBallVY(-Ball.getBallVY());
				GameCore.hideImage(i);
				GameCore.setImagePosition(i, -100, -100);
				
				JudgeWin.setCount(JudgeWin.getCount()+1);
				
				RandPlaySound.run();
				
				ThreadFire threadFire=new ThreadFire();
				threadFire.run();
				return;
			}
			/*
			 * Judege左边
			 */
			if(ballX+ballWidth>=squareX&&ballX+ballWidth<=squareX+squareWidth&&ballY+ballHeight/2>squareY&&ballY+ballHeight/2<squareY+squareHeight)
			{
				Ball.setBallVY(-Ball.getBallVX());
				GameCore.hideImage(i);
				GameCore.setImagePosition(i, -100, -100);
				
				JudgeWin.setCount(JudgeWin.getCount()+1);
				
				RandPlaySound.run();
				
				ThreadFire threadFire=new ThreadFire();
				threadFire.run();
				return;
			}
			/*
			 * Judege右边
			 */
			if(ballX<=squareX+squareWidth&&ballX+ballWidth>=squareX&&ballY+ballHeight/2>squareY&&ballY+ballHeight/2<squareY+squareHeight)
			{
				Ball.setBallVY(-Ball.getBallVX());
				GameCore.hideImage(i);
				GameCore.setImagePosition(i, -100, -100);
				
				JudgeWin.setCount(JudgeWin.getCount()+1);
				
				RandPlaySound.run();
				
				ThreadFire threadFire=new ThreadFire();
				threadFire.run();
				return;
			}
		//GameCore.pause(10);//避免判断小球是否撞到方块的行为频繁
		}
	}
}

