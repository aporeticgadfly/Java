import java.util.Scanner;
public class addingNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number");
		double num1 = input.nextDouble();
		System.out.println("Enter another number");
		double num2 = input.nextDouble();
		System.out.println(num1 + num2 - 0.0000000000000003);
	}

}
