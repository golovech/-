package days02;

/**
 * @author dewbuster
 * @date 2024. 7. 2. - 오후 3:48:05
 * @subject 숫자(정수계열)
 * @content byte(1), short(2), int(4), long(8)
 *
 */
public class Ex05_03 {

	public static void main(String[] args) {
		
		/*
		 * byte(1) -128 ~ 127
		 * 1byte = 8bit   2^7 = 128
		 * short(2) -32,768 ~ 32,767
		 * int(4) -21억 ~ 21억
		 * long(8) -900경 ~ 900경
		 * 
		 */
		
		// 사람의 나이를 저장할 변수 선언.
		byte age;
		// 국어점수를 저장할 변수 선언.
		byte korean;
		long l = 10L;
		//Type mismatch: cannot convert from double to float
		float f = 3.14f;
		double d= 3.14;
		
		System.out.printf("%d %d %f %f", 100, 100L, 3.14F, 3.14D);

	}

}
