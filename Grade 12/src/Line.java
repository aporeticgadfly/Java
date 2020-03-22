
public class Line {

	private double length;
	private double slope;
	
	public double calculateLength(double x1, double y1, double x2, double y2)
	{
		length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return length;
	}
	
	public double calculateSlope(double x1, double y1, double x2, double y2)
	{
		slope = (y2 - y1)/(x2 - x1);
		return slope;
	}
}
