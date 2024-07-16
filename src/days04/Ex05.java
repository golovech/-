package days04;

/**
 * @author dewbuster
 * @date 2024. 7. 4. - 오전 10:46:10
 * @subject 인덱스 연산자
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		
		// 타입[] 배열명 = new 타입[배열크기]
		int[] kors = new int[150];
		
		
		// == int [] kors = new int[] {1,2,3};
		// == int [] kors = {1,2,3};
		
		//    스택 (stack)
		//    [  주소값  ]
		//       kors
		// new -> 동적(Heap) 영역 : 프로그램 종료해도 남아 있음.
		//          첨자값(index)
		//          0번째요소 1번째  2번쨰
		//          [4bye] [4bye] [4bye]
		//         시작주소값
		
		kors[0] = 100;
		kors[1] = 80;
		kors[2] = 20;
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		System.out.println(kors[2]);
		//배열의 크기?
		System.out.println(kors.length);
		// 배열의 가장 큰 첨자값(index) == upperBound = kors.length - 1
		// 배열의 가장 작은 첨자값(index) == lowerBound = 0
		
		
	}

}
