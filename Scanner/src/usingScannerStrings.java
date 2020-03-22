import java.util.Scanner;
public class usingScannerStrings {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("What is your name?");
		 String username = input.nextLine();
		 System.out.println("Hello, " + username);

	}

}
