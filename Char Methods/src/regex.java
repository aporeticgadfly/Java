import java.util.Scanner;
public class regex {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your email address: ");
		String email = input.nextLine();
		
		System.out.println("Enter your password: ");
		String password = input.nextLine();
		
		System.out.println("Enter your year of birth (YYMMDD): ");
		int yob = input.nextInt();
		
		int passwordlength = password.length();
		
		String uppercaseTest = password.toLowerCase();
		String lowercaseTest = password.toUpperCase();

		for(int i = 0; i <= passwordlength; i++)
		{
			char test = password.charAt(i);
			boolean digit = Character.isDigit(test);
		}
		
	}

}
