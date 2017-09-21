package com.Ryan;

import java.awt.event.KeyEvent;

import com.rupeng.game.GameCore;
/*
 * 编号
 * 300 	球
 * 301	爆炸特效
 * 999	挡板
 */
public class 打砖块MAIN implements Runnable
{
	/*
	 * 实例化ThreadBallAndDangBan类
	 */
	private static ThreadBall ball=new ThreadBall();
	/*
	 * 实例化ThreadWin类
	 */
	private static ThreadWin win=new ThreadWin();
	/*
	 * 实例化ThreadWay类
	 */
	private static ThreadWay way=new ThreadWay();
	/*
	 * 实例化ThreadJudegeBallSquare类
	 */
	private static ThreadJudegeBallSquare Square=new ThreadJudegeBallSquare();
	/*
	 * 实例化ThreadBallExpedite类
	 */
	@SuppressWarnings("unused")
	private static ThreadBallExpedite ballEx=new ThreadBallExpedite();
	public static void main(String[] args)
	{
		GameCore.start(new 打砖块MAIN());
	}
	public void run()
	{
		while (true)
			play();
	}
	private void play()
	{
		Init.init();
		/*
		 * 任意键继续
		 */
		{
			int vk=-1;
			while( vk!=KeyEvent.VK_A&&vk!=KeyEvent.VK_D)
			{
				vk=GameCore.getPressedKeyCode();
			}
		}
		ball.start();//启动进程
		
		win.start();//启动进程
		
		way.start();//启动进程
		
		Square.start();//启动进程
		/**
		 * 暂时不启动加速功能
		 */
		//ballEx.start();//启动进程
		while(true)
		{
			
		}
	}
	@SuppressWarnings("deprecation")
	public static  void  closeThreadBallAndDangBan()
	{
		try{
			ball.stop();//不建议使用，现在先保留，此处不能够再恢复线程
		}catch(Exception e){
	           System.out.println("Stop the ThreadBallAndDangBan err");
	       }
		return;
	}
	@SuppressWarnings("deprecation")
	public static  void  closeThreadJudegeBallSquare()
	{
		try{
			Square.stop();//不建议使用，现在先保留，此处不能够再恢复线程
		}catch(Exception e){
	           System.out.println("Stop the ThreadJudegeBallSquare err");
	       }
		return;
	}
}


