import java.util.Scanner;

public class fourByFourArray {
	public static void main (String [] args)	{

		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int columns = sc.nextInt();

		String myArray [][] = new String[rows][columns];

		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				myArray[i][j]="*";
			}
		}
		for(int i = 0; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				System.out.print(myArray[j][i]);
			}
			System.out.println();
		}
		}
	}