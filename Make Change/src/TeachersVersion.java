
public class TeachersVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount_in_cents = 174;
		int num_of_loonies = amount_in_cents/100;
		int num_of_quarters = amount_in_cents/25;
		amount_in_cents = amount_in_cents%25;
		int num_of_dimes = amount_in_cents/10;
		amount_in_cents = amount_in_cents%10;
		int num_of_nickels = amount_in_cents/5;
		amount_in_cents = amount_in_cents%5;
		int num_of_pennies = amount_in_cents/1;
		amount_in_cents = amount_in_cents%1;
		System.out.println(num_of_loonies);
		System.out.println(num_of_quarters);
		System.out.println(num_of_dimes);
		System.out.println(num_of_nickels);
		System.out.println(num_of_pennies);
	}

}
