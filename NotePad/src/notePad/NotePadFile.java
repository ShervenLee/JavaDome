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

	void �½�()
	{
		jFileChooser = new JFileChooser();
		int v = jFileChooser.showOpenDialog(jFileChooser);
		switch (v)
		{
		case JFileChooser.CANCEL_OPTION:// ȡ��
			break;
		case JFileChooser.APPROVE_OPTION:// �򿪡�����
			MainApp.fileName = jFileChooser.getSelectedFile().getPath();// ·�������ļ�����
			fileNameTitle();
			break;
		case JFileChooser.ERROR_OPTION:// �������ر�
			break;
		}
	}

	void ��()
	{
		jFileChooser = new JFileChooser();
		int v = jFileChooser.showOpenDialog(jFileChooser);
		switch (v)
		{
		case JFileChooser.CANCEL_OPTION:// ȡ��
			break;
		case JFileChooser.APPROVE_OPTION:// �򿪡�����
			MainApp.fileName = jFileChooser.getSelectedFile().getPath();// ·�������ļ�����
			break;
		case JFileChooser.ERROR_OPTION:// �������ر�
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

	void ����()
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
			case JFileChooser.CANCEL_OPTION:// ȡ��
				break;
			case JFileChooser.APPROVE_OPTION:// �򿪡�����
				MainApp.fileName = jFileChooser.getSelectedFile().getPath();// ·�������ļ�����
				break;
			case JFileChooser.ERROR_OPTION:// �������ر�
				break;
			}
			����();
		}
		fileNameTitle();
	}

	void ���()
	{
		jFileChooser = new JFileChooser();
		int v = jFileChooser.showOpenDialog(jFileChooser);
		switch (v)
		{
		case JFileChooser.CANCEL_OPTION:// ȡ��
			break;
		case JFileChooser.APPROVE_OPTION:// �򿪡�����
			MainApp.fileName = jFileChooser.getSelectedFile().getPath();// ·�������ļ�����
			break;
		case JFileChooser.ERROR_OPTION:// �������ر�
			break;
		}
		����();
	}
}
