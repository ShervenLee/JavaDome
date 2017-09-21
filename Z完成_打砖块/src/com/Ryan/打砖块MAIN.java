package com.Ryan;

import java.awt.event.KeyEvent;

import com.rupeng.game.GameCore;
/*
 * ���
 * 300 	��
 * 301	��ը��Ч
 * 999	����
 */
public class ��ש��MAIN implements Runnable
{
	/*
	 * ʵ����ThreadBallAndDangBan��
	 */
	private static ThreadBall ball=new ThreadBall();
	/*
	 * ʵ����ThreadWin��
	 */
	private static ThreadWin win=new ThreadWin();
	/*
	 * ʵ����ThreadWay��
	 */
	private static ThreadWay way=new ThreadWay();
	/*
	 * ʵ����ThreadJudegeBallSquare��
	 */
	private static ThreadJudegeBallSquare Square=new ThreadJudegeBallSquare();
	/*
	 * ʵ����ThreadBallExpedite��
	 */
	@SuppressWarnings("unused")
	private static ThreadBallExpedite ballEx=new ThreadBallExpedite();
	public static void main(String[] args)
	{
		GameCore.start(new ��ש��MAIN());
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
		 * ���������
		 */
		{
			int vk=-1;
			while( vk!=KeyEvent.VK_A&&vk!=KeyEvent.VK_D)
			{
				vk=GameCore.getPressedKeyCode();
			}
		}
		ball.start();//��������
		
		win.start();//��������
		
		way.start();//��������
		
		Square.start();//��������
		/**
		 * ��ʱ���������ٹ���
		 */
		//ballEx.start();//��������
		while(true)
		{
			
		}
	}
	@SuppressWarnings("deprecation")
	public static  void  closeThreadBallAndDangBan()
	{
		try{
			ball.stop();//������ʹ�ã������ȱ������˴����ܹ��ٻָ��߳�
		}catch(Exception e){
	           System.out.println("Stop the ThreadBallAndDangBan err");
	       }
		return;
	}
	@SuppressWarnings("deprecation")
	public static  void  closeThreadJudegeBallSquare()
	{
		try{
			Square.stop();//������ʹ�ã������ȱ������˴����ܹ��ٻָ��߳�
		}catch(Exception e){
	           System.out.println("Stop the ThreadJudegeBallSquare err");
	       }
		return;
	}
}


