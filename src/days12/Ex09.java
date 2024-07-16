package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author love
 * @date 2024. 7. 16. - 오후 4:16:28
 * @subject
 * @content
 *
 */
public class Ex09 {
	static String name;
	static int kor, eng, mat, tot, rank;
	static double avg;

	static final int STUDENT_COUNT = 30;

	static Student [] students = new Student [STUDENT_COUNT];


	static Scanner scanner = new Scanner(System.in);
	static int count = 0;
	static int con = (char)'y';

	
	public static void main(String[] args) throws IOException {
		
		studentInfomationInput();
		studentInfomationOutput();
		
		// days10.Ex01_02.java -> 클래스 배열 사용하여 코딩 수정 -> 유레카다~
		// Student.java
//		final int STUDENT_COUNT = 30;
//		// 클래스 배열 선언
//		Student [] students = new Student [STUDENT_COUNT];
//
//		Scanner scanner = new Scanner(System.in);
//		int count = 0;
//		int con = (char)'y';

	}

	
	private static void studentInfomationOutput() {
		 System.out.printf("총 학생수 : %d\n", count);
	
		 for (int i = 0; i < count; i++) {
			System.out.printf("[%d]\t" ,i+1);
			students[i].dispInfo();
		}
	}

	private static int studentInfomationInput() throws IOException {
		do {
			
			System.out.printf("> %d번 학생의 이름, 국어, 영어, 수학을 입력하시겠습니까?", count+1);
			
			name = getName(); //scanner.next();
			kor = getScore();//scanner.nextInt();
			eng = getScore();//scanner.nextInt();
			mat = getScore();//scanner.nextInt();
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;
			
			
			students[count] = new Student(); // 클래스 배열 초기화
			students[count].name = name;
			students[count].kor = kor;
			students[count].eng = eng;
			students[count].mat = mat;
			students[count].tot = tot;
			students[count].avg = avg;
			students[count].rank = rank;
			
			count++;
			
			System.out.print("> 학생 입력을 계속 하시겠습니까?");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)== 'Y'); // 대문자로 바꾸는 함수
		
		
		return 0;
		
		
	}
	{
	processRank(); 
	}
	 
	public static void processRank() {
		for (int i = 0; i < count; i++) {
			students[i].rank = 1;
			for (int j = 0; j < count; j++) {
				if (students[i].tot < students[j].tot) students[i].rank++; {
					
				}
			}
		}
	}
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
