import java.util.*;
public class Bronze {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double sum = 0;
		boolean run = true;
		int numbers = 0;
		
		while(run == true)
		{
			try
			{
				System.out.println("How many numbers will you enter?");
				numbers = input.nextInt();
				run = false;
			}
			catch(InputMismatchException e1)
			{
				System.out.println("Not valid input!");
				input.next();
			}
		}
		
		int [] myArray = new int[numbers];
		run = true;
		
		while(run == true)
		{
			try
			{
				System.out.println("Enter your " + numbers + " integers");
				for(int i = 0; i < numbers; i++)
				{
					myArray[i] = input.nextInt();
					sum = sum + myArray[i];
				}
			}
			catch(InputMismatchException e1)
			{
				System.out.println("Not valid input!");
				input.next();
			}
		}
		
		System.out.println("The sum is " + sum);
		
		for(int i = 0; i < numbers; i++)
		{
			double percentage = (myArray[i] / sum) * 100;
			System.out.println(myArray[i] + " is " + percentage + "% of the sum");
		}
	}

}
