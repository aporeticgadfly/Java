import java.util.*;
public class driversLicense {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		
		System.out.println("Please enter your surname: ");
		String name = input.nextLine();
		
		System.out.println("Please enter your date of birth (yymmdd): ");
		String birthday = input.nextLine();
		
		char firstLetter = name.charAt(0);
		String word1 = birthday.substring(1, 6);
		char firstNumber = birthday.charAt(0);
		int num = rnd.nextInt(8999) +1000;
		int num2 = rnd.nextInt(8999) +1000;
		
		System.out.println(firstLetter+num + "-"+num2+firstNumber + "-" + word1);
	}

}
