package mainApp;

import mainInterface.MainInterface;

public class MainApp
{

	public static void main(String[] args)
	{
		MainInterface m = new MainInterface();
		new Thread(m).start();
	}

}
