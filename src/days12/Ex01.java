package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author dewbuster
 * @date 2024. 7. 16. - 오전 9:04:20
 * @subject
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		final int CLASS_COUNT = 3; // 3반이 있다.
		final int STUDENT_COUNT = 30; // 30명이 있다.
		
		Student [][] students = new Student [CLASS_COUNT][STUDENT_COUNT];
		int [] counts = new int [CLASS_COUNT]; 
		char con = 'y';

		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg; 
		
		Scanner scanner = new Scanner(System.in);
		int cldx ; //1반이라면 0.
		do {
			System.out.printf("> 반 입력?");
			cldx = scanner.nextInt() -1;

			System.out.printf("> %d반의 [%d]번 학생의 이름,국어,영어,수학점수 입력?", cldx +1 , counts[cldx]+1);
			// ban - 1은 0부터 시작하니까.. 1을 빼주는것. count는 왜 +1이지???? 0번은 1번이기 때문.

			name = getName(); //scanner.next();
			kor = getScore();//scanner.nextInt();
			eng = getScore();//scanner.nextInt();
			mat = getScore();//scanner.nextInt();
			
			tot = kor + eng + mat;
			avg = (double)tot/3;
			wrank = rank = 1;

			students[cldx][counts[cldx]] = new Student(); 
			
			students[cldx][counts[cldx]].name = name;
			students[cldx][counts[cldx]].kor = kor;
			students[cldx][counts[cldx]].eng = eng;
			students[cldx][counts[cldx]].mat = mat;
			students[cldx][counts[cldx]].tot = tot;
			students[cldx][counts[cldx]].rank = rank;
			students[cldx][counts[cldx]].wrank = wrank;
			students[cldx][counts[cldx]].avg = avg;

			counts [cldx]++;


			System.out.print("> 입력 계속?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y'); // do while
		
		//반, 전 등수 처리 st
		
		
		for (int i = 0; i < counts.length; i++) {
			for (int j = 0; j < counts[i]; j++) {
				
				for (int i2 = 0; i2 < counts.length; i2++) {
					for (int j2 = 0; j2 < counts[i2]; j2++) {
						if (students[i][j].tot < students[i2][j2].tot) {
							students[i][j].wrank++;
							if (i==i2) {
								students[i][j].rank++;
							}
						}
					}
				}
			}
		}
		
		//반, 전 등수 처리 
		
		

		int 총학생수 = IntStream.of(counts).sum(); // 배열의 총 합이 나옴.
		System.out.printf(" \t\t학생 정보 출력 (%d명)\n", 총학생수);
		for (int i = 0; i < counts.length; i++) { // 반
			System.out.printf(" [%d반 학생 : %d명]\n",i+1, counts[i]);


			for (int j = 0; j < counts[i]; j++) { // 학생수
				System.out.printf("[%d]",j+1); // 1면은 0 -> 국어. 2면은 1, 영어.. . .
				students [i][j].dispInfo();
			}
		}

	}	// main


	private static String getName() {
		Random rnd = new Random();
		String [] lastNames= {"김","이","박","최","권","홍"};
		int index = rnd.nextInt(lastNames.length);
		String name = lastNames[index];

		char [] firstNames = new char [2];
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = (char) (rnd.nextInt('힣' - '가' + 1) + '가');
		}
		String firstName = String.valueOf(firstNames);
		name = name + firstName;

		return name;
	}

	public static int getScore() {
		return (int)(Math.random ()*100);
	}

} // class
