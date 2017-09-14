package ryanGame2048;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class MainFrame extends JFrame
{
	private JPanel upJPanel;
	private JPanel downJPanel;
	public MainFrame()
	{
		init();// 窗口初始化
	}

	/**
	 * 窗口的初始化
	 */
	private void init()
	{
		// 设置主窗口可见性
		this.setVisible(true);
		// 设置游戏主窗口的大小
		this.setSize(500, 500);
		// 设置主窗口的标题
		this.setTitle("2048    Game");// 使用\t是不能增加窗口标题中字符间的距离的
		// 设置主窗口在屏幕上初始化显示的位置
		this.setLocation(300, 100);
		//设置点击关闭按钮则一起关闭进程
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 游戏窗口布局方法
		gameLayout();
	}

	/**
	 * 游戏窗口布局（上下两部分，上：游戏菜单栏，下：游戏最主要界面）
	 */
	private void gameLayout()
	{
		// 设置布局格式为依次放置
		this.setLayout(null);
		// -----------------------------创建上部工具栏面板
		upJPanel = new JPanel();
		//设置上部面板布局格式
		upJPanel.setLayout(null);
		// 设置upJPanel面板的大小
		upJPanel.setSize(this.getWidth(), 50);
		//设置位置
		upJPanel.setLocation(0, 0);
		// 设置可见性
		upJPanel.setVisible(true);
		// 设置背景色彩
		upJPanel.setBackground(Color.blue);
		//设置上部面板的内容组件
		upJPanelContent();

		// 添加到主窗口中区
		this.add(upJPanel);
		// -----------------------------创建下部游戏面板
		downJPanel = new JPanel();
		// 设置upJPanel面板的大小
		downJPanel.setSize(this.getWidth(), this.getHeight()-upJPanel.getHeight());
		//设置面板位置
		downJPanel.setLocation(0, upJPanel.getHeight());
		//设置上部面板布局格式
		downJPanel.setLayout(new BorderLayout());
		// 设置可见性
		downJPanel.setVisible(true);
		// 设置背景色彩
		downJPanel.setBackground(Color.pink);
		// 添加到主窗口中区
		this.add(downJPanel);
	}
	private void upJPanelContent()
	{
		
		
		JPanel upinJPanel = new JPanel();// 创建面板
		upinJPanel.setSize(this.getWidth(), upJPanel.getWidth());// 设置大小
		upinJPanel.setLocation(0, 0);// 设置位置
		upinJPanel.setVisible(true);// 设置是否可显示
		upinJPanel.setBorder(new TitledBorder("选项区"));// 设置边框，并置文字内容
		upinJPanel.setBackground(Color.blue);//设置背景颜色为粉色
		upinJPanel.setLayout(null);//设置布局格式为null
		upJPanel.add(upinJPanel);	
		
		//创建游戏开始按钮
		JButton start=new JButton();
		start.setText("Start");
		start.setBackground(Color.pink);
		start.setVisible(true);
		start.setBounds(80, 15, 100, 30);
		upinJPanel.add(start);//添加到上部面板中
		
//		JButton jButton=new JButton("s");
//		jButton.setBounds(200, 15, 100, 30);
//		upinJPanel.add(jButton);
		
		
		//创建游戏分数文本
		try{
		JTextField score=new JTextField();
		score.setText("Score:0");
		score.setBackground(Color.red);
		//score.setBounds(400, 15, 200, 30);
		score.setBackground(Color.red);
		downJPanel.add(score,BorderLayout.CENTER);
		}catch(Exception e){JButton jButton=new JButton("s");
		jButton.setBounds(200, 15, 100, 30);
		upinJPanel.add(jButton);}
		
		
	}
}
