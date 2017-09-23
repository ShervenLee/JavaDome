package toolKitInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import mainInterface.MainInterface;

public class ToolKitInterface extends JFrame implements Runnable
{
	private JButton enter = null;
	private BufferedImage bi;
	private MainInterface mainInterface;

	public ToolKitInterface(MainInterface mainInterface)
	{
		this.mainInterface = mainInterface;
		this.setTitle("ToolKit");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(300, 150);
		this.setLocation(700, 500);
		this.setLayout(null);
		this.setAlwaysOnTop(true);// 设置面板一直在顶端
		Init();
		this.setVisible(true);
	}

	private void Init()
	{
		enter = new JButton("确认");
		enter.setBounds(20, 20, 80, 80);
		enter.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				bi = mainInterface.getBi();
				try
				{
					JFileChooser fileChooser=new JFileChooser();
					fileChooser.setFileSelectionMode(1);
					fileChooser.showSaveDialog(enter);
					String fileName="F:/Document And Settings2/RYan/Desktop/";
					fileName=fileChooser.getSelectedFile().toPath().toString();
					System.out.println(fileName);
					fileName+="/";
					File file = new File(fileName+"截图.png");
					while(file.isFile())
					{
						short i=0;
						file=new File(fileName+"截图"+"("+i+")"+".png");
						i++;
					}
					ImageIO.write(bi, "png", file);

				} catch (IOException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println("!");
				}
			}
		});
		this.add(enter);
	}

	@Override
	public void run()
	{
		// TODO Auto-generated method stub

	}
}
