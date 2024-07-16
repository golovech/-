package days06;

import java.util.Scanner;

public class Ex03_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("한 문자 입력 ? ");
		String strOne = scanner.next();

		if ( strOne.matches("[가-힣]") ) {
			System.out.println("대문자입니다.");
		} else if ( strOne.matches("[A-Z]") ) {
			System.out.println("대문자입니다.");
		} else if ( strOne.matches("[a-z]") ) {
			System.out.println("소문자입니다.");
		} else if ( strOne.matches("\\d") ) {
			System.out.println("숫자입니다.");
		} else if ( strOne.matches("[#$%@]") ) {
			System.out.println("특수문자입니다.");
		} else {
			System.out.print("알수없는 문자.");
		}


		scanner.close();

	} // main

} // class
