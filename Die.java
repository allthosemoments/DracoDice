import java.util.Random; 

public class Die
{
	public enum type { GOLD, SILVER, BRONZE }

	private type _treasure;

	public Die()
	{
		_treasure = type.BRONZE;
	}

	public Die(char treasure)
	{
		switch(treasure)
		{
		case 'g': _treasure = type.GOLD;   break;
		case 's': _treasure = type.SILVER; break;
		case 'b': _treasure = type.BRONZE; break;
		}
	}

	public int roll()
	{
		return 1 + (int)(6 * Math.random());
	}
}
