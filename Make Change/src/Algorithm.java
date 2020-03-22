
public class Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int loonie = 100;
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		int input = 174;
		
		int numberLoonies = input / loonie;
		int numberQuarters = input%loonie / quarter;
		int numberDimes = input%loonie%quarter / dime;
		int numberNickels = input%loonie%quarter%dime / nickel;
		int numberPennys = input%loonie%quarter%dime%nickel / penny;
		
		System.out.println(numberLoonies + " loonies");
		System.out.println(numberQuarters + " quarters");
		System.out.println(numberDimes + " dimes");
		System.out.println(numberNickels + " nickels");
		System.out.println(numberPennys + " pennys");
	}

}
