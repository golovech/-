package days10;

import java.util.Arrays;

public class Ex04_05 {

	public static void main(String[] args) {
		
		// 정렬하는 작업에 대해. sort//
		// 일정한 순서로 다시 배치하는 것.
		// 오름차순 asc 12345 a~z
		// 내림차순 desc 54321 z~a
		// [버블정렬] V
		// 선택정렬 V
		// 삽입정렬
		// 병합정렬

		int [] m = {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		//bubbleSort(m);
		selectSort(m);
	} 
	// 선택정렬
	private static void selectSort(int[] m) {
		for (int i = 0; i < 4; i++) { // 행 4개
			for (int j = i+1; j <= 4; j++) { // 열
				System.out.printf("%d - %d", i, j);
				if (m[i] > m[j]) {
					System.out.print("change");
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
					
							
				}
				System.out.println(Arrays.toString(m));
			}
		}System.out.println();
		
	}
//	//버블정렬!
//	private static void bubbleSort(int [] m) {
//		
//		
//		
//	}

}
