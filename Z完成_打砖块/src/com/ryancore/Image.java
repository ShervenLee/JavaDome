package com.ryancore;
import com.rupeng.game.GameCore;

public class Image
{
		/**
		 * 
		 * @param num ͼƬ���
		 * @param name	ͼƬ����
		 * @param x	ͼƬλ��X����
		 * @param y	ͼƬλ��Y����
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
//		 * ���վ���������ô�С���ͼƬ��λ��
//		 * @param initNum ͼƬ��ʼ���
//		 * @param name	ͼƬ��������
//		 * @param lie ͼƬ���ü��м���XY
//		 * @param kuan
//		 * @param initX	��ʼ0
//		 * @param initY ��ʼ0
//		 * @param x	ͼƬ֮����
//		 * @param y ͼƬ֮����
//		 * 
//		 */
//		public static void imageRandPut(int initNum,String []name,int lie,int kuan,int initX,int initY,int x,int y)
//		{
//			/*
//			 * ʹ��I���������жϷ����˶�������
//			 * ʹ������R������ʹ�ù��������
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
//				 * ��������ڵ��ļ��Ƿ������
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
		 * �Ƿ���ʾͼƬ
		 * @param imagesNum ͼƬ���
		 * @param bool true��ʾ��false����ʾ
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
		 * ��ȡͼƬ��
		 * @param imagesNum ͼƬ���
		 * @return
		 */
		public static int getImageHeight(int imagesNum)
		{
			return GameCore.getImageHeight(imagesNum);
		}
		/**
		 * ��ȡͼƬ��
		 * @param imagesNum ͼƬ���
		 * @return
		 */
		public static int getImagesWidth(int imagesNum)
		{
			return GameCore.getImageWidth(imagesNum);
		}
}
