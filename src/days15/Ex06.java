package days15;
/**
 * @author love
 * @date 2024. 7. 19. - 오후 2:31:16
 * @subject		[ final 키워드 정리 ]
 * @content		1. final이 class 선언시 앞에 붙는 경우 : 최종 클래스 (자식 클래스 못가짐)
 * 				2. 메소드 앞에 final == 더 오버라이딩 할수 X (재정의할수X)
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		
		// final + 변수 == 상수 // 		상수로 만들기 위해 double 앞에 final 붙임.
		final double PI = 3.141592; // 메인에서 사용되는 지역변수.
		
		FinalTest ft = new FinalTest();
		ft.test(10);
		

	} // main

} // class

class P{
	
	// 필드 
	final int MAX_VALUE = 1; // 명시적 초기화
	final int MIN_VALUE; 
	
	P(int minValue){ // 생성자 초기화
		MIN_VALUE = minValue;
	}
	
	
	
	
	final int disp() { // 메소드 앞에 final == 더 오버라이딩 할수 X (재정의할수X)
		int age = 100;
		return 0;
	}
	
}
class C extends P{

	C(int minValue) {
		super(minValue);
		
	}
	
//	int disp() { // final 메서드는 자식클래스에서 재정의할 수 없다.
//		return 100; 
//	}
}

// 1. final이 class 선언시 앞에 붙는 경우 : 최종 클래스 (자식 클래스 못가짐)
final class FinalTest{
	//       		 매개변수     // final이 붙으면 ==>  상수 매개변수가 됨.
	void test(final int n) {
		
		
	}
	
}