import java.util.Scanner;

public class Game
{
	int _roundNo;
	int _playerNo;
	int _activePlayer;
	Player[] _players;
	BagOfDice _diceBag;

	Game(int n)
	{
		_roundNo       = 0;
		_playerNo     = n;
		_activePlayer = 0;
		_players = new Player[n];
		_diceBag = new BagOfDice();

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
					System.out.println("Round No. " + _roundNo);
					System.out.println("Player [" + _activePlayer + "]");

					System.out.print("In the main game section.\n" + 
						"Type \'End turn\' to finish your turn\n" + 
						"Type \'Quit game\' to end the game\n" +
						"-> ");

					String command = sc.next();
					char   comm    = command.charAt(0);
					switch(comm)
					{
					case 'e':
					case 'E': endTurn = true; break;
					case 'q':
					case 'Q': endTurn = true; endRound = true; gameOn  = false; break;
					}
				}
				_activePlayer = (++_activePlayer) % _playerNo;
				if(_activePlayer == 0) endRound = true;
			}
			_roundNo++;
		}
	}
}

