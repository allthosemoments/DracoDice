import Math.random; 

public class Die
{
	private enum type { GOLD, SILVER, BRONZE }

	private type treasure;

	public Die()
	{
		treasure = type.BRONZE;
	}

	public Die(char treasure)
	{
		switch(treasure)
		{
		case 'g': treasure = type.GOLD;   break;
		case 's': treasure = type.SILVER; break;
		case 'b': treasure = type.BRONZE; break;
		}
	}
}
