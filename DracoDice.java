public class DracoDice
{
	public static void main(String[] args)
	{
		System.out.println("DracoDice!");

		Die gold   = new Die('g');
		Die silver = new Die('s');
		Die bronze = new Die('b');

		for(int i = 0; i < 20; i++)
		{
			System.out.println("== Ronud " + i + " ==");
			System.out.println("Gold result  : " + gold.roll());
			System.out.println("Silver result: " + gold.roll());
			System.out.println("Bronze result: " + gold.roll());
			System.out.println();
		}
	}
}
