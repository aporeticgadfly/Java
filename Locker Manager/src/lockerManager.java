import java.util.*;
public class lockerManager {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rnd = new Random();
		
		int x = 0;
		int counter = 0;
		
		System.out.println("Enter the number of codes to generate: ");
		int numberOfLockers = input.nextInt();
		
		String[] lockers = new String[numberOfLockers - 1];
		int[] lockerNumber = new int[numberOfLockers - 1];
		
		String pattern = "\\d{2}-\\d{2}-\\d{2}";
		
		for(x = 0; x < numberOfLockers; x++)
		{
			int a = rnd.nextInt(60);
			int b = rnd.nextInt(60);
			int c = rnd.nextInt(60);
			lockers[x] = a + "-" + b + "-" + c;
			lockerNumber[x] = x + 1;
		}
		
		System.out.println("LOCKERS             COMBINATION");
		
		for(x = 0; x < numberOfLockers; x++)
		{
			System.out.println(lockerNumber[x] + "                   " + lockers[x]);
		}
		
		for(x = 0; x < numberOfLockers; x++)
		{
			for(int y = 0; y < numberOfLockers; y++)
			{
				if(lockers[x].matches(lockers[y]))
				{
					counter++;
				}
				
				if(counter < 2)
				{
					System.out.println("No duplicate codes found!");
				}
			}
		}

		System.out.println("Enter a locker number: ");
		x = input.nextInt();
		System.out.println(lockers[x-1]);
		
		
		System.out.println("Enter a locker combination: ");
		String combo = input.nextLine();
		
		for(x = 0; x < numberOfLockers; x++)
		{
			if(lockers[x].matches(combo))
			{
				System.out.println("Good.");
			}
			else
			{
				System.out.println(combo + "has not been assigned!");
			}
		}
		
	}

}
