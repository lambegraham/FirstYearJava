public class printAlternateCharacters	{

	public static void main (String [] args)	{

		String s = new String("Hello World!");
		printAlt(s)
	}

	public static void printAlt(String s)	{

		for(int i = 0; i <s.length(); i+2)
		{
		System.out.println(s.charAt(i) + " ");
		}

	}
}