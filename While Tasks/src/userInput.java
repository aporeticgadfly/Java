import java.util.Scanner;
public class userInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int starter;
		int increment;
		int loops;
		
		System.out.println("What is the starting number?");
		starter = input.nextInt();
		
		System.out.println("What is the increment value?");
		increment = input.nextInt();
		
		System.out.println("How many repetitions?");
		loops = input.nextInt();
		
		while(starter <= 0)
		{
			
		}

	}

}
