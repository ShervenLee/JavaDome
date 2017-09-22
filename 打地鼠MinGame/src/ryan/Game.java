package ryan;

import javax.swing.JPanel;

public class Game implements Runnable
{

	private MouseClass mouseClass[] = new MouseClass[9];
	private JPanel jPanel;
	MainIterface mainIterface;
	public Game(MainIterface mainIterface)
	{
		this.mainIterface=mainIterface;
		this.jPanel=this.mainIterface.getGameInterfaceJpanel();
		this.jPanel=jPanel;
		int x=80,y=170;
		for (int i = 0; i < 9; i++)
		{
			mouseClass[i] = new MouseClass();
			mouseClass[i].setPosition(x,y);
			mouseClass[i].addPanel(jPanel);
			x+=40;y+=30;
		}
		this.jPanel.repaint();
		this.jPanel.updateUI();
		this.jPanel.setVisible(true);
		this.mainIterface.getGameMainInterface().setVisible(true);
	}

	@Override
	public void run()
	{
		
	}

}
