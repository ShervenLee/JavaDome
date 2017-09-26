package 随机事件选择器;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MainInterface extends JFrame
{
	JTextField min = null;
	JTextField max = null;
	JTextField end = null;

	public MainInterface()
	{
		this.setTitle("随机事件选择器");
		this.setSize(350, 150);
		this.setLocation(350, 250);
		this.setDefaultCloseOperation(3);
		Init();
		this.setVisible(true);
	}

	private void Init()
	{
		JPanel jPanel = new JPanel();
		jPanel.setLayout(null);
		JLabel startNum = new JLabel("StartNum");
		startNum.setBounds(20, 10, 80, 60);
		JLabel endNum = new JLabel("EndNum");
		endNum.setBounds(20, 10 + 50, 80, 60);
		JButton start = new JButton("Start");
		start.setBounds(this.getWidth() / 2 + 60, 30, 70, 70);
		JLabel ending = new JLabel("结果");
		ending.setBounds(180, 10, 60, 30);
		jPanel.add(ending);
		jPanel.add(start);
		jPanel.add(endNum);
		jPanel.add(startNum);
		
		min=new JTextField("0");
		min.setBounds(90, 30, 60, 30);
		max=new JTextField("0");
		max.setBounds(90, 30+40, 60, 30);
		end=new JTextField();
		end.setBounds(170, 40, 60, 60);
		end.setEditable(false);
		end.setHorizontalAlignment(JTextField.CENTER);
		end.setOpaque(false);//设置透明
		end.setBorder(null);//设置无边框
		jPanel.add(min);
		jPanel.add(max);
		jPanel.add(end);
		start.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Integer min=0,max=0,end=0;
				if(MainInterface.this.min.getText().equals(""))
				{
					MainInterface.this.end.setText("Input Err");
					return;
				}
				else
				{
					min=Integer.parseInt(MainInterface.this.min.getText());
				}
				if(MainInterface.this.max.getText().equals(""))
				{
					MainInterface.this.end.setText("Input Err");
					return;
				}
				else
				{
					max=Integer.parseInt(MainInterface.this.max.getText());
				}
				if(min!=Math.min(min, max))
				{
					min=min^max;
					max=min^max;
					min=min^max;
				}
				do
				{
					end=(int) (Math.random()*10+min);
				}while(end>max);
				System.out.println(end);
				MainInterface.this.end.setText(end.toString());
			}
		});
		this.add(jPanel);
	}
}
