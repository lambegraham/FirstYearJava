public class vowel	{
	public static void main (String [] args)	{

		String s1= new String("This is a sentence");
		String lower = s1.toLowerCase();
		int countA =0, countE=0, countI=0, countO=0, countU=0, other=0;

		for(int i = 0;i<s1.length();i++)	{

			if(lower.charAt(i)=='a')
			{
				countA++;
			}
			if(lower.charAt(i)=='e')
			{
				countE++;
			}
			if(lower.charAt(i)=='i')
			{
				countI++;
			}
			if(lower.charAt(i)=='o')
			{
				countO++;
			}
			if(lower.charAt(i)=='u')
			{
				countU++;
			}
			else
			{
				other++;
			}
		}
			System.out.println("The numer of letter A's is "+countA);
			System.out.println("The numer of letter E's is "+countE);
			System.out.println("The numer of letter I's is "+countI);
			System.out.println("The numer of letter O's is "+countO);
			System.out.println("The numer of letter U's is "+countU);
			System.out.println("The numer of other letters's is "+other);


	}
}