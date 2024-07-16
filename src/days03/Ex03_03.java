package days03;

/**
 * @author dewbuster
 * @date 2024. 7. 3. - 오후 12:42:31
 * @subject 타입(형) 변환
 * @content  1) 자동 형 변환
 * 				 2) 강제 형 변환
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		
		int no = 15;
		System.out.printf("%d\n", no);
		System.out.println("-".repeat(20));
		System.out.printf("%4d\n", no);
		System.out.printf("%04d\n", no);  // 4칸을 비우되 왼쪽 빈칸은 모두 0으로 채운다
		
		// 3.14 => double
		//float pi = (float) 3.14;
		
		//int i = 100;
		// 자동 형 변환
		//long l = i;
		
		// 자동 형 변환 2번째 경우
		//long k = l + i ;  // 큰 자료형 + 작은 자료형 = 큰 자료형
		
		// 강제 형 변환 (변환하고자 하는 타입) cast 연산자
		//i = (int) 100L;
		
		// () 최우선 연산자  ( 3 + 5 ) * 2 == 16
	}

}
