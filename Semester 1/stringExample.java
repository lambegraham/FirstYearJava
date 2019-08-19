public class stringExample{
	public static void main (String [] args)	{

		String s1 = new String("Dog");
		String s2 = new String ("dog");

		int len1 = s1.length();
		int len2 = s2.length();

		if(len1 == len2)	{
			System.out.println("Same length");

		//compare strings
			if(s1.compareToIgnoreCase(s2)==0)	{
			System.out.println("Same when case ignored");
		}
			else {
				System.out.println("Not the same");
			}
		}
		else {
			System.out.println("Different length");
		}
	}

}