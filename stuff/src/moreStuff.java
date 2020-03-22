import java.util.*;
public class moreStuff {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String [] names = new String[5];
		String [] numbers = new String[5];
		
		for(int i = 0; i <=4; i++)
		{
			System.out.println("Enter your friends name");
			names[i]= input.nextLine();
			System.out.println("Enter your friends number");
			numbers[i]= input.nextLine();
			while(!numbers[i].matches("\\d{3}-\\d{3}-\\d{4}"))
			{
				System.out.println("INVALID! ENTER AGAIN");
				numbers[i] = input.nextLine();
			}
			
			System.out.println("Enter a number for your friends name and number");
			
			int num = input.nextInt();
			boolean a = true;
			
			while(a == true)
			{
				try
				{
					System.out.println("Enter a number for your friends name and number");
					num = input.nextInt();
					a = false;
				}
				catch(InputMismatchException e)
				{
					System.out.println("INVALID!");
					input.next();
				}
			}
			System.out.println(names[num]+"\t"+numbers[num]);
		}
	}

}
