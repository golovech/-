package days06;

import java.util.Scanner;

public class Ex03_05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// [문제] 주민번호 14자리
		String [] rrnArr = {
				"123423-1234567"
				, "123456-123456"
				, "1234516-12345678"
				, "123a56-12#4567"
				, "11233333321"
		};

		String regex = "\\d{6}-\\d{7}";

		for (int i = 0; i < rrnArr.length; i++) {
			System.out.printf("%s - %b\n",
					rrnArr[i],rrnArr[i].matches(regex) );
		}
		/*
		do {
			System.out.print("주민번호 입력 ? ");
			str = scanner.next();
		} while (!str.matches(regex));
		System.out.println(str);
		 */

		// [문제] 우편번호 000-000   00000
		
		String [] zipcodeArr = {
				"123-123"
				, "12345"
				, "1236-178"
				, "126-1567"
				, "1a1221"
				, "123123"
		};
		
		System.out.println("=".repeat(30));

		regex = "\\d{3}-\\d{3}|\\d{5}";

		for (int i = 0; i < zipcodeArr.length; i++) {
			System.out.printf("%s - %b\n",
					zipcodeArr[i],zipcodeArr[i].matches(regex) );
		}
		
		/*
		regex = "\\d{3}-\\d{3}|\\d{5}";
		do {
			System.out.print("우편번호 입력 ? ");
			str = scanner.next();
		} while (!str.matches(regex));
		System.out.println(str);
		*/

		scanner.close();

	} // main

} // class
