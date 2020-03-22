import java.util.Scanner;
public class LockerProgram {

	public static void main(String[] args) {
		
		int retry = 0;
		Scanner input = new Scanner(System.in);
		
		while(retry == 0)
		{
			System.out.println("Enter your locker combination");
			System.out.println("Enter the first number: ");
			int firstNumber = input.nextInt();
		
			System.out.println("Enter the second number: ");
			int secondNumber = input.nextInt();
		
			System.out.println("Enter the third number: ");
			int thirdNumber = input.nextInt();
		
			if(firstNumber == 20 && secondNumber == 15 && thirdNumber == 25)
			{
				System.out.println("Congratulations! You have opened your locker.");
				retry = 1;
			}
		
			else
			{
				System.out.println("Sorry! You have entered the wrong combination.");
			}
		}
	}
}
