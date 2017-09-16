package notePad;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Help
{
	public Help(String itm)
	{
		JFrame help = new JFrame("帮助");
		help.setSize(500, 400);
		help.setLocation(MainApp.Main.getX() + 300, MainApp.Main.getY() + 200);
		help.setResizable(false);//设置窗口不可以调整
		help.setLayout(null);
		// 创建设置两个标签
		JLabel a = new JLabel("关于");
		a.setSize(100,100);
		a.setLocation( 150,  100);
		a.setVisible(false);
		JLabel b = new JLabel("帮助文档");
		b.setSize(100,100);
		b.setLocation(150, 100);
		b.setVisible(false);
		help.add("a", a);// 字符a为别名
		help.add("b", b);
		// 指定显示的标签
		if (itm.equals("帮助文档"))
		{
			help.setTitle("帮助文档");
			b.setVisible(true);
			a.setVisible(false);
		} else
		{
			help.setTitle("关于");
			a.setVisible(true);
			b.setVisible(false);
		}
		help.setVisible(true);
	}
}
