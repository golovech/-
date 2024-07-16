package days06;

public class Test {

	public static void main(String[] args) {
		
		int sum = 0;
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
		System.out.printf("\b=%d", sum);
		
		/*
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d*%d=%d\t", dan, i, dan*i);
			}
			System.out.println();
		}
		*/
		/*
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d*%d=%d\t", dan, i, dan*i);
			}
			System.out.println();
		}
		*/

	} // main
	
} // class
