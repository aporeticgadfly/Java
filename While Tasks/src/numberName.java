import java.util.Scanner;
public class numberName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int number = input.nextInt();
		
		System.out.println("Enter your name :");
		String name = input.nextLine();
		
		while(number >= 0)
		{
			System.out.println(name);
			number --;
		}

	}

}
