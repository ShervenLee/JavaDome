package gameInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import config.MenuInterfaceConfig;

public class MenuInterface extends JFrame
{
	private GameInterface gameInterface;
	private JPanel contentPane, panel;
	private JButton menuStartButton, menuHelpButton, menuExitButton;

	/**
	 * Create the frame.
	 */
	public MenuInterface()
	{
		setType(Type.UTILITY);
		setTitle("\u8D2A\u5403\u86C7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBounds(0, 0, 504, 480);
		contentPane.add(panel);
		panel.setLayout(null);

		menuStartButton = new JButton("\u5F00\u59CB");
		menuStartButton.setBounds(200, 140, 120, 40);
		panel.add(menuStartButton);

		menuHelpButton = new JButton("\u5E2E\u52A9");
		menuHelpButton.setBounds(200, 220, 120, 40);
		panel.add(menuHelpButton);

		menuExitButton = new JButton("\u9000\u51FA");
		menuExitButton.setBounds(200, 300, 120, 40);
		panel.add(menuExitButton);

		menuStartButtonAction();
		menuHelpButtonAction();
		menuExitButtonAction();
		this.setVisible(true);
	}

	private void menuStartButtonAction()
	{
		menuStartButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				MenuInterfaceConfig.setMenuStartButtonIsVisible("false");
				String s = MenuInterfaceConfig.getMenuStartButtonIsVisible();
				menuStartButton.setVisible(Boolean.parseBoolean(s));
				
				MenuInterfaceConfig.setMenuHelpButtonIsVisible("false");
				s=MenuInterfaceConfig.getMenuHelpButtonIsVisible();
				menuHelpButton.setVisible(Boolean.parseBoolean(s));
				
				MenuInterfaceConfig.setMenuExitButtonIsVisible("false");
				s= MenuInterfaceConfig.getMenuExitButtonIsVisible();
				menuExitButton.setVisible(Boolean.parseBoolean(s));
				
				gameInterface = new GameInterface();
				panel.add(gameInterface);
				panel.validate();
			}
		});
	}

	private void menuHelpButtonAction()
	{
		menuHelpButton.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "\n上下左右方向对应WSAD按键\n\n", "Help", JOptionPane.INFORMATION_MESSAGE);

			}
		});
	}

	private void menuExitButtonAction()
	{
		menuExitButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
	}
}
