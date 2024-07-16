package days02;
/**
 * @author dewbuster
 * @date 2024. 7. 2. - 오전 9:44:27
 * @subject 자바 수업 2일차
 * @content 변수
 *
 */
public class Ex01 {
	
	public static void main(String[] args) {
		// 메모리에 할당한 공간의 이름 = 변수 => 타입과 크기 결정
		// [변수 선언 형식]
		// 타입(자료형) 변수명(식별자);
		// 변수명: 숫자로 시작할 수 없음. 특수문자 $ _ 사용가능. 공백 금지
		String name = "원충희";  // = 대입연산자
		// 지역변수는 반드시 초기화해야지 사용할 수 있다.
		System.out.println(name);
		
		name = "이창익";
		System.out.println(name);
	}

}
