public class daysOfWeek
{
	public static void main (String [] args)
	{
		int num = 0;

		num = 3;

		switch(num)
		{
			case 1: System.out.println("Mon"); break;
			case 2: System.out.println("Tue"); break;
			case 3: System.out.println("Wed"); break;
			case 4: System.out.println("Thur"); break;
			case 5: System.out.println("Fri"); break;
			case 6: System.out.println("Sat");
			default: System.out.println("invalid number"); break;
		}
	}
}