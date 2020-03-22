import java.util.Scanner;
public class Tax {

	public static void main(String[] args) {
		
		double annualIncome;
		double firstBracket;
		double secondBracket;
		double thirdBracket;
		double fourthBracket;
		double fifthBracket;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your annual income?");
		annualIncome = input.nextDouble();
		
		if(annualIncome <= 46605)
		{
			firstBracket = annualIncome * 0.15;
			System.out.println("You must pay $" + firstBracket+ " in taxes.");
		}
		else if(annualIncome > 46605 && annualIncome <= 93208)
		{
			secondBracket = 46605 * 0.15 + ((annualIncome-46605) * 0.205);
			System.out.println("You must pay $" + secondBracket+ " in taxes.");
		}
		else if(annualIncome > 93208 && annualIncome <= 144489)
		{
			thirdBracket = 46605 * 0.15 + (46603 * 0.205) + ((annualIncome - 93208) * 0.26);
			System.out.println("You must pay $" + thirdBracket+ " in taxes.");
		}
		else if(annualIncome > 144489 && annualIncome <= 205842)
		{
			fourthBracket = 46605 * 0.15 + (46603 * 0.205) + (51281 * 0.26)+ ((annualIncome - 144489)* 0.29);
			System.out.println("You must pay $" + fourthBracket+ " in taxes.");
		}
		else if(annualIncome > 205842)
		{
			fifthBracket = 46605 * 0.15 + (46603 * 0.205) + (51281 * 0.26) + (61353 * 0.29) + ((annualIncome - 205842) * 0.33);
			System.out.println("You must pay $" + fifthBracket+ " in taxes.");
		}
	}
}
