import java.util.*;
public class guessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		
		int numberOfGuesses = 0;
		int userGuess = 0;
		int secretNumber = rnd.nextInt(50);
		boolean playAgain = true;
		
		while(playAgain == true)
		{
			int displayTries = 5 - numberOfGuesses;
			
			System.out.println("Guess a number between 0 and 50. You have " + displayTries + " tries!");
			userGuess = input.nextInt();
			
			if((userGuess < 0 || userGuess > 50) && numberOfGuesses < 5)
			{
				System.out.println("Invalid number guessed!");
			}
			else if(userGuess < secretNumber && numberOfGuesses < 5)
			{			
				System.out.println("Too low!");
				numberOfGuesses++;
			}
			else if(userGuess > secretNumber && numberOfGuesses < 5)
			{
				System.out.println("Too high!");
				numberOfGuesses++;
			}
			else if(userGuess == secretNumber && numberOfGuesses < 5)
			{
				System.out.println("Congrats, you guessed it! Type true to play again, type false to quit.");
				playAgain = input.nextBoolean();
				numberOfGuesses = 0;
				secretNumber = rnd.nextInt(50);
			}
			else if(numberOfGuesses == 5)
			{
				System.out.println("You lose! Would you like to play again? Type true to play again, or false to quit.");
				playAgain = input.nextBoolean();
				numberOfGuesses = 0;
				secretNumber = rnd.nextInt(50);
			}
			else
			{
			
			}
				
		}
	}

}
