import java.util.Scanner;

public class 4x4array {
	public static void main (String [] args)	{

		Scanner sc = new Scanner(System.in);

		String myArray [][] = new String[4][4];

		for(int i=l; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				myArray[i][j]="*";
			}
		}
		for(int i = 0; i<4; i++)
		{
			for(int j = 0; j<4; j++)
			{
				System.out.println(myArray[j][i]);
			}
			System.out.println();
		}
		}
	}
}