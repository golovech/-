package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		System.out.print("정수(n) 입력 ? ");
		int n = Integer.parseInt(bufferedReader.readLine());
		
		for (int i = 1; i <= n; i++) {
			
			System.out.printf("%d+", i);
			
			sum += i;
		}
		
		System.out.printf("=%d", sum);

	}

}
