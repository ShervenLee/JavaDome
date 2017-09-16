package notePad;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class NotePadFile
{
	private JFileChooser jFileChooser = null;

	private void fileNameTitle()
	{
		String fileName = null;
		fileName = jFileChooser.getSelectedFile().getName();
		MainApp.Main.setTitle(fileName + " -NotePad");
		MainApp.Main.v();
	}

	void 新建()
	{
		jFileChooser = new JFileChooser();
		int v = jFileChooser.showOpenDialog(jFileChooser);
		switch (v)
		{
		case JFileChooser.CANCEL_OPTION:// 取消
			break;
		case JFileChooser.APPROVE_OPTION:// 打开、保存
			MainApp.fileName = jFileChooser.getSelectedFile().getPath();// 路径包含文件名称
			fileNameTitle();
			break;
		case JFileChooser.ERROR_OPTION:// 非正常关闭
			break;
		}
	}

	void 打开()
	{
		jFileChooser = new JFileChooser();
		int v = jFileChooser.showOpenDialog(jFileChooser);
		switch (v)
		{
		case JFileChooser.CANCEL_OPTION:// 取消
			break;
		case JFileChooser.APPROVE_OPTION:// 打开、保存
			MainApp.fileName = jFileChooser.getSelectedFile().getPath();// 路径包含文件名称
			break;
		case JFileChooser.ERROR_OPTION:// 非正常关闭
			break;
		}
		FileReader fileReader = null;
		try
		{
			fileReader = new FileReader(MainApp.fileName);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int ch = 0;
		String str = null;
		try
		{
			while ((ch = fileReader.read()) != -1)
			{
				str = Integer.toString((char) ch);
				MainApp.Main.setStr(str);
			}
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileNameTitle();
	}

	void 保存()
	{
		if (MainApp.fileName != null)
		{
			FileWriter fileWriter = null;
			try
			{
				fileWriter = new FileWriter(MainApp.fileName);
			} catch (IOException e)
			{
				e.printStackTrace();
			}

			try
			{
				if (fileWriter != null)
				{
					fileWriter.write(MainApp.Main.getStr());
				}
				for (int i = 0; i < 3; i++)
					fileWriter.flush();
				fileWriter.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		} else
		{
			jFileChooser = new JFileChooser();
			int v = jFileChooser.showOpenDialog(jFileChooser);
			switch (v)
			{
			case JFileChooser.CANCEL_OPTION:// 取消
				break;
			case JFileChooser.APPROVE_OPTION:// 打开、保存
				MainApp.fileName = jFileChooser.getSelectedFile().getPath();// 路径包含文件名称
				break;
			case JFileChooser.ERROR_OPTION:// 非正常关闭
				break;
			}
			保存();
		}
		fileNameTitle();
	}

	void 另存()
	{
		jFileChooser = new JFileChooser();
		int v = jFileChooser.showOpenDialog(jFileChooser);
		switch (v)
		{
		case JFileChooser.CANCEL_OPTION:// 取消
			break;
		case JFileChooser.APPROVE_OPTION:// 打开、保存
			MainApp.fileName = jFileChooser.getSelectedFile().getPath();// 路径包含文件名称
			break;
		case JFileChooser.ERROR_OPTION:// 非正常关闭
			break;
		}
		保存();
	}
}
