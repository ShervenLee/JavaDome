package com.Ryan;

import com.rupeng.game.GameCore;

public class JudegeBallSquare
{
	
	public static void run()
	{
		
		for (int i = 71; i >= 0; i--)//72�Ƿ���ĸ�����i����Ҳ�Ƿ���ı��
		{	
			/*
			 * �˷���ͨ���ж�����ש��4���Ƿ�����ײ
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
			 * Judege�ױ�
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
			 * Judege����
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
			 * Judege���
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
			 * Judege�ұ�
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
		//GameCore.pause(10);//�����ж�С���Ƿ�ײ���������ΪƵ��
		}
	}
}

