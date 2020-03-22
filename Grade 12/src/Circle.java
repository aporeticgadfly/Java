
public class Circle {
	
	private double area;
	private double circumference;
	private double diameter;
	
	public double getArea(double radius)
	{
		area = 3.141592 * (radius * radius);
		return area;
	}
	
	public double calculateCircumference(double radius)
	{
		circumference = 2 * 3.141592 * radius;
		return circumference;
	}
	
	public double calculateDiameter(double radius)
	{
		diameter = radius * 2;
		return diameter;
	}
}
