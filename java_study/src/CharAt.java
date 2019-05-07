
public class CharAt {
	public static void main(String[] args) {
		System.out.println(Math.pow(2, ));
		
		String str = "Java Secure Coding";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			
			if( c >= 'A' && c <= 'Z') {
					c = (char) (c + 32); // char + int = int
			}
			System.out.println(c);
		}
	}
}