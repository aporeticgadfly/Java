//imports the scanner class so we can read input from the user
import java.util.Scanner;
//imports the decimal format class so we can format the output numbers as monetary values
import java.text.DecimalFormat;
public class Assignment {

	public static void main(String[] args) {
		
		//declares our scanner
		Scanner input = new Scanner(System.in);
		
		//outputs ticket information and ticket prices for user to read, does not require any user input
		System.out.printf("%42s\n%42s\n%42s\n%42s\n%42s\n%42s\n%42s\n%42s\n%42s\n","             IMAGINE DRAGONS:             ","          Smoke + Mirrors Tour          ","                                          ","SECTION                              PRICE","Floors                              150.00","100-Level                           120.50","200-Level                            80.75","500-Level                            50.25","------------------------------------------");
		
		//initializes ticket prices as doubles, because they must store decimal values
		double platinumPrice = 150.00;			//stores price of a platinum/floor ticket
		double goldPrice = 120.50;				//stores price of a gold/level-100 ticket
		double redPrice = 80.75;				//stores price of a red/level-200 ticket
		double greenPrice = 50.25;
		double serviceFee = 12.50;
		
		//initializes number of each ticket as int variables
		int numberPlatinum;
		int numberGold;
		int numberRed;
		int numberGreen;
		int numberTotal;
		
		//initializes user inputs for payment information as variables
		int paymentMethod;
		int expiryDate;
		double number16;   				//double needed to hold all 16 digits
		String name;
		
		//initializes final totals and prices as doubles, because they must store decimal values
		double subtotal;
		double tax;
		double serviceFeeTotal;
		double grandTotal;
		
		//asks user to input the number of floor/platinum tickets
		System.out.println("Enter the number of floor tickets:");
		numberPlatinum = input.nextInt();
		//asks user to input the number of gold/level-100 tickets
		System.out.println("Enter the number of 100-level tickets:");
		numberGold = input.nextInt();
		//asks user to input the number of red/level-200 tickets
		System.out.println("Enter the number of 200-level tickets:");
		numberRed = input.nextInt();
		//asks user to input the number of green/level-500 tickets
		System.out.println("Enter the number of 500-level tickets:");
		numberGreen = input.nextInt();
		
		//calculates total tax, subtotal, service fee total, and the grand total
		
		//calculates subtotal by multiplying number of platinum tickets by platinum price, multiplying number of gold tickets by gold price, multiplying number of red tickets by red price, multiplying number of green tickets by green price, and then adding the total platinum , gold, red, and green totals together
		subtotal = numberPlatinum * platinumPrice + numberGold * goldPrice + numberRed * redPrice + numberGreen * greenPrice;
		//calculates tax by multiplying subtotal by 0.13, since tax is Canada is 13%
		tax = subtotal * 0.13;
		//calculates service fee total by multiplying service fee by number of tickets
		serviceFeeTotal = serviceFee * (numberPlatinum + numberGold + numberRed + numberGreen);
		//calculates grandtotal by adding together all the other totals
		grandTotal = subtotal + tax + serviceFeeTotal;
		
		//decimal format class initialized and format is specified
		DecimalFormat df = new DecimalFormat(".00");
		
		//outputs values based off of user input, telling user totals and how much payment is needed. Then prompts user how they will be paying
		System.out.printf("%42s\n%42s\n%42s\n%42s\n%42s\n%42s\n%42s\n%42s\n%42s\n%42s\n%42s\n%42s\n","------------------------------------------", "SUBTOTAL:                         $"+df.format(subtotal), "HST:                                "+df.format(tax),"SERVICE FEES:                       "+df.format(serviceFeeTotal),"TOTAL:                            $"+df.format(grandTotal),"                                          ","How will you be paying?                   ","                                          ","1 - VISA                                  ","2 - MasterCard                            ","3 - American Express                      ","                                          ");
		
		//asks for final payment information the user needs to provide in order for the transaction to go successfully
		
		//asks user to enter their payment method: choices are MasterCard, Visa, or American Express
		System.out.println("Enter the payment method:");
		paymentMethod = input.nextInt();
		//prompts user for their name
		System.out.println("Enter your name:");
		name = input.next();
		input.nextLine();
		//prompts user for the 16 digit number needed to verify the transaction
		System.out.println("Enter the 16-digit number:");
		number16 = input.nextDouble();
		//prompts user for the expiry date on their card
		System.out.println("Enter the expiry date (mmyyyy):");
		expiryDate = input.nextInt();
		
		//first prints out a blank line to separate the two sections, then thanks the user and notifies them that their order has been processed
		System.out.println(" ");
		System.out.println("Thank you " + name + "! Your order has been processed!");
	}

}
