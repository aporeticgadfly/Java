import java.util.Scanner;
public class SpeedingTicket {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the posted speed limit?");
		int speedLimit = input.nextInt();
		
		System.out.println("What speed were you going at?");
		int speed = input.nextInt();
		
		int kilometresOver = speed - speedLimit;
		
		System.out.println("Kilometres per hour over speed limit : " + kilometresOver + "km/h");
		
		if(kilometresOver <= 19)
		{
			double totalFine = kilometresOver * 2.50;
		}
		
		else if(kilometresOver > 19 && kilometresOver <= 29)
		{
			double totalFine = kilometresOver * 3.75;
		}
	
		else if(kilometresOver > 29 && kilometresOver <= 49)
		{
			double totalFine = kilometresOver * 6.00;
		}
		
		else if(kilometresOver > 49)
		{
			double totalFine = kilometresOver * 9.75 * 1.25;
		}
	}
}
