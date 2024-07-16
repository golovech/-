package weekend01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {		
		/*
		int num = (int)(Math.random() * 101);
		System.out.println(num);

		num = (int)(Math.random() * 45) + 1;
		System.out.println(num);
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int user, com;
		boolean flag = false;
		com = (int) ( Math.random() * 3 ) + 1;
		do {
			if (flag)
				System.out.print("다시 ");
			System.out.print("1(가위), 2(바위), 3(보) 선택: ");
			user = scanner.nextInt();
			flag = true;
		} while (1 > user || user > 3);
		
		String[] rps = {"", "가위", "바위", "보"};
		System.out.printf("사용자: %s, 컴퓨터: %s\n", rps[user], rps[com]);
		
		switch (user - com) {
		case 0:
			System.out.println("무승부");
			break;
		case 1: case -2:
			System.out.println("사용자 승리");
			break;
		default:
			System.out.println("컴퓨터 승리");
			break;
		}
		
		scanner.close();

	}

}
