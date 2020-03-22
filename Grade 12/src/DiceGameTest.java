
public class DiceGameTest {

	public static void main(String[] args) {
		
		DiceGame myDG = new DiceGame();
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(" You rolled a "+myDG.roll(2));
		}

	}

}
