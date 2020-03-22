import java.util.Scanner;
public class usingScannerNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int userAge = input.nextInt();
		System.out.println("You are " + userAge + " years old.");
		int newAge = userAge + 5;
		System.out.println("in 5 years, you will be " + newAge + " years old");

	}

}
