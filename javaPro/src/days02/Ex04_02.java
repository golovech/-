package days02;
/**
 * @author dewbuster
 * @date 2024. 7. 2. - 오후 2:35:49
 * @subject (암기) 두 기억공간의 값을 바꾸기
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		// [10] [20]
		//   x      y
		/*
		 * int x = 10;
		 * int y = 20;
		 */
		
		// 콤마연산자
		int x = 10, y = 20;
		
		System.out.printf("교환전 > x=%d, y=%d\n", x, y);
		
		// 두 기억공간의 값을 바꾸기 -> 임시기억공간
		{
			int temp;
			temp = x;
			x = y;
			y = temp;
		}
		System.out.printf("교환후 > x=%d, y=%d\n", x, y);

	} //main

} //class
