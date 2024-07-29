package days21;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex12_02 {

	public static void main(String[] args) throws IOException {
		
		int [] score = {
	       // 번호  국  영  수
	            1, 100, 90, 90,    // 4*4
	            2, 70 , 90,100,
	            3, 100,100,100,
	            4, 70 , 60, 80,
	            5, 70 , 90,100
	      };
		String name = ".\\src\\days21\\score.dat";
		String mode = "rw";

		int no , kor, eng, mat;
		int tot;
		double avg;
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			int student = score.length/4;
			for (int i = 0; i < student; i++) {
				no = raf.readInt();
				kor = raf.readInt();
				eng = raf.readInt();
				mat = raf.readInt();
				tot = kor + eng + mat;
				avg = (double) tot / 3;
				 System.out.printf("번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", 
		                  no, kor, eng, mat, tot, avg);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 일시정지 + 엔터 계속.
		System.out.println("> 엔터치면 진행한다."); // 잠깐 멈춘다.
		System.in.read(); 
		System.in.skip( System.in.available() ); 
		
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			int pos = 4*4*2+4+4+4;
			raf.seek(pos); // 3번 수학점수로 이동
			raf.writeInt(20); // 20으로 수정
			
			pos = 4*4*2;
			raf.seek(pos); // 3번 학생으로 이동
			no = raf.readInt(); // 위에 코딩 복붙
			kor = raf.readInt();
			eng = raf.readInt();
			mat = raf.readInt();
			tot = kor + eng + mat;
			avg = (double) tot / 3;
			 System.out.printf("번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", 
	                  no, kor, eng, mat, tot, avg);
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	} // main

} // class