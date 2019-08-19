import java.util.Scanner;

public class recursionExam {

	public static void main (String [] args)	{

		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println(power(num1,num2));
	}

	public static int power(int x, int y)	{

		if(y == 0) return 1;
    	else return x * power(x, y-1);
	}


}