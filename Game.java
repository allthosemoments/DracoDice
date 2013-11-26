import java.util.Scanner;

public class Game
{
	private int _roundNo;
	private int _playerNo;
	private int _activePlayer;
	private Player[] _players;
	private BagOfDice _diceBag;

	Game(int n)
	{
		_roundNo      = 0;
		_playerNo     = n;
		_activePlayer = 0;
		_players = new Player[n];
		_diceBag = new BagOfDice();

		for(int i = 0; i < n; i++) _players[i] = new Player();

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
					System.out.println("Round No. " + _roundNo + ", Player" + 
						_activePlayer + "'s turn");
					System.out.println("Score: " + _players[_activePlayer].getScore() + 
						"    Damage: " + _players[_activePlayer].getDamage() + "\n");

					_players[_activePlayer].drawNewHand(_diceBag.take(8));
					System.out.print(_players[_activePlayer]);

					System.out.print("\nIn the main game section.\n" + 
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

