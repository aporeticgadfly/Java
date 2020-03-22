import java.util.*;
public class DiceGame {

	private int diceTotal;
	private Random rnd = new Random();
	
	public int roll()
	{
		diceTotal = rnd.nextInt(6)+1;
		return diceTotal;
	}
	public int roll(int numDice)
	{
		int sum = 0;
		for(int i = 1; i <= numDice; i++)
		{
			sum = sum + (rnd.nextInt(6)+1);
		}
		
		return numDice;
	}
	
}
