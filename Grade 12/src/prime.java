/* Code written by Santiago Orellana
 * Monday, September 10, 2018
 * Mr Piazzas AP Computer Science Class Grade 12
 * program determines in number inputted is prime and lists all the factors
 */
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		for(int x = 1; x <= number; x++)
		{
			if(number % x == 0)
			{
				counter++;
				System.out.print(x + " x ");
				System.out.println(number / x);
			}
		}
		
		if(counter > 2)
		{
			System.out.println("This is not a prime number.");
		}
		else
		{
			System.out.println("This is a prime number.");
		}
	}

}
