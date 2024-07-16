package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("팀원들을 입력하세요 ? ");
		String[] names= bufferedReader.readLine().split("\\s*,\\s*");
		
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%d. 팀원 : %s\n", i+1, names[i]);
		}

	} // main

}  // class
