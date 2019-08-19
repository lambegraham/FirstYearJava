public class palproper{
	public static void main (String [] args)	{

		int number = 100;
		final int MAX=999;
		int digit1=0, digit3=0, palindrome=0;

		while(number<=MAX)
		{
			digit1=number/10/10;
			digit3=number%10;
			if(digit1==digit3)	{
				palindrome++;
					number++;
		}
		}
		System.out.println(palindrome);
	}
}