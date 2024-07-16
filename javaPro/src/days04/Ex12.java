package days04;

//import java.util.Scanner;

/**
 * @author dewbuster
 * @date 2024. 7. 4. - 오후 5:11:11
 * @subject
 * @content
 *
 */
public class Ex12 {

	public static void main(String[] args) {
		/*
		// 1~n까지의 합
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수(n) 입력 ? ");
		int n = scanner.nextInt();
		
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d", sum);
		
		scanner.close();
		*/
		
		/* 1번문제
		Scanner scanner = new Scanner(System.in);
		int kor;
		System.out.print("국어 점수 입력 ? ");
		kor = scanner.nextInt();
		
		if (90 <= kor && kor <= 100) {
			System.out.println("수");
		} else if (80 <= kor && kor <= 89){
			System.out.println("우");
		} else if (70 <= kor && kor <= 79){
			System.out.println("미");
		} else if (60 <= kor && kor <= 69){
			System.out.println("양");
		} else if (0 <= kor && kor <= 59 ) {
			System.out.println("가");
		} else {
			System.out.println("잘못된 점수입니다.");
		}
	
		scanner.close();
		*/
		
		/* 2번 문제
		Scanner scanner = new Scanner(System.in);
		int kor;
		System.out.print("국어 점수 입력 ? ");
		kor = scanner.nextInt() / 10;

		switch (kor) {
		case 10: case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		case 5: case 4: case 3: case 2: case 1: case 0:
			System.out.println("가");
			break;
		default:
			System.out.println("잘못된 점수입니다.");
			break;
		}
		
		scanner.close();
		*/
		
		/* 3번 문제
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) continue;
			
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d", sum);
		*/
		/* 4번 문제
		int i = 0, sum = 0;

		while (++i <= 10) {
			if (i % 2 == 0) continue;

			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d", sum);
		*/
		
		/* 5번문제 for문
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;

		System.out.print("정수(n m) 입력 ? ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		if (n > m) {
			int temp;
			temp = n;
			n = m;
			m = temp;
		}
		
		for (int i = n; i <= m; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		
		System.out.printf("=%d", sum);
		
		scanner.close();
		*/
		
		/* 문제5번 while문
		Scanner scanner = new Scanner(System.in);

		int sum = 0;

		System.out.print("정수(n m) 입력 ? ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		if (n > m) {
			int temp;
			temp = n;
			n = m;
			m = temp;
		}
		
		while (n <= m) {
			System.out.printf("%d+", n);
			sum += n;
			n++;
		}
		
		System.out.printf("=%d", sum);
		scanner.close();
		*/

	} // main

} // class


/*
* [문제1] 국어점수를 입력받아서 수100~90/우80~89/미70~79/양60~69/가0~59 출력 (if문)
* [문제2] 국어점수를 입력받아서 수/우/미/양/가 출력 (switch문)
* [문제3] 1~10까지의 홀수의 합( for문 )
* [문제4] 1~10까지의 홀수의 합( while문 )
* [문제5] 두 정수(n,m)을 입력받아서 두 정수 사이의 합을 출력 (for문, while문)
*
*/