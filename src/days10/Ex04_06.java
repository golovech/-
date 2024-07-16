package days10;

/**
 * @author dewbuster
 * @date 2024. 7. 12. - 오후 4:13:14
 * @subject
 * @content
 *
 */
public class Ex04_06 {

	public static void main(String[] args) {

		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30
				, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
				86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142
				, 145, 146, 150, 151, 160, 161, 166, 168, 
				169, 172, 181, 184, 185, 191, 198 };
		
		// System.out.println(m.length);
		int n = 150;
		
		int index = binarySearch(m,n);// 프로젝트때는 이걸 쓰면 됨.
		// int index = sequenceSearch(m, n);
		if (index == -1) {
			System.out.println("찾는 정수는 없다.");
		} else {
			System.out.printf("찾는 정수는 %d 인덱스 위치에 있다.\n", index);
		}

	} // main

	private static int binarySearch(int[] m, int n) {
		int bot = 0, top = m.length-1;
		int mid;
		int count = 0; // 몇번만에 찾았는지.
		while (top >= bot) {
			System.out.printf("%d 횟수\n", ++count);
			mid = (bot + top) / 2;
			if (m[mid] == n)return mid; 
			else if (m[mid] > n) top = mid - 1;
			else if (m[mid] < n) bot = mid + 1;
			
		}
		
		return -1;
	}



//	private static int sequenceSearch(int[] m, int n) {
//		int index = -1;
//		for (int i = 0; i < m.length; i++) {
//			if (m[i] == searchNumber) {
//				index = i;
//				break;
//			}
//		}
//		return index;
//	}

} // class
