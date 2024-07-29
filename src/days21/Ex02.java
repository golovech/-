package days21;

import java.util.Scanner;

/**
 * @author love
 * @date 2024. 7. 29. - 오전 9:13:53
 * @subject
 * @content
 *
 */
public class Ex02 {

	// @Override
	// 어노테이션 : 컴파일러에게 오버라이딩 한 메서드라고 알려주는 역할.
	
	public static void main(String[] args) {
		/*
		 *  [ 어노테이션 (Annotation) ]
		 *  1. 의미 : 주석 / @~
		 *  2. 정의 : 소스 코드에 다른 프로그램이 필요로 하는 특별한 형식을 추가하는 것.
		 *  3. jdk에서 기본적으로 제공하는 어노테이션 : 표준 어노테이션.
		 *  4. 표준 어노테이션 종류
		 *    1) @Override
		 *    2) @Deprecated : 생성자, 필드, 메서드가 앞으로 없어질 예정이다, 를 나타냄.
		 *    3) @SuppressWarnings : 컴파일러의 특정 경고 메세지가 나타나지 않게 하는 어노테이션.
		 *    4) @FunctionInterface : 함수형 인터페이스다, 라고 알려줌.
		 *    5) @SafeVarargs : 제네릭 타입의 가변인자에 사용되는 어노테이션.
		 *    6) @Natice : C언어의 메서드 -> 자바 코딩으로 가져와 사용할때.
		 *    
		 *    * 또 다른 어노테이션에 사용되는 어노테이션 : 메타 어노테이션
		 *    @Target, @Documented, @Inherited, @Retention, @Repeatable
		 *    
		 * */
		
		@SuppressWarnings({ "unused", "resource" }) // 컴파일러의 특정 경고 메세지가 나타나지 않게 하는 어노테이션.
		Scanner scanner = new Scanner(System.in);

	} // main

} // class
