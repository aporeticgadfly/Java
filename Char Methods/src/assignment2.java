import java.util.Scanner;
public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string of letters and digits: ");
		String word = input.nextLine();
		
		int numOfLetters=0;
		int numOfDigits=0;
		
		int num = word.length() - 1;
		
		for(int x = num; x >= 0; x--)
		{
			char char2 = word.charAt(x);
			
			boolean c = Character.isLetter(char2);
			boolean d = Character.isDigit(char2);
			
			if(c == true)
			{
				numOfLetters++;
			}
			else if(d == true)
			{
				numOfDigits++;
			}
		}
		System.out.println("number of letters: "+ numOfLetters);
		System.out.println("number of digits: "+ numOfDigits);
	}

}
