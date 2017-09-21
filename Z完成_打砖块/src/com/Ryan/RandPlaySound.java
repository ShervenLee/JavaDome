package com.Ryan;

import com.rupeng.game.GameCore;

public class RandPlaySound
{
	private static String randSound[]=
		{"piano1.mp3","piano2.mp3","piano3.mp3","piano4.mp3",
				"piano5.mp3","piano6.mp3","piano7.mp3",};
	public static void run()
	{
		GameCore.playSound(randSound[GameCore.rand(0, randSound.length)], false);
	}
}
