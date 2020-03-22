
public class Triangle {

	private double area;
	private double hypotenuseLength;
	
	public double calculateArea (double side1, double side2)
	{
		area = (side1 + side2)/2;
		return area;
	}
	
	public double calculateHypotenuse(double side1, double side2)
	{
		hypotenuseLength = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
		return hypotenuseLength;
	}
}
