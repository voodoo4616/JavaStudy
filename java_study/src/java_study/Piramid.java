package java_study;

public class Piramid {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6+i; j++) {
				if(j < 5 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10-i; j++) {
				if ( j < i+1 ) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}

}
