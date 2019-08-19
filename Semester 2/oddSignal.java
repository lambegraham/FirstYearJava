public class oddSignal	{
	public static void main (String [] args)
	{
		int limit = 24;
		int res = oddSigma(limit);
	}

	public static int oddSigma(int limit)
	{
		int sum = 0;
		for(int num = limit; num>0; num--)
		{
			if(num %2 == 1)
			{
				sum+= num;
			}
		}
		return sum;
	}
}