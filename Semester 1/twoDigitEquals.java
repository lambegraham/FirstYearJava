public class twoDigitEquals
{
	public static void main (String [] args)
	{
		int num = 22;
		int digit1 = 0, digit2 = 0;

		digit2 = num%10;
		digit1 = num/10;

		if(digit1==digit2)
		{
			System.out.println(num+" contains the same two digits");
		}
	}
}