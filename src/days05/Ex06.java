package days05;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.print("정수(n, m) 입력 ? ");
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		//3번 풀이
		int min = Math.min(n, m);  // n > m ? m : n ;
		int max = Math.max(n,m);

		for (int i = min; i <= max; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d", sum);

		//2번 풀이
		/*
		if (n > m) {
			int temp = n;
			n = m;
			m = temp;
		}

		for (int i = n; i <= m; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d", sum);
		 */

		/* 1번 풀이
		if (m > n) {
			for (int i = n; i <= m; i++) {
				System.out.printf("%d+", i);
				sum += i;
			}
			System.out.printf("=%d", sum);

		} else {
			for (int i = m; i <= n; i++) {
				System.out.printf("%d+", i);
				sum += i;
			}
			System.out.printf("=%d", sum);
		}
		 */

		scanner.close();
	}

}
