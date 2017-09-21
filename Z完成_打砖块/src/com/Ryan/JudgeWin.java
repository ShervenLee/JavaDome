package com.Ryan;


import com.rupeng.game.GameCore;

public class JudgeWin
{
	private static int count=0;//记录被打掉的砖块个数
	public static int getCount()
	{
		return count;
	}
	public static void setCount(int count)
	{
		JudgeWin.count = count;
	}
	protected static void judgeWin(){
		GameCore.pause(200);//避免检测的太频繁
		if(count==72)
		{
				打砖块MAIN.closeThreadBallAndDangBan();
				打砖块MAIN.closeThreadJudegeBallSquare();
				GameCore.playSound("胜利音乐.mp3", false);
			GameCore.alert("你赢了！\n\t");
			System.exit(0);
		}
		if(GameCore.getSpritePosition(300).y>
		Init.getDangBanY()+GameCore.getImageHeight(999))
		{
			/*
			 * 关闭球运动的线程
			 */
			打砖块MAIN.closeThreadBallAndDangBan();
			打砖块MAIN.closeThreadJudegeBallSquare();
			GameCore.alert("G A M E   O V E R\n\t");
			System.exit(0);
//			if(GameCore.confirm("G A M E   O V E R\n\t继续？"))
//			{
//				
//				count=0;
//				//Init.init();
//				打砖块MAIN.main(null);
//			}
//			else
//			{
//				System.exit(0);
//			}
			
		}
	}
}
