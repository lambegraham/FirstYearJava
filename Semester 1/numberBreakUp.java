public class numberBreakUp
{
	public static void main (String [] args)
	{
		int num = 245;
		int digit3=0 , digit2= 0, digit1=0;
		int num2= 0;

		digit3= num%10;

		num2= num/10; //24
		digit2= num2%10; //4

		digit1= num2/10; //2

		System.out.println(digit1);
	}
}