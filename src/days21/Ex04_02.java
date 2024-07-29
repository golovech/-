package days21;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		
		// 실행 후
		// 1. 저장할 파일명 입력? / test.txt 엔터
		// 2. 저장할 내용 입력? / 문자열 입력 . . . 엔터
		//    입력 계속하시겠습니까? y , n : 파일에 쓰는 작업 후 나오기.
		
		String parent = ".\\src\\days21";
		String child ;
		char con = 'y';
		String content ;
		
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("1. 저장할 파일명 입력?");
			child = scanner.next();
			
			File file = new File(parent, child);
			
			do {
				try (FileWriter writer = new FileWriter(file, true)){ // FileWriter 를 불린형으로 바꿔서, append(추가)하여 true로 써주면.. 덮어씌워지는게아니라 추가됨.
					System.out.print("2. 저장할 문자열 입력?");
					content = scanner.next();
					writer.write(content + "\r\n");

				} catch (Exception e) {
					e.printStackTrace();
				} // try
				
				System.out.println("계속?");
				con = (char)System.in.read();
				System.in.skip(System.in.available());
				
			} while (Character.toUpperCase(con)=='Y');
			
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		

	} // main

} // class
