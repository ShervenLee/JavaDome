package com.Ryan;
public final class Count
{
	/*
	 * 创建单例模式，只能创建出一个计数器的实例
	 */
	private static Count count = new Count();// 当被调用时自动创建一个Count对象
	// 因为是static修饰的Count变量，所以只会自动创建一次，保证了单例的实现
	private static int cou = 0;// 用于计数

	/**
	 * 获得计数器
	 * 
	 * @return 返回计数器
	 */
	protected static Count getCount()
	{
		return count;
	}

	private Count()
	{
		/*
		 * 设置成私有的构造方法 避免别人再创建一个Count对象
		 */
	}

	/**
	 * 计数器中的数字自增1
	 */
	protected void countAdd()
	{
		cou++;
	}

	/**
	 * 获取计数器现在的数字
	 * 
	 * @return 返回数字
	 */
	protected int getCountNumber()
	{
		return cou;
	}
}
