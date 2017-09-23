package mainInterface;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import toolKitInterface.ToolKitInterface;

public class MainInterface extends JFrame implements Runnable
{
	private Integer mainInterfaceWidth = 0, mainInterfaceHeight = 0;
	private JLabel imageLabel;
	private BufferedImage bi;

	public MainInterface()
	{
		mainInterfaceWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
		mainInterfaceHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setUndecorated(true);// 设置无边框(Undecorated)未加装饰的，简朴的
		this.getContentPane().setLayout(null);
		this.setTitle("截屏工具");
		this.setSize(mainInterfaceWidth, mainInterfaceHeight);
		this.setLocation(0, 0);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		imageLabel = new JLabel();
		imageLabel.setLocation(0, 0);
		this.getContentPane().add(imageLabel);
		imageInit();
		this.setVisible(true);
	}

	private void imageInit()
	{
		Robot robot = null;
		try
		{
			robot = new Robot();
		} catch (AWTException e1)
		{
			e1.printStackTrace();
		}
		mainInterfaceWidth = this.getSize().width;
		mainInterfaceHeight = this.getSize().height;
		bi = robot.createScreenCapture(new Rectangle(0, 0, mainInterfaceWidth, mainInterfaceHeight));
		robot = null;
		System.gc();
		new Thread(new ToolKitInterface(this)).start();

		this.getContentPane().setSize(this.getSize());
		this.getImageLabel().setSize(mainInterfaceWidth, mainInterfaceHeight);
		this.getImageLabel().setIcon(new ImageIcon(bi));
		this.validate();
		this.repaint();

	}

	@Override
	public void run()
	{

	}

	public int getWidth()
	{
		return mainInterfaceWidth;
	}

	public void setWidth(Integer width)
	{
		this.mainInterfaceWidth = width;
	}

	public int getHeight()
	{
		return mainInterfaceHeight;
	}

	public void setHeight(Integer height)
	{
		this.mainInterfaceHeight = height;
	}

	public BufferedImage getBi()
	{
		return bi;
	}

	public JLabel getImageLabel()
	{
		return imageLabel;
	}
}
