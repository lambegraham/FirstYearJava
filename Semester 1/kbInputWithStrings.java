import java.util.Scanner;

public class kbInputWithStrings {
	public static void main (String [] args)	{

		Scanner scan = new Scanner(System.in);

		String s1 = scan.nextLine();

		int a = 0;

		for(int i = s1.length()-1; i>0; i--)	{

			if(s1.charAt(i)=='a')	{
				a++;
			}
		}
		if(a<3)	{
				String s2 = s1.replace('a','#');
				System.out.println(s2);
			}
		else	{
				String s3 = s1.replace('a','@');
				System.out.println(s3);
	}
	}
}