package ryan;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Mainframe {
	private JFrame jFrame = null;
	private JLabel tip = null;
	private JLabel cmLabel = null;
	private JLabel kgLabel = null;
	private JLabel bmiLabel = null;
	private JTextField cmTextField = null;
	private JTextField kgTextField = null;
	private JTextField bmiTextField = null;
	private JButton calc = null;
	private JButton clear = null;

	public Mainframe() {
		jFrame = new JFrame("BMI计算器");
		jFrame.setBounds(450, 200, 300, 400);
		jFrame.setResizable(false);
		jFrame.setDefaultCloseOperation(3);
		jFrame.setLayout(null);
		init();
		jFrame.setVisible(true);
	}

	private void init() {
		int xJLabel = 50;
		int yJLabel = 10;
		int yJlabelZ = 60;
		int xTextField = 150;
		int yTextField = 110;
		int yTextFieldZ = 60;
		int xJButton = 40;
		int xJButtonZ = 110;
		int yJButton = 300;
		tip = new JLabel("请输入数值：");
		tip.setBounds(xJLabel, yJLabel, 100, 100);
		yJLabel += yJlabelZ;
		cmLabel = new JLabel("身高-CM");
		cmLabel.setBounds(xJLabel, yJLabel, 100, 100);
		yJLabel += yJlabelZ;
		kgLabel = new JLabel("体重-KG");
		kgLabel.setBounds(xJLabel, yJLabel, 100, 100);
		yJLabel += yJlabelZ;
		bmiLabel = new JLabel("BMI-KG/CM^2");
		bmiLabel.setBounds(xJLabel, yJLabel, 100, 100);
		yJLabel += yJlabelZ;
		cmTextField = new JTextField();
		cmTextField.setBounds(xTextField, yTextField, 100, 30);
		yTextField += yTextFieldZ;
		kgTextField = new JTextField();
		kgTextField.setBounds(xTextField, yTextField, 100, 30);
		yTextField += yTextFieldZ;
		bmiTextField = new JTextField();
		bmiTextField.setBounds(xTextField, yTextField, 100, 30);
		yTextField += yTextFieldZ;
		bmiTextField.setEditable(false);
		calc = new JButton("计算");
		calc.setBounds(xJButton, yJButton, 100, 50);
		xJButton += xJButtonZ;
		clear = new JButton("清除");
		clear.setBounds(xJButton, yJButton, 100, 50);
		jFrame.add(tip);
		jFrame.add(cmLabel);
		jFrame.add(kgLabel);
		jFrame.add(bmiLabel);
		jFrame.add(cmTextField);
		jFrame.add(kgTextField);
		jFrame.add(bmiTextField);
		jFrame.add(calc);
		jFrame.add(clear);
	}

	public JTextField getCmTextField() {
		return cmTextField;
	}

	public JTextField getKgTextField() {
		return kgTextField;
	}

	public JTextField getBmiTextField() {
		return bmiTextField;
	}

	public JButton getCalc() {
		return calc;
	}

	public JButton getClear() {
		return clear;
	}

}
