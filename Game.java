public class Game
{
	int _turnNo;
	int _playerNo;
	Player[] _players;
	BagOfDice _diceBag;

	Game(int n)
	{
		_turnNo   = 0;
		_playerNo = n;
		_players = new Player[n];
		_diceBag = new BagOfDice();
	}
}
