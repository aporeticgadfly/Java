import java.util.Scanner;
public class Staples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of copies you wish to print");
		int copies = input.nextInt();
		
		
		if(copies <= 99)
		{
			System.out.println("Price : $" + copies * 0.30);
		}
		
		else if(copies > 99 && copies <= 499)
		{
			System.out.println("Price : $" + copies * 0.28);
		}
		
		else if(copies > 499 && copies <= 749)
		{
			System.out.println("Price : $" + copies * 0.27);
		}
		
		else if(copies > 750 && copies <= 1000)
		{
			System.out.println("Price : $" + copies * 0.26);
		}
		
		else if(copies > 1000) 
		{
			System.out.println("Price : $" + copies * 0.25);
		}
	} 

}

