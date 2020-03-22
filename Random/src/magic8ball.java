import java.util.*;
public class magic8ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var = 0;
		
		Random rnd = new Random();
		
		Scanner input = new Scanner(System.in);
		
		while(var == 0)
		{
		
		System.out.println("Enter a question (Press Q to quit):");
		String var2 = input.nextLine();
		
		if (var2.equalsIgnoreCase("q"))
		{
			var++;
			System.out.println("Goodbye!");
		}
		
		else
		{
		
		int num1 = rnd.nextInt(11);
		
		
		if(num1 == 0)
		{
			System.out.println("Outlook not so good!");
		}
		if(num1 == 1)
		{
			System.out.println("Don't count on it!");
		}
		if(num1 == 2)
		{
			System.out.println("My sources say no!");
		}
		if(num1 == 3)
		{
			System.out.println("Reply hazy, try again!");
		}
		if(num1 == 4)
		{
			System.out.println("Yes definitely!");
		}
		if(num1 == 5)
		{
			System.out.println("My reply is no!");
		}
		if(num1 == 6)
		{
			System.out.println("Most likely");
		}
		if(num1 == 7)
		{
			System.out.println("You can count on it!");
		}
		if(num1 == 8)
		{
			System.out.println("Outlook good!");
		}
		if(num1 == 9)
		{
			System.out.println("Without a doubt!");
		}
		if(num1 == 10)
		{
			System.out.println("As I see it, yes!");
		}
		if(num1 == 11)
		{
			System.out.println("Very doubtful!");
		}
		}
		}	
	}

}
