import java.util.Scanner;

public class Game
{
	private int roundNo;
	private int playerNo;
	private int activePlayer;
	private Player[] players;
	private BagOfDice diceBag;

	Game(int n)
	{
		roundNo      = 0;
		playerNo     = n;
		activePlayer = 0;
		players = new Player[n];
		diceBag = new BagOfDice();

		for(int i = 0; i < n; i++) players[i] = new Player();

		boolean gameOn = true;
		while(gameOn)
		{
			boolean endRound = false;
			while(!endRound)
			{
				Scanner sc = new Scanner(System.in);
				sc.useDelimiter("\n");

				boolean endTurn = false;
				while(!endTurn)
				{
					printHUD();

					players[activePlayer].drawNewHand(diceBag.take(8));
					System.out.println(players[activePlayer]);

					printCommands();

					String command = sc.next();
					char   comm    = command.charAt(0);
					switch(comm)
					{
					case 'a':
					case 'A':
					case 'd':
					case 'D':
					case 'e':
					case 'E': endTurn = true; break;
					case 'q':
					case 'Q': endTurn = true; endRound = true; gameOn  = false; break;
					}
				}
				diceBag.replace(players[activePlayer].discard());
				activePlayer = (++activePlayer) % playerNo;
				if(activePlayer == 0) endRound = true;
			}
			roundNo++;
		}
	}

	private void printHUD()
	{
		System.out.println("\nRound No. " + roundNo + 
			", Player" + (activePlayer + 1) + "'s turn\n" +
			"Score: " + players[activePlayer].getScore() + "    " +
			"Damage: " + players[activePlayer].getDamage() + "\n");
	}

	private void printCommands()
	{
		System.out.print("Commands\n" +
			"Type \'Activate\' to pick dice to roll\n" +
			"Type \'Deactivate\' to pick dice to put away\n" +
			"Type \'End turn\' to finish your turn\n" + 
			"Type \'Quit game\' to end the game\n" +
			"-> ");
	}
}

