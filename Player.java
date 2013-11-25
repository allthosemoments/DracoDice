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

	public void activate(int idx)
	{
		_active.add(_hand.remove(idx));
	}

	public void damage()
	{
		_damage++;
	}

	public void damage(int n)
	{
		_damage += n;
	}

	public ArrayList<Die> discardHand()
	{
		ArrayList<Die> temp = new ArrayList<Die> ();
		for(int i = 0; i < _hand.size(); i++)
			temp.add(_hand.get(i));
		_hand.clear();
		return temp;
	}

	public void drawNewHand(ArrayList<Die> in)
	{
		for(int i = 0; i < in.size(); i++)
			_hand.add(in.get(i));
	}

	public void reserve(int idx)
	{
		_reserve.add(_hand.remove(idx));
	}
}
