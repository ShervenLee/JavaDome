package ryan;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseEvent;

public class MouseObject
{
	private Robot robot = null;
	private Integer sleppTime = 0;
	private boolean exit = false;
	
	public boolean isExit()
	{
		return exit;
	}

	public void setExit(boolean exit)
	{
		this.exit = exit;
	}

	public Integer getTime()
	{
		return sleppTime;
	}

	public void setTime(Integer time)
	{
		this.sleppTime = time;
	}

	public MouseObject()
	{
		try
		{
			robot = new Robot();
		} catch (AWTException e)
		{
			newRobot();
		}
	}

	private void newRobot()
	{
		try
		{
			robot = new Robot();
		} catch (AWTException e)
		{
			newRobot();
		}
	}

	public void liftDownUp()
	{
		if (exit)
		{
			return;
		}
		robot.mousePress(MouseEvent.BUTTON1_MASK);
		try
		{
			Thread.sleep(sleppTime);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		robot.mouseRelease(MouseEvent.BUTTON1_MASK);
	}

	public void rightDownUp()
	{
		if (exit)
		{
			return;
		}
		robot.mousePress(MouseEvent.BUTTON3_MASK);
		try
		{
			Thread.sleep(sleppTime);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		robot.mouseRelease(MouseEvent.BUTTON3_MASK);
	}

	public void liftDown()
	{
		if (exit)
		{
			return;
		}
		robot.mousePress(MouseEvent.BUTTON1_MASK);
	}

	public void rightDown()
	{
		if (exit)
		{
			return;
		}
		robot.mousePress(MouseEvent.BUTTON3_MASK);
	}

	public void liftUp()
	{
		if (exit)
		{
			return;
		}
		robot.mouseRelease(MouseEvent.BUTTON1_MASK);
	}

	public void rightUp()
	{
		if (exit)
		{
			return;
		}
		robot.mouseRelease(MouseEvent.BUTTON3_MASK);
	}

	public void move(Integer x, Integer y)
	{
		robot.mouseMove(x, y);
	}
}
