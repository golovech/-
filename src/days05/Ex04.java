package days05;

public class Ex04 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 10; i+=2) {
			// if ( i % 2 != 0 ) {
			System.out.printf("%d+", i);
			sum += i;
			// }
		}
		System.out.printf("=%d\n", sum);

		sum = 0;
		for (int i = 2; i <= 10; i+=2) {
			System.out.printf("%d+", i);
			sum += i;
		}
		System.out.printf("=%d\n", sum);
		
	} // main

} // class
