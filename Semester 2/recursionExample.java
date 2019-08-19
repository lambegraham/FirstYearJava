import java.util.Scanner;

public class recursionExample	{

	public static void main (String [] args)	{

		Scanner scan = new Scanner(System.in);
		String input = new String(scan.nextLine());

		if(palindrome(input))	{
			System.out.println("Is a palindrome!");
		}
		else	{
			System.out.println("Is not a palindrome!");
		}


	}

	public static boolean palindrome (String s)	{

	if(s.length() <= 1)	{
		return true;
	}

	else	{
		char first = s.charAt(0);	//first letter
		char last = s.charAt(s.length()-1); //last letter

		if (first!=last)	{
			return false;
		}

		else	{
			return (palindrome(s.substring(1, s.length()-1)));
		}
	}

	}
}