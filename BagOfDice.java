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

	public ArrayList<Die> drawEight()
	{
		int count = 0;
		ArrayList<Die> newHand = new ArrayList<Die>();
		while(count < 8)
		{
			int chosenDie = 1 + (int)((_dice.size() - 1) * Math.random());
			newHand.add(_dice.remove(chosenDie));
			count++;
		}
		for(int i = 0; i < 8; i++)
			System.out.println(newHand.get(i));

		return newHand;
	}	
}
