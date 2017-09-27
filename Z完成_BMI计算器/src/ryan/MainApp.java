package ryan;

public class MainApp {

	public static void main(String[] args) {
		Mainframe mainframe = new Mainframe();
		Calc calc = new Calc(mainframe);
		//启动Calc类的run()方法
		Thread thread = new Thread(calc);
		thread.start();
	}

}
