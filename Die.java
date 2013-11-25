import java.util.Random; 

public class Die
{
	public enum type   { GOLD, SILVER, BRONZE }
	public enum action { BURN, CONT, LOOT}

	private type _treasure;

	public Die()
	{
		_treasure = type.BRONZE;
	}

	public Die(char treasure)
	{
		switch( treasure )
		{
		case 'g': _treasure = type.GOLD;   break;
		case 's': _treasure = type.SILVER; break;
		case 'b': _treasure = type.BRONZE; break;
		}
	}

	public int roll()
	{
		int d6 = 1 + (int)(6 * Math.random());
		switch( _treasure )
		{
		case GOLD:
			if     (d6 < 2) return 0;
			else if(d6 < 5) return 1;
			else if(d6 < 7) return 2;
			break;
		case SILVER:
			if     (d6 < 3) return 0;
			else if(d6 < 5) return 1;
			else if(d6 < 7) return 2;
			break;
		case BRONZE:
			if     (d6 < 4) return 0;
			else if(d6 < 6) return 1;
			else if(d6 < 7) return 2;
			break;
		}
		return -1;
	}

	public String toString()
	{
		switch( _treasure )
		{
			case GOLD:   return "G"; 
			case SILVER: return "S"; 
			case BRONZE: return "B"; 
		}
		return "ERR";
	}
}
