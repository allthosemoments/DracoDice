import java.util.ArrayList;

public class Player
{
	int _damage;
	int _score;
	ArrayList<Die> _hand;
	ArrayList<Die> _active;
	ArrayList<Die> _reserve;

	public Player()
	{
		_damage  = 0;
		_score   = 0;
		_hand    = new ArrayList<Die> ();
		_active  = new ArrayList<Die> ();
		_reserve = new ArrayList<Die> ();
	}
}
