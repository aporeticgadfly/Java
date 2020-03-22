import java.util.Scanner;
public class MovieTickets {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int time;
		int age;
		
		System.out.println("What is your age?");
		age = input.nextInt();
		
		System.out.println("Please enter showtime: ");
		time = input.nextInt();
		
		if(age > 13)
		{
			if(time >= 2200)
			{
				System.out.println("4 bucks");
			}
			else if(time <= 1800)
			{
				System.out.println("5 bucks");
			}
			else if(time > 1800 && time < 2200)
			{
				System.out.println("8 bucks");
			}
		}
		
		else
		{
			if(time >= 1800)
			{
				System.out.println("4 bucks");
			}
			
			else if(time < 1800 && time >= 2200)
			{
				System.out.println("2 bucks");
			}
			else
			{
				System.out.println("Children under 14 are not allowed into Midnight Madness");
			}
		}
		
		
	}

}
