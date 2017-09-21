package com.ryancore;
import com.rupeng.game.GameCore;

public class Image
{
		/**
		 * 
		 * @param num 图片编号
		 * @param name	图片名称
		 * @param x	图片位置X坐标
		 * @param y	图片位置Y坐标
		 */
		public static void imagePut(int num,String name,int x,int y)
		{
			GameCore.createImage(num, name);
			GameCore.setImagePosition(num, x, y);
			return;
		}
		/**
		 * 
		 * @param initNum
		 * @param name
		 */
		public static void imageRandPut(int initNum,String []name,int initX,int initY)
		{
			String n[]=new String[name.length];
			for(int i=0;i<n.length;i++)
			{
				n[i]=name[i];
			}
			int r;
			for(int i=0;i<n.length;i++)
			{
				do
				{
					r=GameCore.rand(0, n.length);
				} while (n[r]==null);
					GameCore.createImage(initNum, n[r]);
					GameCore.setImagePosition(initNum, GameCore.getImageWidth(initNum)*i+initX, initY);
					n[r]=null;
					initNum++;
			}
		}
		
//		/**
//		 * 按照矩形随机放置大小相等图片的位置
//		 * @param initNum 图片起始编号
//		 * @param name	图片名字数组
//		 * @param lie 图片放置几列几行XY
//		 * @param kuan
//		 * @param initX	起始0
//		 * @param initY 起始0
//		 * @param x	图片之间间隔
//		 * @param y 图片之间间隔
//		 * 
//		 */
//		public static void imageRandPut(int initNum,String []name,int lie,int kuan,int initX,int initY,int x,int y)
//		{
//			/*
//			 * 使用I来计数，判断放置了多少张了
//			 * 使用数组R来储存使用过的随机数
//			 */
//			int i=1,r[]=new int[name.length], exit=0;
//			int initnum=initNum;
//			for(int j=0;j<name.length;j++)
//			{
//				r[j]=-1;
//				GameCore.createImage(initnum++);
//			}
//			while(true)
//			{
//				int num;
//				do
//				{
//					num=GameCore.rand(0, name.length);
//					for(int k=0;k<name.length;k++)
//					{
//						if(r[k]==num)
//						{
//							r[k]=-1;
//							break;
//						}
//						else
//						{
//							exit=1;
//						}
//					}
//				} while (exit==0);
//				GameCore.setImageSource(initNum++, name[num]);
//				//GameCore.createImage(initNum++, name[num]);
//				System.out.println(initNum);
//				System.out.println(name[num]);
//				//GameCore.pause(1000);
//				if(i<=lie)
//				{
//				GameCore.setImagePosition(
//						initNum, initX+GameCore.getImageWidth(initNum)*i, initY);
//				}
//				else
//				{
//					GameCore.setImagePosition(
//							initNum, initX+GameCore.getImageWidth(initNum)*(i%lie),
//							initY+GameCore.getImageHeight(initNum)*(i%kuan));
//				}
//				//initNum++;	
//
//				/*
//				 * 检测数组内的文件是否放置完
//				 */
//				for(int j=0;j<name.length;j++)
//				{
//					if(name[j]!=null)
//					{
//						break;
//					}
//					else
//					{
//						return;
//					}
//				}
//			}
//		}
		/**
		 * 是否显示图片
		 * @param imagesNum 图片编号
		 * @param bool true显示，false不显示
		 */
		public static void ImageShowOrhide(int imagesNum,boolean bool)
		{
			if(bool==true)
			{
				GameCore.showImage(imagesNum);
			}
			else {
				GameCore.hideImage(imagesNum);
			}
			return;
		}
		/**
		 * 获取图片长
		 * @param imagesNum 图片编号
		 * @return
		 */
		public static int getImageHeight(int imagesNum)
		{
			return GameCore.getImageHeight(imagesNum);
		}
		/**
		 * 获取图片宽
		 * @param imagesNum 图片编号
		 * @return
		 */
		public static int getImagesWidth(int imagesNum)
		{
			return GameCore.getImageWidth(imagesNum);
		}
}
