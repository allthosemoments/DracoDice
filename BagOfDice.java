import java.util.ArrayList;
import java.util.Random;

public class BagOfDice
{
	private ArrayList<Die> _dice;

	public BagOfDice()
	{
		_dice = new ArrayList<Die> ();	
		for(int i = 0; i < 16; i++)
		{
			_dice.add(new Die('b'));
			if(i < 8) _dice.add(new Die('s'));
			if(i < 4) _dice.add(new Die('g'));
		}
	}

	public ArrayList<Die> take(int n)
	{
		int count = 0;
		ArrayList<Die> newHand = new ArrayList<Die>();
		while(count < n)
		{
			int chosenDie = 1 + (int)((_dice.size() - 1) * Math.random());
			newHand.add(_dice.remove(chosenDie));
			count++;
		}

		for(int i = 0; i < newHand.size(); i++)
			System.out.print(newHand.get(i));
		System.out.println();

		return newHand;
	}

	public String toString()
	{
		StringBuilder print = new StringBuilder();
		for(int i = 0; i < _dice.size(); i++)
			print.append(_dice.get(i).toString());
		return print.toString();
	}
}
