import java.lang.*;
public class squaredAscending {

	public static void main(String[] args) {
		
		int x = 0;
		while(x <= 100)
		{
			if(x % Math.sqrt(x) == 0)
			{
				System.out.println(x);
			}
			x++;
		}

	}

}
