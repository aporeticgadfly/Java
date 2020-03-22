import java.util.Scanner;
public class Prices {

	public static void main(String[] args) {
		
		//scanner declared and created
		Scanner input = new Scanner(System.in);

		//asks user to enter price
		System.out.println("Enter your price:");
		
		final double TAX = 0.13;
		
		//creates variables and stores user input
		double listPrice = input.nextDouble();
		
		//calculates tax
		double tax = listPrice * TAX;
		
		//calculates total price
		double priceWithTax = listPrice * 1.13;
		
		System.out.println("List \t$" + listPrice);
		System.out.println("Tax: \t$" + tax);
		System.out.println("Total price: \t$" + priceWithTax);
	}

}
