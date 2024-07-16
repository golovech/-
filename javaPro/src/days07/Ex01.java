package days07;

public class Ex01 {

	public static void main(String[] args) {
		
		double sum = 0;
		boolean sw = false;
		
		for (int i = 1; i <= 8; i++) {
			if (!sw) {
				System.out.printf("%d/%d-", i, i+1);
				sum +=  i / (i +1.0 ); 
			} else {
				System.out.printf("%d/%d+", i, i+1);
				sum -=  i / (i +1.0 ); 
			}
			sw = !sw;
		}
		System.out.printf("\b=%f", sum);

	} // main

} // class
