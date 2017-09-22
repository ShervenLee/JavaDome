package ryan;

public class MainApp
{
	static MainIterface mainIterface = null;

	public static void main(String[] args)
	{
		mainIterface = new MainIterface();
		Game game=new Game(mainIterface);
		Thread thread=new Thread(game);
		thread.start();
		//mainIterface.getGameMainInterface().setVisible(true);
	}

}
