public class methodOverload	{

	public static void main (String [] args)	{

		String s = new String ("This is a test");
		String res = manipulation(s);
		System.out.println("The string without white space " + res);

	}

	public static String manipulation(String s)	// remove all whitespaces
	{
		String newSt = new String("");
		for (int x=0; x<s.length(); x++)
		{
			if(s.charAt(x)	!= ' ')
			{
				newSt = newSt + s.charAt(x);
			}
		}
		return newSt;
	}

}