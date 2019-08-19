public class sortingExample	{

	public static void main(String [] args)	{

		int array[] = { 12, 11, 9, 34, 87, -16, -345, 890, 10};
		int temp = 0;
		int pass = 1;


		for(pass = 1; pass< array.length; pass++)	{

			for(int i = 0; i < array.length-1; i++)
			{
			if(array[i] > array[i+1]){
				temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
			}
		}
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]+ " ");
		}
		System.out.println(pass);
	}
}