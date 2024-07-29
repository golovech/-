package days21;

import java.io.FileWriter;

public class Ex08 {

	public static void main(String[] args) {
		// [ DataInputStream / DataOutputStream ]
		// 바이트 스트림
		// 기본형 8가지를 읽기/쓰기 쉽도록 구현됨.
		String name = "최사랑";
		int kor = 99, eng = 89, mat = 35;
		int tot = kor + eng + mat;
		double avg = (double)tot / 3;
		boolean gender = true;
		
		//student.txt
		
		String fileName = ".\\src\\days21\\student.txt";
		try (FileWriter writer = new FileWriter(fileName);){
			String info = String.format("%s, %d, %d, %d, %d, %f, %b \n", name,kor,eng,mat,tot,avg,gender);
			writer.append(info);
			writer.flush();
			System.out.println(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
		
		
	} // main

} // class
