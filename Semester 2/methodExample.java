public class methodExample
{
	public static void main (String [] args)
	{
		String name = "Tom";
		printName(name);	//calls method
		getAverage(1,2,3,4);
	}

	public static void printName (String name)
	{
		System.out.println("Your name is " +name);
	}
	public static void getAverage (int x, int y, int p,int q)	{

		int ans = (x + y + p + q) / 4;
		System.out.println("Average is : "+ans);
	}
}