public class DracoDice
{
	public static void main(String[] args)
	{
		System.out.println("DracoDice!");

		Die test = new Die('g');
		for(int i = 0; i < 20; i++) System.out.println(i + ": " + test.roll());
	}
}
