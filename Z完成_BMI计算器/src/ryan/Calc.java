package ryan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Calc implements Runnable {
	private Double cm = null;
	private Double kg = null;
	private Double bmi = null;
	private Mainframe mainframe = null;

	public void run() {
		mainframe.getCalc().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calc();
			}
		});
		mainframe.getClear().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainframe.getBmiTextField().setText("");
				mainframe.getKgTextField().setText("");
				mainframe.getCmTextField().setText("");
			}
		});
	}

	public Calc(Mainframe mainframe) {
		this.mainframe = mainframe;
	}

	private void calc() {
		try {
			cm = Double.parseDouble(mainframe.getCmTextField().getText());
			kg = Double.parseDouble(mainframe.getKgTextField().getText());
		} catch (Exception e) {
			mainframe.getBmiTextField().setText("输入有误！");
			return;
		}
		bmi = kg / (Math.pow(cm/100, 2));
		//转化精度
		DecimalFormat format = new DecimalFormat("#.00");
		bmi=Double.parseDouble(format.format(bmi));
		
		
		if (bmi < 18.5) {
			mainframe.getBmiTextField().setText(bmi.toString() + "  偏瘦");
		} else {
			if (bmi < 23.9) {
				mainframe.getBmiTextField().setText(bmi.toString() + "  正常");
			} else {
				if (bmi < 28) {
					mainframe.getBmiTextField().setText(bmi.toString() + "  偏胖");
				} else {
					if (bmi < 32) {
						mainframe.getBmiTextField().setText(bmi.toString() + "  肥胖");
					} else {
						mainframe.getBmiTextField().setText(bmi.toString() + "  非常肥胖");
					}
				}

			}
		}
	}
}
