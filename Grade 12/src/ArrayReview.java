import java.util.Scanner;
public class ArrayReview {

	public static void main(String[] args) {
		
		double [] temperature = new double[4];
		
		temperature[0] = 33.0;
		temperature[1] = 27.2;
		temperature[2] = 19.5;
		temperature[3] = 17.33;
		
		System.out.println(temperature[3]);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many kids are in your class?");
		int classSize = input.nextInt();
		
		String [] classRoster = new String[classSize];
		
		for(int i = 0; i < classSize; i++)
		{
			System.out.println("Enter a name");
			String name = input.nextLine();
			classRoster[i] = name;
		}

		for(int y = 0; y < classSize; y++)
		{
			System.out.println(classRoster[y]);
		}
	}

}
