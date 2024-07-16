package days05;

import java.util.Scanner;

/**
 * @author dewbuster
 * @date 2024. 7. 5. - 오후 2:51:43
 * @subject 컴퓨터 - 사용자(USER)
 * @content [ 가위(1), 바위(2), 보(3) 게임 ]
 * 컴퓨터는 게임을 할 때마다 임의의 수(1~3) 발생
 * 사용자는 1~3  입력.
 */
public class Ex07 {

	public static void main(String[] args) {
		int com, user;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> user 가위(1),바위(2),보(3) 선택 ? ");
		user = scanner.nextInt();

		//복습
		// 0.0 <= double < 1.0
		// 0.0 * 3 <= random < 1.0 * 3
		// 1 <= (int) (Math.random() * 3) + 1 < 3
		com =(int) (Math.random() * 3) + 1;
		// 1 이상 3+1 미만
		//com =(int) (Math.random() * 100) + 2;
		// 2이상 100+2 미만

		String strUser = "가위";
		if( user == 2 ) strUser = "바위";
		else if( user == 3) strUser ="보";

		String strCom = "가위";
		if( com == 2 ) strCom = "바위";
		else if( com == 3) strCom ="보";

		
		System.out.printf("사용자 : %s, 컴퓨터 : %s \n", strUser, strCom);
		/*
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
		*/
		int result = user - com;
		
		if (result == 0) {
			System.out.println("무승부");
		}else if (result == 1 || result == -2){
			System.out.println("사용자 승리");
		}else {
			System.out.println("컴퓨터 승리");
		}
		
		scanner.close();
		
	} // main

} // class
