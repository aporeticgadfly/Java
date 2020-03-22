import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatchReview2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean run = true;
		
		while(run == true)
		{
			try
			{
				System.out.println("Input a number");
				int a = input.nextInt();
				run = false;
			}
			catch(InputMismatchException e1)
			{
				System.out.println("Not valid input!");
				input.next();
			}
		}

	}

}
