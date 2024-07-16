package days06;


public class Ex08 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		//3. 풀이 (시험) 복습
		boolean sw = false;
		for (int i = 1; i <= 10; i++) {
			if (!sw) {
				System.out.printf("%d-", i);
				sum += i;
			} else {
				System.out.printf("%d+", i);
				sum -= i;
			}
			sw = !sw;
		}
		System.out.printf("=%d", sum);
				
		/* 2번 풀이
		for (int i = 1; i <= 10; i++) {
			System.out.printf(i%2==0?"%d+":"%d-", i);
			sum += i%2==0? -i:i;
		}
		System.out.printf("=%d", sum);
		*/
		
		/* 1번 풀이
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d+", i);
				sum -= i;
			} else {
				System.out.printf("%d-", i);
				sum += i;
			}
		}
		System.out.printf("=%d", sum);
		*/
		
	} // main

} // class
