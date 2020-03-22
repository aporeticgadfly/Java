import java.util.Scanner;
public class avgcalc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean something = true;
		
		while(something == true)
		{
			System.out.println("Press q to quit, press any other key to continue");
			String checker = input.next();
			if(checker.equalsIgnoreCase("q"))
			{
				something = false;
				System.out.println("Goodbye!");
			}
			else{
			
		System.out.println("Enter 10 numbers, 1:");
		int num1 = input.nextInt();
		System.out.println("2:");
		int num2 = input.nextInt();
		System.out.println("3:");
		int num3 = input.nextInt();
		System.out.println("4:");
		int num4 = input.nextInt();
		System.out.println("5:");
		int num5 = input.nextInt();
		System.out.println("6:");
		int num6 = input.nextInt();
		System.out.println("7:");
		int num7 = input.nextInt();
		System.out.println("8:");
		int num8 = input.nextInt();
		System.out.println("9:");
		int num9 = input.nextInt();
		System.out.println("10:");
		int num10 = input.nextInt();
		
		int result = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		
		double avg = result / 10;
		
		System.out.println("The average is: " + avg);
			}
		}
	}

}
