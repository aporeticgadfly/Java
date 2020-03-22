import java.util.Scanner;
public class assignment1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word = input.nextLine();
		
		System.out.println("Enter a letter: ");
		char letter = input.next().charAt(0);
		
		int word2 = word.length();
		
		int firstOccurrence = word.indexOf(letter);
		int lastOccurence = word.lastIndexOf(letter);
		
		System.out.println("The first occurrence of the letter '"+letter+"' occurs at index "+ firstOccurrence);
		System.out.println("The last occurrence of the letter '"+letter+"' occurs at index "+ lastOccurence);
		
		int y = 0;
		
		for(int x = word2 - 1; x >= 0; x--)
		{
			char char2 = word.charAt(x);
			
			if(char2 == letter)
			{
				System.out.println("The letter " +letter+ " occurs at index " + x);
				y++;
			}
		}
		
		System.out.println("The letter '" +letter+ "' occurs "+y+" times");

	
	}

}
