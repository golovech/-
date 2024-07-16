package weekend01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = "";
		int i = 0, lineNumber = 1;
		
		while (i < 256 && str.isEmpty()) {
			
			if (i % 10 == 0) System.out.printf("%d : ", lineNumber++);

			System.out.printf("[%c]", i);
			
			if (i % 10 == 9) {
				System.out.println();
				System.out.print("계속 출력하려면 Enter");
				str = scanner.nextLine();
				}
			i++;
		}
		scanner.close();
	}
}
