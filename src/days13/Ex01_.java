package days13;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex01_ {

	public static void main(String[] args) throws IOException {
		
		final int CLASS_COUNT = 3; // 3반이 있다.
		final int STUDENT_COUNT = 30; // 30명이 있다.


		String [][] names = new String [CLASS_COUNT][STUDENT_COUNT]; // 2차원 배열.
		int [][][] infos = new int [6] [CLASS_COUNT][STUDENT_COUNT]; // 3차원 배열.
		// 수학점수 2반 19번 -> infos [2][1][18]
		double [][] avgs = new double [CLASS_COUNT] [STUDENT_COUNT];

		// 입력받은 학생 수 저장할 변수 선언
		int [] counts = new int [CLASS_COUNT]; 

		char con = 'y'; // continue의 con . 계속할거냐? 묻는것.

		String name;
		int kor, eng, mat, tot, rank, wrank;
		double avg; // 학생 개인의 정보 변수 입력.

		Scanner scanner = new Scanner(System.in); // 스캔받음.

		int ban ; // 1반, 2반, 3반. 반의 변수선언.
		do {
			// 1. 반 입력?
			System.out.printf("> 반 입력?");
			ban = scanner.nextInt();

			// 2. 그 반의 학생 정보 입력?
			System.out.printf("> %d반의 [%d]번 학생의 이름,국어,영어,수학점수 입력?", ban, counts[ban-1]+1);

			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			tot = kor + eng + mat;
			avg = (double)tot/3;
			wrank = rank = 1;

			names[ban-1][counts[ban-1]] = name;
			infos[0][ban-1][counts[ban-1]] = kor;
			infos[1][ban-1][counts[ban-1]] = eng;
			infos[2][ban-1][counts[ban-1]] = mat;
			infos[3][ban-1][counts[ban-1]] = tot;
			infos[4][ban-1][counts[ban-1]] = rank;
			infos[5][ban-1][counts[ban-1]] = wrank;
			avgs[ban-1][counts[ban-1]] = avg;

			counts [ban-1]++;



			// 입력 계속?
			System.out.print("> 입력 계속?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con) == 'Y'); // do while

		int 총학생수 = IntStream.of(counts).sum(); // 배열의 총 합이 나옴.
		System.out.printf(" \t\t학생 정보 출력 (%d명)\n", 총학생수);
		for (int i = 0; i < counts.length; i++) { // 반
			System.out.printf(" [%d반 학생 : %d명]\n",i+1, counts[i]);


			for (int j = 0; j < counts[i]; j++) { // 학생수
				System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n"
						,j+1, names[i][j],
						infos[0][i][j],
						infos[1][i][j],
						infos[2][i][j],
						infos[3][i][j],
						avgs[i][j],
						infos[4][i][j],
						infos[5][i][j]); // 1면은 0 -> 국어. 2면은 1, 영어.. . .
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
}
