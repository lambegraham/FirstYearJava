public class methodsInClass	{
	public static void main (String [] args)	{

		int array[] = {1,2,3,4,5};
		int num = 5;

		scaleArray(array[],num)
		}
	}

	public static void scaleArray(int num, int array)	{

		 for(int i = 0; i < array.length; i++)	{
		 	System.out.println(array[i]*num);
		 }

	}
}