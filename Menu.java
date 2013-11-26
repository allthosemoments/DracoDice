public class Menu
{
	public static void printIntro()
	{
		System.out.println("\n== Welcome to DracoDice ==\n");
	}

	public static void printNavigation()
	{
		System.out.print("\n1. Play\n" +
			"2. Instructions\n" +
			"3. Backstory\n" +
			"4. About\n\n" +
			"0. Quit\n" + 
			"-> ");
	}

	public static void playerCountQuery()
	{
		System.out.print("How many people will be playing? (1 - 8)\n");
	}
}
