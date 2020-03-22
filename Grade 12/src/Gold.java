import java.util.*;
public class Gold {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive number");
		int number = input.nextInt();
		int counter2 = 0;
		int prime = 1;
		int [] primeArray = new int[number];
		
		while(counter2 <= number)
		{

			for(prime = 1; prime <= 10000; prime++)
			{
				int counter = 0;
				
				for(int x = 1; x <= prime; x++)
				{
					
					if(prime % x == 0)
					{
						counter++;
						
						if(counter == 2)
						{
							primeArray[counter2] = prime;
							counter2++;
							
							if(counter2 == number)
							{
								break;
							}
						}
					}
				}
			}
			
			System.out.println("These are the first " + number + " prime numbers");
			
			for(counter2 = 0; counter2 < number; counter2++)
			{
				System.out.println(primeArray[counter2]);
			}
		}
	}

}
