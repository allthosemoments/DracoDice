public class DracoDice
{
	public static void main(String[] args)
	{
		System.out.println("DracoDice!");

		Die gold   = new Die('g');
		Die silver = new Die('s');
		Die bronze = new Die('b');

		BagOfDice bod = new BagOfDice();
		System.out.println("Inside dice bag: " + bod);
		System.out.print("Drawn from bag : ");
		bod.take(8);
		System.out.println("Inside dice bag: " + bod);
/*
		for(int i = 0; i < 20; i++)
		{
			System.out.println("== Round " + i + " ==");
			System.out.println("Gold result  : " + gold.roll());
			System.out.println("Silver result: " + gold.roll());
			System.out.println("Bronze result: " + gold.roll());
			System.out.println();
		}
*/
	}
}
