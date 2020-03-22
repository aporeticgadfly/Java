
public class Sphere {

	private double volume;
	private double surfaceArea;
	
	public double calculateVolume(double radius)
	{
		volume = (4/3)*3.1415*Math.pow(radius, 3);
		return volume;
	}
	
	public double calculateSurfaceArea(double radius)
	{
		surfaceArea = 4*3.1415*Math.pow(radius, 2);
		return surfaceArea;
	}
}
