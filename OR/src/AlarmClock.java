import java.util.Scanner;
public class AlarmClock {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What day of the week is it? (0 is Sunday, 1 is Monday, etc)");
		int day = input.nextInt();
		
		System.out.println("Are you on vacation? (1 for yes, 0 for no");
		int vacation = input.nextInt();
		
		if((day == 6 || day == 7) && vacation == 1)
		{
			System.out.println("Alarm : OFF");
		}
		
		else if((day != 6 || day == 7) && vacation == 1)
		{
			System.out.println("Alarm : 10:00 am");
		}
		
		else if((day == 6 || day == 7) && vacation == 0)
		{
			System.out.println("Alarm : 10:00 am");
		}
		
		else if((day != 6 || day == 7) && vacation == 0)
		{
			System.out.println("Alarm : 7:00 am");
		}
	} 

}
