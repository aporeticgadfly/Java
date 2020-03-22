import java.util.Scanner;
public class avgcalcTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int counter = 1;
		
		Scanner input = new Scanner(System.in);
		
		while(counter <= 10)
		{
			System.out.println("Enter a number:");
			int num = input.nextInt();
			
			sum = sum + num;
			counter++;
		}
		
		double finalNum = sum / 10;
		System.out.println("The average is: " +finalNum);
	}

}
