package com.Ryan;
public final class Count
{
	/*
	 * ��������ģʽ��ֻ�ܴ�����һ����������ʵ��
	 */
	private static Count count = new Count();// ��������ʱ�Զ�����һ��Count����
	// ��Ϊ��static���ε�Count����������ֻ���Զ�����һ�Σ���֤�˵�����ʵ��
	private static int cou = 0;// ���ڼ���

	/**
	 * ��ü�����
	 * 
	 * @return ���ؼ�����
	 */
	protected static Count getCount()
	{
		return count;
	}

	private Count()
	{
		/*
		 * ���ó�˽�еĹ��췽�� ��������ٴ���һ��Count����
		 */
	}

	/**
	 * �������е���������1
	 */
	protected void countAdd()
	{
		cou++;
	}

	/**
	 * ��ȡ���������ڵ�����
	 * 
	 * @return ��������
	 */
	protected int getCountNumber()
	{
		return cou;
	}
}
