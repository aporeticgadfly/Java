
public class SINChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mysin = "123-123-123";
		String sinPattern = "\\d{3}-\\d{3}-\\d{3}";
		
		if(mysin.matches(sinPattern))
		{
			System.out.println("Valid!");
		}
		else
		{
			System.out.println("Invalid!");
		}
		
		String gtaPhonePattern = "(647|416|905|289)-\\d{3}-\\d{4}";
		String myPhoneNumber = "647-864-4200";
		
		if(myPhoneNumber.matches(gtaPhonePattern))
		{
			System.out.println("Valid!");
		}
	}

}
