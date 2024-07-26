package days20;

import java.util.Hashtable;
// import static Gender.*;

/**
 * @author love
 * @date 2024. 7. 26. - 오후 4:29:09
 * 					*** 열거형(enums) ***
 * 				1. jdk 1.5 에 추가
 * 				2. 서로 관련된 상수를 편리하게 사용하기 위한것.
 * 				예) 성별 - 남자, 여자
 * 					int gender = 1/0;
 * 					boolean gender = false/true;
 * 					char gender = 'm'/'f';   등등 . . .
 * 				3. 열거형 선언 형식
 * 				   접근지정자 enum 열거형이름 { 
 * 				   상수명, 상수명 . . . (대문자 사용함)
 * 					}
 * 				4. 열거형이름.상수명
 * 				5. 열거형은 컴파일 될때 클래스로 바뀌어 컴파일됨.
 * 					extends java.lang.Enum 클래스 상속받아 컴파일됨.
 * 				6. Enum 클래스
 * 					ㄴ	ordinal() : 열거형 상수가 정의된 순서 반환
 * 					ㄴ	name()	  : 열거형 상수명을 문자열로 반환하는 함수
 * 					ㄴ	valueOf() : name()와 일치하는 "열거형 상수"를 반환.
 * 				
 *
 */
public class Ex10 {
	
	enum Direction { EAST, SOUTH, WEST, NORTH } // 열거형 선언

	public static void main(String[] args) {
		
		System.out.println(Card.CLOVER); // CLOVER
		System.out.println(Card.CLOVER.name()); // "CLOVER"
		System.out.println(Card.CLOVER.ordinal()); // 0
		
		switch (Card.valueOf("HEART")) {
		case CLOVER:
			
			break;
		case DIAMOND:
			
			break;
		case HEART:
			
			break;
		case SPADE:
			
			break;

		default:
			break;
		}
		
//		if (Gender.여자) {
//			
//		} else {
//
//		} 
//		

	} // main

} // class

// enum Direction { EAST, SOUTH, WEST, NORTH }

class Gender {
	public static final boolean 여자 = true;
	public static final boolean 남자 = false;
}