package days06;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char one;
		System.out.print("한 문자 입력 ? ");
		one = scanner.next().charAt(0);

		if ( '가' <= one && one <= '힣' ) {
			System.out.println("대문자입니다.");
		} else if ( 'A' <= one && one <= 'Z' ) {
			System.out.println("대문자입니다.");
		} else if ( 'a' <= one && one <= 'z' ) {
			System.out.println("소문자입니다.");
		} else if ( '0' <= one && one <= '9' ) {
			System.out.println("숫자입니다.");
		} else if ( ('#' <= one && one <= '&') || one == '!' || one == '@' ) {
			System.out.println("특수문자입니다.");
		} else {
			System.out.print("알수없는 문자.");
		}


		scanner.close();

	} // main

} // class
