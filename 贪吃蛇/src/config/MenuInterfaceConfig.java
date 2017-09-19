package config;

public class MenuInterfaceConfig
{
	private static String menuStartButtonIsVisible="true", menuHelpButtonIsVisible="true", menuExitButtonIsVisible="true";
	public static  String getMenuStartButtonIsVisible()
	{
		return menuStartButtonIsVisible;
	}

	public static void setMenuStartButtonIsVisible(String TrueOrFalse)
	{
		menuStartButtonIsVisible = TrueOrFalse;
	}

	public static String getMenuHelpButtonIsVisible()
	{
		return menuHelpButtonIsVisible;
	}

	public static void setMenuHelpButtonIsVisible(String TrueOrFalse)
	{
		menuHelpButtonIsVisible = TrueOrFalse;
	}

	public static String getMenuExitButtonIsVisible()
	{
		return menuExitButtonIsVisible;
	}

	public static void setMenuExitButtonIsVisible(String TrueOrFalse)
	{
		menuExitButtonIsVisible = TrueOrFalse;
	}
}
