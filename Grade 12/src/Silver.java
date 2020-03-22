import java.util.Scanner;
import java.util.Arrays;
public class Silver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean run = true;
		
		while(run == true)
		{
		
			System.out.println("Enter a phrase and I will tell you if it is a palindrome: (Enter 'exit' to exit program)");
			String userInput = input.nextLine();
		
			if(userInput.equals("exit"))
			{
				break;
			}
			userInput = userInput.replaceAll("\\s", "");
			int longness = userInput.length();
		
			char [] sentence = new char[longness];
			char [] reverse = new char[longness];
		
			for(int i = 0; i < longness; i++)
			{
				sentence[i] = userInput.charAt(i);
				reverse[i] = userInput.charAt(longness - 1 - i);
			}
		
			if(Arrays.equals(sentence, reverse))
			{
				System.out.println("This is a palindrome");
			}
			else
			{
				System.out.println("This is not a palindrome");
			}
		}
	}

}
