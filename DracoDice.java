import java.util.Scanner;

public class DracoDice
{
	public static void main(String[] args)
	{
		Menu.printIntro();
		
		boolean run = true;
		while(run)
		{
			Menu.printNavigation();
			Scanner sc = new Scanner(System.in);
			sc.useDelimiter("\n");

			String navigation = sc.next();
			char nav = navigation.charAt(0);
			switch(nav)
			{
			case '1': 
				Menu.playerCountQuery();
				boolean validPlayerCount = false;
				do
				{
					System.out.print("-> ");
					navigation = sc.next();
					nav = navigation.charAt(0);
					if(nav < '9' && nav > '0')
					{
						Game g = new Game(nav - '0');
						validPlayerCount = true;
					}
				} while (!validPlayerCount);
				break;
			case '2': break;
			case '3': break;
			case '4': break;
			case '0': 
				run = false; 
				break;
			}
		}
//		Game g = new Game(2);

	}
}
