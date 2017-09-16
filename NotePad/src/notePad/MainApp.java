package notePad;

public class MainApp
{
	public static String fileName = null;
	public static MainFrame Main = null; // 定义主面板

	public static void main(String[] args)
	{
		// 创建主面板
		Main = new MainFrame("无标题" + " - NotePad");
	}
}
