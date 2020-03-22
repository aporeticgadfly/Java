import java.util.Scanner;
public class licenseValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your surname: ");
		String name = input.nextLine();
		
		System.out.println("Please enter your birthdate: (yymmdd) ");
		String birthday = input.nextLine();
		
		System.out.println("Please enter your drivers license number: ");
		String license = input.nextLine();
		
		name = name.toUpperCase();
		char firstLetter = name.charAt(0);
		char firstLicenseLetter = license.charAt(0);
		boolean isNumber = Character.isLetter(firstLicenseLetter);
		char secondLast = license.charAt(10);
		char firstDigit = birthday.charAt(0);
		String birthdaySecond = birthday.substring(1);
		String lastLicense = license.substring(12);
		int length = license.length();
		boolean y = true;
		
		for(int x = 1; x > 5; x++)
		{
			char b = license.charAt(x);
			boolean c = Character.isDigit(b);
			
			if(c == false)
			{
				y = false;
			}
		}
		
		if((firstLetter == firstLicenseLetter) && (secondLast == firstDigit) && (birthdaySecond.equals(lastLicense)) && length == 17 && isNumber == true && y == true)
		{
			System.out.println("Your drivers license is valid!");
		}
		else
		{
			System.out.println("Your drivers license is invalid!");
		}
		
	}

}
