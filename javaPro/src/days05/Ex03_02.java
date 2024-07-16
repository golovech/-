package days05;

import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int kor;
		boolean flag = false;
		
		do {
			if (flag) {
				System.out.print("입력잘못!!!\n 다시 ");
			}
			flag = true;
			System.out.print("국어점수 입력 ? ");
			kor = scanner.nextInt();
			
		} while (!(0 <= kor && kor <= 100));
		// } while ((0 > kor || kor > 100));
		// 입력한 값들은 항상 [유효성 검사]가 필요하다.
		
		// 한글자는 char에 저장 String은 처리 느림.
		
		// jdk 14         case 10, 9:  <- 가능
		char grade;
		switch (kor / 10) {
		case 10:	case 9:
			grade = '수';
			break;
		case 8:
			grade = '우';
			break;
		case 7:
			grade = '미';
			break;
		case 6:
			grade = '양';
			break;
		default:
			grade = '가';
			break;
		}
		
		System.out.printf("%d : %c\n",kor, grade);
		
		scanner.close();

	} // main

} // class
