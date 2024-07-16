package days06;

import java.io.IOException;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) throws IOException {

		int com, user;
		Scanner scanner = new Scanner(System.in);
		char con = 'y'; // 'y' or 'Y'
		String regex = "[1-3]";
		String strUser;
		
		do {
			com =(int) (Math.random() * 3) + 1;

			do {
				System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
				strUser = scanner.next();
			} while (!strUser.matches(regex));
			
			user = Integer.parseInt(strUser);

			String[] rps = {"", "가위", "바위", "보"};

			System.out.printf("사용자 : %s, 컴퓨터 : %s \n", rps[user], rps[com]);

			switch (user-com) {
			case 0:
				// 무승부
				System.out.println("무승부");
				break;
			case 1: case -2:
				// 사람 승리
				System.out.println("사용자 승리");
				break;
			default:
				// 컴퓨터 승리
				System.out.println("컴퓨터 승리");
				break;
			}

			//계속 여부
			System.out.print("다시 게임할거냐 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (con == 'y' || con == 'Y');
		
		System.out.println("가위바위보 게임 종료!");

		scanner.close();

	}

}
