package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		String name;
		byte age;
		char rank;
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름을 입력하세요 ? ");
		name = bufferedReader.readLine();
		System.out.print("나이를 입력하세요 ? ");
		age = Byte.parseByte(bufferedReader.readLine());
		System.out.print("등급을 입력하세요 ? ");
		rank = bufferedReader.readLine().charAt(0);

		System.out.printf("이름=\"%s\", 나이=%d살, 등급='%s'", name, age, rank);

	}

}
