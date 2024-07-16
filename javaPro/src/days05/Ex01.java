package days05;

public class Ex01 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+", i);
			//System.out.printf(i==10?"%d":"%d+", i);
			/*
			if (i == 10) {
				System.out.printf("%d", i);
			} else {
				System.out.printf("%d+", i);
			}
			*/
			sum += i;
		}
		System.out.printf("\b=%d", sum);  // \b <- 앞에 하나 지움 백스페이스

	} // main

}  // class
