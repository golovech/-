package days14;

import java.util.Scanner;

public class Test02 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String a = scanner.next();

	        for (int i = 0; i <= a.length(); i++) { // i가 0이고, a의 길이가 될때까지 i는 1씩 늘어난다.
				if (i <= 'A' && i >= 'Z') { // i가 대문자라면?
					System.out.printf("%s".toUpperCase(),i);
				} else if (i <= 'a' && i >= 'z') {
					System.out.printf("%s.toLowerCase()",i);
				}
				
			}
	    }
}