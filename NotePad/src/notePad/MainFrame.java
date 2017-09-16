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
	public JFrame mainJFrame;// ���������
	private JPanel menuP;// ����˵����
	private JTextArea jTextArea;// �����ı���
	private String str = null;// �ı�������

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

	// ���캯��
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
		mainJFrame.add(menuP);// ���˵������ӵ��������
		mainJFrame.add(jTextArea);// ��ӵ��������
		mainJFrame.setVisible(true);// �������ɼ�������������棬һ����ӵ�������ܼ�ʱ��ʾ������
	}

	private void menuInit()
	{
		JMenuBar menuBar;// �˵���
		menuP = new JPanel(new FlowLayout(0));// �����˵���岢������Ϊ����룬0��1��2��
		menuP.setBounds(0, 0, mainJFrame.getWidth(), 30);
		menuBar = new JMenuBar();// �����˵���
		// �����˵�
		String[] menuLab = { "�ļ�", "�༭", "����", "�鿴" };
		String[][] menuItemLab = { { "�½�", "��", "����", "���", "�˳�" }, { "����", "�滻" }, { "����", "�����ĵ�" }, { "�����С" } };
		JMenu �ļ� = new JMenu(menuLab[0]);
		JMenu �༭ = new JMenu(menuLab[1]);
		JMenu �鿴 = new JMenu(menuLab[3]);
		JMenu ���� = new JMenu(menuLab[2]);
		menuBar.add(�ļ�);
		menuBar.add(�༭);
		menuBar.add(�鿴);
		menuBar.add(����);
		// �����˵���
		{

			{// �ļ��˵�
				JMenuItem �½� = new JMenuItem(menuItemLab[0][0]);
				JMenuItem �� = new JMenuItem(menuItemLab[0][1]);
				JMenuItem ���� = new JMenuItem(menuItemLab[0][2]);
				JMenuItem ��� = new JMenuItem(menuItemLab[0][3]);
				JMenuItem �˳� = new JMenuItem(menuItemLab[0][4]);
				�ļ�.add(�½�);
				�ļ�.addSeparator();
				�ļ�.add(��);
				�ļ�.addSeparator();
				�ļ�.add(����);
				�ļ�.addSeparator();
				�ļ�.add(���);
				�ļ�.addSeparator();
				�ļ�.add(�˳�);
				�½�.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						notePadFile.�½�();
					}
				});
				��.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						notePadFile.��();

					}
				});
				����.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						notePadFile.����();

					}
				});
				���.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						notePadFile.���();

					}
				});
				�˳�.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						// �Ƿ�û�б��棬�����жϡ�����
						// �˳�
						System.exit(0);
					}
				});
			}
			{
				// �༭�˵�
				JMenuItem ���� = new JMenuItem(menuItemLab[1][0]);
				JMenuItem �滻 = new JMenuItem(menuItemLab[1][1]);
				�༭.add(����);
				�༭.addSeparator();
				�༭.add(�滻);
				����.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						notePadEdit.����();

					}
				});
				�滻.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						notePadEdit.�滻();

					}
				});
			}
			{
				// �鿴�˵�
				JMenuItem �����С = new JMenuItem(menuItemLab[3][0]);
				�鿴.add(�����С);
				�����С.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						int size = 17;
						String tem = JOptionPane.showInputDialog("���������С,��Χ[1-100].");
						for (int i = 0; i < tem.length(); i++)
						{
							char ch = tem.charAt(i);
							if (ch < '0' || ch > '9')
							{
								JOptionPane.showMessageDialog(null, "��������ע�ⷶΧ��");
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
				// �����˵�
				JMenuItem ���� = new JMenuItem(menuItemLab[2][0]);
				JMenuItem �����ĵ� = new JMenuItem(menuItemLab[2][1]);
				����.add(����);
				����.addSeparator();
				����.add(�����ĵ�);
				����.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						new Help("����");

					}
				});
				�����ĵ�.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e)
					{
						new Help("�����ĵ�");

					}
				});
			}
		}

		// ��Ӳ˵���嵽��������
		menuP.add(menuBar);// ���˵�����ӵ��˵������
	}

	private void textInit()
	{
		// �����ı���
		jTextArea = new JTextArea();
		// �����ı����С��λ��
		jTextArea.setBounds(0, 30, mainJFrame.getWidth(), mainJFrame.getHeight());
		jTextArea.setEditable(true);
		jTextArea.setForeground(new Color(92, 119, 64)); // ������ɫ
		setFontSize(17);
	}

	/**
	 * 
	 * @param size
	 *            �����С��int�͡�
	 */
	private void setFontSize(int size)
	{
		Font x = new Font("Serif", 0, size);
		jTextArea.setFont(x);
	}
}
