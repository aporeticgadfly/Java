
public class isLetter {

	public static void main(String[] args) {
		
		char a = 'w';
		char b = '$';
		boolean c = Character.isLetter(a);
		System.out.println(c);
		
		boolean d = Character.isLetter(b);
		System.out.println(d);
		
		char e = '7';
		boolean f = Character.isDigit(e);
		System.out.println(f);
		
		char g = ' ';
		boolean h = Character.isWhitespace(g);
		System.out.println(h);

	}

}
