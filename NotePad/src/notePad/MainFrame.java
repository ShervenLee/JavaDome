package notePad;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MainFrame extends JFrame
{
	NotePadFile notePadFile;
	NotePadEdit notePadEdit;
	public JFrame mainJFrame;// 定义主面板
	private JPanel menuP;// 定义菜单面板
	private JTextArea jTextArea;// 定义文本区
	private String str = null;// 文本框内容

	public void setTitle(String title)
	{
		mainJFrame.setTitle(title);
	}

	public void v()
	{
		mainJFrame.setVisible(true);
	}

	public String getStr()
	{
		this.str = jTextArea.getText();
		return str;
	}

	public void setStr(String str)
	{

		if (getStr() == null)
		{
			jTextArea.setText(str);
		} else
		{
			jTextArea.append(str);
		}
	}

	// 构造函数
	MainFrame(String name)
	{
		notePadEdit = new NotePadEdit();
		notePadFile = new NotePadFile();
		mainJFrame = new JFrame(name);
		mainJFrame.setBounds(150, 100, 1000, 600);
		mainJFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainJFrame.setLayout(null);
		menuInit();
		textInit();
		mainJFrame.add(menuP);// 将菜单面板添加到主面板中
		mainJFrame.add(jTextArea);// 添加到主面板中
		mainJFrame.setVisible(true);// 将主面板可见语句放置在最后面，一面添加的组件不能及时显示出来！
	}

	private void menuInit()
	{
		JMenuBar menuBar;// 菜单栏
		menuP = new JPanel(new FlowLayout(0));// 创建菜单面板并且设置为左对齐，0左1中2右
		menuP.setBounds(0, 0, mainJFrame.getWidth(), 30);
		menuBar = new JMenuBar();// 创建菜单栏
		// 创建菜单
		String[] menuLab = { "文件", "编辑", "帮助", "查看" };
		String[][] menuItemLab = { { "新建", "打开", "保存", "另存", "退出" }, { "查找", "替换" }, { "关于", "帮助文档" }, { "字体大小" } };
		JMenu 文件 = new JMenu(menuLab[0]);
		JMenu 编辑 = new JMenu(menuLab[1]);
		JMenu 查看 = new JMenu(menuLab[3]);
		JMenu 帮助 = new JMenu(menuLab[2]);
		menuBar.add(文件);
		menuBar.add(编辑);
		menuBar.add(查看);
		menuBar.add(帮助);
		// 创建菜单项
		{

			{// 文件菜单
				JMenuItem 新建 = new JMenuItem(menuItemLab[0][0]);
				JMenuItem 打开 = new JMenuItem(menuItemLab[0][1]);
				JMenuItem 保存 = new JMenuItem(menuItemLab[0][2]);
				JMenuItem 另存 = new JMenuItem(menuItemLab[0][3]);
				JMenuItem 退出 = new JMenuItem(menuItemLab[0][4]);
				文件.add(新建);
				文件.addSeparator();
				文件.add(打开);
				文件.addSeparator();
				文件.add(保存);
				文件.addSeparator();
				文件.add(另存);
				文件.addSeparator();
				文件.add(退出);
				新建.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						notePadFile.新建();
					}
				});
				打开.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						notePadFile.打开();

					}
				});
				保存.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						notePadFile.保存();

					}
				});
				另存.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						notePadFile.另存();

					}
				});
				退出.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						// 是否没有保存，做出判断、提醒
						// 退出
						System.exit(0);
					}
				});
			}
			{
				// 编辑菜单
				JMenuItem 查找 = new JMenuItem(menuItemLab[1][0]);
				JMenuItem 替换 = new JMenuItem(menuItemLab[1][1]);
				编辑.add(查找);
				编辑.addSeparator();
				编辑.add(替换);
				查找.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						notePadEdit.查找();

					}
				});
				替换.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						notePadEdit.替换();

					}
				});
			}
			{
				// 查看菜单
				JMenuItem 字体大小 = new JMenuItem(menuItemLab[3][0]);
				查看.add(字体大小);
				字体大小.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						int size = 17;
						String tem = JOptionPane.showInputDialog("输入字体大小,范围[1-100].");
						for (int i = 0; i < tem.length(); i++)
						{
							char ch = tem.charAt(i);
							if (ch < '0' || ch > '9')
							{
								JOptionPane.showMessageDialog(null, "输入有误，注意范围！");
								return;
							}
						}
						size = Integer.parseInt(tem);
						if (size < 1 || size > 100)
						{
							return;
						}
						setFontSize(size);
					}
				});
			}
			{
				// 帮助菜单
				JMenuItem 关于 = new JMenuItem(menuItemLab[2][0]);
				JMenuItem 帮助文档 = new JMenuItem(menuItemLab[2][1]);
				帮助.add(关于);
				帮助.addSeparator();
				帮助.add(帮助文档);
				关于.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						new Help("关于");

					}
				});
				帮助文档.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						new Help("帮助文档");

					}
				});
			}
		}

		// 添加菜单面板到主窗口中
		menuP.add(menuBar);// 将菜单栏添加到菜单面板中
	}

	private void textInit()
	{
		// 创建文本框
		jTextArea = new JTextArea();
		// 设置文本框大小，位置
		jTextArea.setBounds(0, 30, mainJFrame.getWidth(), mainJFrame.getHeight());
		jTextArea.setEditable(true);
		jTextArea.setForeground(new Color(92, 119, 64)); // 文字颜色
		setFontSize(17);
	}

	/**
	 * 
	 * @param size
	 *            字体大小，int型。
	 */
	private void setFontSize(int size)
	{
		Font x = new Font("Serif", 0, size);
		jTextArea.setFont(x);
	}
}
