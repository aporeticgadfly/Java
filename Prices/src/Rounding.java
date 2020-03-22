
public class Rounding {

	public static void main(String[] args) {
		
		double val = 1.387;
		int multiplier = 100;
		val = val*multiplier;
		val = Math.round(val);
		val = val/multiplier;
		System.out.println(val);

	}

}
