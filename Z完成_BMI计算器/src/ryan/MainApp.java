package ryan;

public class MainApp {

	public static void main(String[] args) {
		Mainframe mainframe = new Mainframe();
		Calc calc = new Calc(mainframe);
		//����Calc���run()����
		Thread thread = new Thread(calc);
		thread.start();
	}

}
