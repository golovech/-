package days12;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 *  [JVM의 메모리 구조]
		 *  자바 응용 프로그램 -> 실행 -> JVM 가상머신에서 실행됨.
		 *  					-> 사용할 메모리 할당받음.
		 * 		1) call Stack
		 * 			int i = 1;
		 * 			int [] m ;
		 * 			지역변수, 매개변수.
		 * 
		 * 		2) heap (동적 영역)
		 * 			new int[3];
		 * 			new student();
		 * 
		 * 		3) method Area 에
		 * 			processRank() 메서드가 등록됨.
		 * 			클래스(static) 변수 저장됨.
		 *			클래스 파일 (  .class) 에 대한 정보 저장
		 *			클래스, 인터페이스 정보 저장되는 영역 --> method Area
		 */
		
		/*
		 * [ 3가지 종류의 변수 ]
		 * 1. 선언 위치에 따른 변수의 종류
		 * 		ㄱ. 지역변수
		 * 		ㄴ. 클래스 안에 선언되는 변수 == 멤버변수 == 필드
		 * 		1) 인스턴스 변수
		 * 		2) 클래스 변수
		 * */
		

	}

}
