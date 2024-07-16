package days04;

import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) {

		String name;
		byte age;
		char rank;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름, 나이, 등급을 입력하세요 ? ");
		name = scanner.next();
		age = scanner.nextByte();
		rank = scanner.next().charAt(0);
		
		System.out.printf("이름=\"%s\", 나이=%d살, 등급='%s'", name, age, rank);
		
		scanner.close();
	}

}
