import java.util.ArrayList;

public class Player
{
	private int _damage;
	private int _score;
	private ArrayList<Die> _hand;
	private ArrayList<Die> _active;
	private ArrayList<Die> _reserve;

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

	public int getDamage()
	{
		return _damage;
	}

	public int getScore()
	{
		return _score;
	}

	public String printActive()
	{
		StringBuilder active = new StringBuilder();
		for(int i = 0; i < _active.size(); i++)
			active.append(_active.get(i) + " ");

		return active.toString();
	}

	public String printHand()
	{
		StringBuilder hand = new StringBuilder();
		for(int i = 0; i < _hand.size(); i++)
			hand.append(_hand.get(i) + " ");

		return hand.toString();
	}

	public String printReserve()
	{
		StringBuilder reserve = new StringBuilder();
		for(int i = 0; i < _reserve.size(); i++)
			reserve.append(_reserve.get(i) + " ");

		return reserve.toString();
	}

	public void reserve(int idx)
	{
		_reserve.add(_hand.remove(idx));
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder();
		s.append("Activated dice  : " + printActive()  + "\n");
		s.append("Unverified dice : " + printHand()    + "\n");
		s.append("Deactivated dice: " + printReserve() + "\n");
		return s.toString();
	}
}
