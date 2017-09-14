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
		init();// ���ڳ�ʼ��
	}

	/**
	 * ���ڵĳ�ʼ��
	 */
	private void init()
	{
		// ���������ڿɼ���
		this.setVisible(true);
		// ������Ϸ�����ڵĴ�С
		this.setSize(500, 500);
		// ���������ڵı���
		this.setTitle("2048    Game");// ʹ��\t�ǲ������Ӵ��ڱ������ַ���ľ����
		// ��������������Ļ�ϳ�ʼ����ʾ��λ��
		this.setLocation(300, 100);
		//���õ���رհ�ť��һ��رս���
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ��Ϸ���ڲ��ַ���
		gameLayout();
	}

	/**
	 * ��Ϸ���ڲ��֣����������֣��ϣ���Ϸ�˵������£���Ϸ����Ҫ���棩
	 */
	private void gameLayout()
	{
		// ���ò��ָ�ʽΪ���η���
		this.setLayout(null);
		// -----------------------------�����ϲ����������
		upJPanel = new JPanel();
		//�����ϲ���岼�ָ�ʽ
		upJPanel.setLayout(null);
		// ����upJPanel���Ĵ�С
		upJPanel.setSize(this.getWidth(), 50);
		//����λ��
		upJPanel.setLocation(0, 0);
		// ���ÿɼ���
		upJPanel.setVisible(true);
		// ���ñ���ɫ��
		upJPanel.setBackground(Color.blue);
		//�����ϲ������������
		upJPanelContent();

		// ��ӵ�����������
		this.add(upJPanel);
		// -----------------------------�����²���Ϸ���
		downJPanel = new JPanel();
		// ����upJPanel���Ĵ�С
		downJPanel.setSize(this.getWidth(), this.getHeight()-upJPanel.getHeight());
		//�������λ��
		downJPanel.setLocation(0, upJPanel.getHeight());
		//�����ϲ���岼�ָ�ʽ
		downJPanel.setLayout(new BorderLayout());
		// ���ÿɼ���
		downJPanel.setVisible(true);
		// ���ñ���ɫ��
		downJPanel.setBackground(Color.pink);
		// ��ӵ�����������
		this.add(downJPanel);
	}
	private void upJPanelContent()
	{
		
		
		JPanel upinJPanel = new JPanel();// �������
		upinJPanel.setSize(this.getWidth(), upJPanel.getWidth());// ���ô�С
		upinJPanel.setLocation(0, 0);// ����λ��
		upinJPanel.setVisible(true);// �����Ƿ����ʾ
		upinJPanel.setBorder(new TitledBorder("ѡ����"));// ���ñ߿򣬲�����������
		upinJPanel.setBackground(Color.blue);//���ñ�����ɫΪ��ɫ
		upinJPanel.setLayout(null);//���ò��ָ�ʽΪnull
		upJPanel.add(upinJPanel);	
		
		//������Ϸ��ʼ��ť
		JButton start=new JButton();
		start.setText("Start");
		start.setBackground(Color.pink);
		start.setVisible(true);
		start.setBounds(80, 15, 100, 30);
		upinJPanel.add(start);//��ӵ��ϲ������
		
//		JButton jButton=new JButton("s");
//		jButton.setBounds(200, 15, 100, 30);
//		upinJPanel.add(jButton);
		
		
		//������Ϸ�����ı�
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
