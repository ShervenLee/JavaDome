package ryan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainIterface
{
	// game main interface statement(����)
	private JFrame gameMainInterface = null;
	public JFrame getGameMainInterface()
	{
		return gameMainInterface;
	}
	private JPanel gameInterfaceJpanel = null;
	String imageAdd=null;
	public MainIterface()
	{
		imageAdd=System.getProperty("user.dir");//user.dirָ���˵�ǰ��·�� 
		imageAdd+="\\src\\";
		ImageIcon mouseImage=new ImageIcon(imageAdd+"image/mouse.png");
		gameMainInterface = new JFrame("�����MinGame");
		Dimension /* �ߴ磬���泤����� */ screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Integer x = (Integer) screenSize.width / 5;
		Integer y = (Integer) screenSize.height / 5-100;
//		Integer width = (Integer) screenSize.width - x * 2;
		//Integer height = (Integer) screenSize.height - y * 2;
		Integer width = 512;
		Integer height = 512+40;
		gameMainInterface.setBounds(x, y, width, height);
		gameMainInterface.setDefaultCloseOperation(3);
		// gameInterface.setLayout(null);// Set null layout
		//gameMainInterface.setResizable(false);// Set no edit window size
		// {// ���������ɫ
		// gameInterface.getContentPane().setBackground(Color.pink);
		// gameInterface.setBackground(Color.blue);
		// //gameInterface.getContentPane().setVisible(true);
		// }
		{// �������ͼƬ����
			gameInterfaceJpanel=new JPanel();
			gameInterfaceJpanel.setLayout(null);
			gameInterfaceJpanel.setBackground(new Color(10, 182, 250));
			JLabel bgLabel=new JLabel();
			bgLabel.setIcon(new ImageIcon(imageAdd+"image/BG.jpg"));
			bgLabel.setBounds(0, 0, 512,512);
			gameInterfaceJpanel.add(bgLabel);
			gameMainInterface.add(gameInterfaceJpanel);
		}
		//gameMainInterface.setVisible(true);
	}
	public JPanel getGameInterfaceJpanel()
	{
		return gameInterfaceJpanel;
	}
}
