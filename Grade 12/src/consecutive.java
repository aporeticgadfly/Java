import java.util.Scanner;
public class consecutive {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive number: ");
		int number = input.nextInt();
		while(number <= 0)
		{
			System.out.println("Try again");
			number = input.nextInt();
		}
		
		int second = number + 1;
		int third = number + 2;
		int fourth = number + 3;
		int fifth = number + 4;
		
		System.out.println(number + "\t" + second + "\t" + third + "\t" + fourth + "\t" + fifth);
		
		int sum = number + second + third + fourth + fifth;
		
		System.out.println(sum);
		
		int quotient = sum / 5;
		
		System.out.println(quotient);
		
	}

}
