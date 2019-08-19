public class sandbox {
	public static void main (String [] args)	{

		int count = 1, max = 5, result =0;
		while(count <=max)	{
			result = result + (max % count);
			count++;
		}
		System.out.println(count);
	}
}