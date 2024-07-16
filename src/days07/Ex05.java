package days07;

public class Ex05 {

	public static void main(String[] args) {
		
		//계차수열
		
		int term = 1;
		int difference = 0;
		int sum = 0;
		
		for (int i = 1; i <= 20; i++) {
			term += difference;
			System.out.printf("%d+", term);
			difference++;
			sum += term;
		}
		System.out.printf("=%d\n", sum);
		
		/*
		int term = 1;
		int nextTerm;
		int sum = term;
		System.out.printf("%d+", term);
		for (int i = 1; i <= 19; i++) {
			nextTerm = term + i;
			System.out.printf("%d+", nextTerm);
			sum += nextTerm;   // 1  sum = 2
			term = nextTerm;
		}
		System.out.printf("=%d\n", sum);
		*/
	} // main

} // class
