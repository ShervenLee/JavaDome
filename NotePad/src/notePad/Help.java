package notePad;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Help
{
	public Help(String itm)
	{
		JFrame help = new JFrame("����");
		help.setSize(500, 400);
		help.setLocation(MainApp.Main.getX() + 300, MainApp.Main.getY() + 200);
		help.setResizable(false);//���ô��ڲ����Ե���
		help.setLayout(null);
		// ��������������ǩ
		JLabel a = new JLabel("����");
		a.setSize(100,100);
		a.setLocation( 150,  100);
		a.setVisible(false);
		JLabel b = new JLabel("�����ĵ�");
		b.setSize(100,100);
		b.setLocation(150, 100);
		b.setVisible(false);
		help.add("a", a);// �ַ�aΪ����
		help.add("b", b);
		// ָ����ʾ�ı�ǩ
		if (itm.equals("�����ĵ�"))
		{
			help.setTitle("�����ĵ�");
			b.setVisible(true);
			a.setVisible(false);
		} else
		{
			help.setTitle("����");
			a.setVisible(true);
			b.setVisible(false);
		}
		help.setVisible(true);
	}
}
