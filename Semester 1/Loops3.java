public class Loops3	{
	public static void main (String [] args)	{

		int num = 2;
		int sum = 0;

		while (num <= 1000)
		{
			if (num%2 == 0) //check for odd
			{
				sum = sum + num;
			}
			num++;
		}
		System.out.println("The sum of all even numbers between 2 and 1000 is "+sum);
	}
}