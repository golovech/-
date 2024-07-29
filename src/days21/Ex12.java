package days21;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author love
 * @date 2024. 7. 29. - 오후 3:44:11
 * @subject
 * @content
 *
 */
public class Ex12 {

	public static void main(String[] args) throws IOException {
		// Piped[Reader] / Piped[Writer]
		//	ㄴ 스레드 간의 데이터를 입출력 할때 사용하는 스트림.
		//  [RandomAcessFile]
		//  ㄴ 파일의 어느 위치에나 읽기/쓰기가 가능한 장점.
		//  ㄴ getFilePoint()  파일포인트 /위치값
		//     seek(위치)
		//     readXXX(), writerXXX()

		String s = "I Love normal Java";
		String q = "javabook"; 
		String name = ".\\src\\days21\\random.txt";
		String mode = "rw";

		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			long fp = raf.getFilePointer(); // 위치찍기
			System.out.println("현재 파일 포인터의 위치 : " + fp);
			raf.writeBytes(s); // 읽기
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 일시정지 + 엔터 계속.
		System.out.println("> 엔터치면 진행한다."); // 잠깐 멈춘다.
		System.in.read(); 
		System.in.skip( System.in.available() ); // 13,10 제거
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			raf.seek(7); // 그 위치로 이동
			raf.writeBytes(q); // 자바북 읽기
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 일시정지 + 엔터 계속.
		System.out.println("> 엔터치면 진행한다."); // 잠깐 멈춘다.
		System.in.read(); 
		System.in.skip( System.in.available() ); 
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			raf.seek(2);
			String line = raf.readLine(); // 자바북 읽기
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("E N D !");

	} // main

} // class
