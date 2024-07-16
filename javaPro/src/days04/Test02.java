package days04;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//홍길동,이시훈, 송세호
		Scanner scanner = new Scanner(System.in);
		System.out.print("팀원들을 입력하세요 ? ");
		String data = scanner.nextLine();
		String regex = "\\s*,\\s*";
		String [] names = data.split(regex);

		for (int i = 0; i < names.length; i++) {
			System.out.printf("%d. 팀원 : %s\n", i+1,  names[i]);
		}
		/*
	      System.out.printf("1. 팀원 : %s\n", names[0]);
	      System.out.printf("2. 팀원 : %s\n", names[1]);
	      System.out.printf("3. 팀원 : %s\n", names[2]);
		 */
		scanner.close();

	}

}
