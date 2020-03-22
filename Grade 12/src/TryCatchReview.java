import java.util.*;
public class TryCatchReview {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try
		{
			System.out.println("Hello World!");
			System.out.println("Today is a Wednesday");
			System.out.println("Input a number");
			int a = input.nextInt();
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Not valid input!");
		}

	}

}
