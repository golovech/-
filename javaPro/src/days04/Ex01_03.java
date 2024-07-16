package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01_03 {

	public static void main(String[] args) throws IOException {

		String name;
		byte age;
		char grade;
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		// "홍길동,23,A"
		System.out.print("이름, 나이, 등급을 입력하세요 ? ");
		String data = bufferedReader.readLine();
		// regex = 정규표현식
		String regex = "\\s*,\\s*";
		String[] datas = data.split(regex);
		// 공백지우고 처리하려면 datas[0].trim()
		name = datas[0];
		age = Byte.parseByte(datas[1]);
		grade = datas[2].charAt(0);
		System.out.printf("이름=\"%s\", 나이=%d살, 등급='%c'", name, age, grade);

	}

}
