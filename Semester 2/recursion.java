public class recursion
{
	public static void main(String [] args)
	{
		int n = 5;
		System.out.println("Ans: " + fib(n));

	}

	public static int count7(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if( n % 10 == 7)
		{
			return 1 + count8(n/10)
		}
		else
		{
			return count7(n/10)
		}
	}

	public static int sumDigits(int n)
	{
		//Assume n > 0
		//base case
		if(n<10)
		{
			return n;

		}
		else
		{
			return sumDigits(n/10) + n % 10;
		}
	}


	public static int array11 (int nums[], int index)
	{
		if(index == nums.length)
		{
			return 0;
		}
		else if(nums[index] == 11)
		{
			return 1 + array11(nums,index+1);
		}
		else
		{
			return array11(nums, index+1);
		}
	}


	public static int fib(int n)
	{
		//base case

		if(n==0 | n==1)
		{
			return n;
		}
		else
		{
			return fib(n-1) + fib (n-2);
		}
	}
}