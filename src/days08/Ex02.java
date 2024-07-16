package days08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 검색(search)
		// 1) 순자검색(Sequence Search)
		// 2) 이진검색(Binary Search)
		Scanner scanner = new Scanner(System.in);
		int[] m = new int[20];
		// 1~100 임의의 정수
		fillM(m);
		dispM(m);
		
		int searchNumber = getSearchNumber(scanner);
		int index = sequenceSearch(m, searchNumber);
		
		if (index == -1) {
			System.out.println("찾는 정수는 없다.");
		} else {
			System.out.printf("찾는 정수는 %d 인덱스 위치에 있다.\n", index);
		}

		
	}


	private static int sequenceSearch(int[] m, int searchNumber) {
		int index = -1;
		for (int i = 0; i < m.length; i++) {
			if (m[i] == searchNumber) {
				index = i;
				break;
			}
		}
		return index;
	}


	private static int getSearchNumber(Scanner scanner) {
		// * 0~무한대
		// + 1~ 무한대
		// ? 0 1
		String regex = "\\d+";
		String strSearchNumber;
		do {
			System.out.print("검색할 정수 입력 ? ");
			strSearchNumber = scanner.next();
			
		} while (!strSearchNumber.matches(regex));
		
		int searchNumber = Integer.parseInt(strSearchNumber);
		return searchNumber;
	}


	public static void fillM(int[] m) {
		Random rnd = new Random();
		for (int i = 0; i < m.length; i++) {
			m[i] = rnd.nextInt(100)+1;
		}
	}

	public static void dispM(int[] m) {
		System.out.println(Arrays.toString(m));	
	}
}