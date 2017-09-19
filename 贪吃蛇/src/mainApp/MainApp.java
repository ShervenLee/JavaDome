package mainApp;

import gameInterface.MenuInterface;

public class MainApp
{
	private static MenuInterface menuInterface;
	public static MenuInterface getMenuInterface()
	{
		return menuInterface;
	}
	public static void main(String[] args)
	{
		menuInterface=new  MenuInterface();
	}

}
