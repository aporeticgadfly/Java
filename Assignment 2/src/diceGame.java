import java.util.*;
public class diceGame {

	public static void main(String[] args) {
		
		int userPoints = 500;
		int pointsWagered;
		int firstDie;
		int secondDie;
		int bothDie;
		int cfDie;
		int csDie;
		int cbDie;
		String quit;
		String playAgain = "Y";
		
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		
		while(playAgain == "Y")
		{
			if(userPoints == 0)
			{
				System.out.println("Game over! You have zero points left!");
				System.out.println("Would you like to play again? (Y or N)");
				playAgain = input.nextLine();
				
				if(playAgain == "N")
				{
					System.out.println("Thank you for playing! Goodbye!");
				}
				else if(playAgain == "Y")
				{
					userPoints = 500;
				}
			}
			else
			{
			
			System.out.println("You have " + userPoints + " points.");
			System.out.println("Enter points to wager (press -1 to quit): ");
			pointsWagered = input.nextInt();
			
			if(pointsWagered > userPoints)
			{
				System.out.println("Please enter a number less than or equal to "+ userPoints+".");
			}
			else if(pointsWagered <= -2 || pointsWagered == 0)
			{
				System.out.println("You must wager at least 1 point!");
			}
			else if(pointsWagered == -1)
			{
				playAgain = "N";
				System.out.println("Thank you for playing! Goodbye!");
			}
			else
			{
				firstDie = rnd.nextInt(6) + 1;
				secondDie = rnd.nextInt(6) + 1;
				cfDie = rnd.nextInt(6) + 1;
				csDie = rnd.nextInt(6) + 1;
				bothDie = firstDie + secondDie;
				cbDie = cfDie + csDie;
				
				System.out.println("You rolled a ["+firstDie+"]["+secondDie+"]");
				System.out.println("The computer rolled a ["+cfDie+"]["+csDie+"]");
				
				
				if(bothDie > cbDie)
				{
					System.out.println("You get " + pointsWagered + " points!");
					userPoints = userPoints + pointsWagered;
				}
				else if(bothDie < cbDie)
				{
					System.out.println("You lose " + pointsWagered + " points!");
					userPoints = userPoints - pointsWagered;
				}
				else
				{
					System.out.println("It's a tie!");
					System.out.println("Press 'R' to roll again");
					String rollAgain = input.next();
					
					if(rollAgain == "R")
					{
						firstDie = rnd.nextInt(6) + 1;
						secondDie = rnd.nextInt(6) + 1;
						cfDie = rnd.nextInt(6) + 1;
						csDie = rnd.nextInt(6) + 1;
						bothDie = firstDie + secondDie;
						cbDie = cfDie + csDie;
						
						System.out.println("You rolled a ["+firstDie+"]["+secondDie+"]");
						System.out.println("The computer rolled a ["+cfDie+"]["+csDie+"]");
						
						if(bothDie > cbDie)
						{
							System.out.println("You get " + pointsWagered + " points!");
							userPoints = userPoints + pointsWagered;
						}
						else if(bothDie < cbDie)
						{
							System.out.println("You lose " + pointsWagered + " points!");
							userPoints = userPoints - pointsWagered;
						}
					
					}
					
				}
			}
		}
		}
	}

}
