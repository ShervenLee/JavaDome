package ryan;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseClass
{
	private Integer x = 0, y = 0;
	private String imageAdd = null;
	private ImageIcon mouseIcon = null;
	private boolean isv = false;
	private JLabel mouseLabel = new JLabel();

	public JLabel getMouseLabel()
	{
		return mouseLabel;
	}

	public MouseClass()
	{
		imageAdd = System.getProperty("user.dir");// user.dir指定了当前的路径
		imageAdd += "\\src\\";
		imageAdd += "image/mouse.png";
		mouseIcon = new ImageIcon(imageAdd);
		mouseLabel.setIcon(mouseIcon);
	}

	public void addPanel(JPanel jPanel)
	{
		jPanel.add(mouseLabel);
		mouseLabel.setLocation(x, y);
		mouseLabel.setVisible(isIsv());
	}

	public boolean isIsv()
	{
		return isv;
	}

	public void setIsv(boolean isv)
	{
		this.isv = isv;
	}

	public void setPosition(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
