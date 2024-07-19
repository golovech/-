package days14;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char a = scanner.next().charAt(0);

		if ( 'A' <= a && a <= 'Z' ) {
			a = (Character).toUpperCase();
			System.out.printf("%c",a);
		} else if ( 'a' <= a && a <= 'z' ) {
			a = (Character).toLowerCase();
			System.out.printf("%c",a);



		}

	}
}