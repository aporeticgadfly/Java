import java.util.Scanner;

		public class javaErrors {

			public static void main(String[] args) {

				// Declare variables
				int num1;
				int num2;
				int sum;

				// Declare variable for Scanner object
				Scanner input = new Scanner (System.in);

				// Prompt user for the first number
				System.out.print("Please enter the first number:");
				num1 = input.nextInt();

				// Prompt user for second number
				num2 = input.nextInt();
			
				// Calculate sum
				sum = num1 + num2;

				// Output the sum
				System.out.println (num1 + "+" + num2 + "=" + sum);
			}
		}

