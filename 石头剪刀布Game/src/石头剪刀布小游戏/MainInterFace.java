package 石头剪刀布小游戏;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainInterFace extends JFrame
{

	private JPanel contentPane;
	JLabel shitou = null, jiandao = null, bu = null, jieguo = null;
	String imageAdd=null;
	/**
	 * Create the frame.
	 */
	public MainInterFace()
	{
		imageAdd=System.getProperty("user.dir");//user.dir指定了当前的路径 
		imageAdd+="\\src\\";
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 309, 332);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 300, 300);
		contentPane.add(panel);
		panel.setLayout(null);

		shitou = new JLabel("shitou");
		shitou.setFont(new Font("SimSun", Font.PLAIN, 12));
		shitou.setBounds(10, 10, 85, 85);
		shitou.setIcon(new ImageIcon(imageAdd+"image\\shitou.png"));
		shitou.addMouseListener(new MouseListener()
		{

			@Override
			public void mouseReleased(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e)
			{
				win(1);

			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}
		});
		panel.add(shitou);

		jiandao = new JLabel("jiandao");
		jiandao.setFont(new Font("宋体", Font.PLAIN, 12));
		jiandao.setBounds(105, 10, 85, 85);
		jiandao.setIcon(new ImageIcon(imageAdd+"image\\jiandao.png"));
		jiandao.addMouseListener(new MouseListener()
		{

			@Override
			public void mouseReleased(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e)
			{
				// TODO Auto-generated method stub
				win(2);
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}
		});
		panel.add(jiandao);

		bu = new JLabel("bu");
		bu.setFont(new Font("宋体", Font.PLAIN, 12));
		bu.setBounds(200, 10, 85, 85);
		bu.setIcon(new ImageIcon(imageAdd+"image\\bu.png"));
		bu.addMouseListener(new MouseListener()
		{

			@Override
			public void mouseReleased(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e)
			{
				// TODO Auto-generated method stub
				win(3);
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}
		});
		panel.add(bu);

		jieguo = new JLabel("jieguo");
		jieguo.setFont(new Font("宋体", Font.PLAIN, 12));
		jieguo.setBounds(105, 146, 85, 85);
		panel.add(jieguo);
		this.setVisible(true);
	}

	/**
	 * 
	 * @param i
	 *            shitou->1 jiandao->2 bu->3
	 * @return
	 */
	private void setJieguoImages(int i)
	{
		if (i == 1)
		{
			jieguo.setIcon(new ImageIcon(imageAdd+"image\\shitou.png"));
		} else if (i == 2)
		{
			jieguo.setIcon(new ImageIcon(imageAdd+"image\\jiandao.png"));
		} else if (i == 3)
		{
			jieguo.setIcon(new ImageIcon(imageAdd+"image\\bu.png"));
		} else
		{

		}
		jieguo.repaint();
		this.repaint();
	}

	private void win(int i)
	{
		int j = (int) (Math.random() * 10 % 3);
		if (i == 1&&j==2)
		{
			donghua(j);
			System.out.println("win");
			return;
		}
		else
		if (i == 1&&j==3)
		{
			donghua(j);
			System.out.println("low");
			return;
		}else
		if (i == 1&&j==1)
		{
			donghua(j);
			System.out.println("pin");
			return;
		}else
		if (i == 2&&j==1)
		{
			donghua(j);
			System.out.println("low");
			return;
		}else
		if (i == 2&&j==2)
		{
			donghua(j);
			System.out.println("pin");
			return;
		}else
		if (i == 2&&j==3)
		{
			donghua(j);
			System.out.println("win");
			return;
		}else
		if (i == 3&&j==1)
		{
			donghua(j);
			System.out.println("win");
			return;
		}else
		if (i == 3&&j==2)
		{
			donghua(j);
			System.out.println("low");
			return;
		}else
		if (i == 3&&j==3)
		{
			donghua(j);
			System.out.println("pin");
			return;
		}
	}

	private void donghua(int i)
	{
		try
		{
			this.setJieguoImages(1);
			Thread.sleep(200);
			this.repaint();
			this.setJieguoImages(2);
			Thread.sleep(200);
			this.repaint();
			this.setJieguoImages(3);
			Thread.sleep(1);
			this.repaint();
			this.setJieguoImages(i);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}

	}
}
