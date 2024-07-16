package days05;

public class Ex05 {

	public static void main(String[] args) {
		
		/* 1번 풀이
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			if ( i % 2 != 0 ) {				
				System.out.printf("%d+", i);
				sum += i;
			}
			i++;
		} // while
		
		System.out.printf("=%d\n", sum);
		*/
		int sum = 0;
		int i = 0;
		while (++i <= 10) {
			if ( i % 2 == 0 ) {	
				continue;
			}
			System.out.printf("%d+", i);
			sum += i;
		} // while
		
		System.out.printf("=%d\n", sum);
		
	} // main

} // class
