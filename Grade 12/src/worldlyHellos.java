
public class worldlyHellos {

	private String greeting;
	
	public String helloInEnglish(String name)
	{
		greeting = "Hello " + name;
		return greeting;
	}
	
	public String helloInFrench(String name)
	{
		greeting = "Bonjour " + name;
		return greeting;
	}
	
	public String helloInItalian(String name)
	{
		greeting = "Ciao " + name;
		return greeting;
	}
}
