public class Loops {
	public static void main (String [] args)	{

		int count = 1;

		while (count <=3 )
		{
			System.out.println("While count is: "+count);
			count++;
		}

		for (int count2 = 1; count2<10; count2++)
		{
			System.out.println("For count is: "+count2);
		}

		int count3 = 0;

		do	{
			System.out.println("Do+While count is: "+count3);
			count3++;
		}	while (count3<5);
	}
}