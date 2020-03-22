import java.util.*;
public class arraySearcher {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		
		int counter = 0;
		int[] myArray = new int[10];
		
		System.out.print("Array: ");
		
		for(int x = 0; x <= 9; x++)
		{
			myArray[x] = rnd.nextInt(49) + 1;
			System.out.print(myArray[x] + " ");
		}
		
		System.out.println(" ");
		System.out.println("Enter an integer between 1-50");
		int integer = input.nextInt();
		
		System.out.println("Value to find: "+ integer);
		
		for(int x = 0; x <= 9; x++)
		{
			if(myArray[x] == integer)
			{
				counter++;
			}
		}
		
		System.out.println(integer + " was found "+counter+" times.");
	}

}
