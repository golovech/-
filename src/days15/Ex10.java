package days15;
/**
 * @author love
 * @date 2024. 7. 19. - 오후 4:32:15
 * @subject
 * @content
 *
 */
public class Ex10 {

	public static void main(String[] args) {
		// 인터페이스: 상수, 추상메서드만 + [static + default]는 뭘까?
		
		// 1) 디폴트 메서드와 클래스의 메서드가 충돌나면
		///    ==> 디폴트 메서드는 무시가 된다. 
		// 2) 여러 인터페이스를 구현하다가
		//  디폴트 메서드와 충돌나면 
		//    ==> 충돌나는 디폴트 메서드를 오버라이딩하면 해결.
		

	} //main

} //class


interface Ia{
	// 3개의 추상메서드
}

interface Ib{
	// 1개의 추상메서드
}

interface Ic extends Ia, Ib { // 인터페이스끼리 상속은 extends (다중상속)
	// 3개의 추상메서드 (Ia 상속)
	// 1개의 추상메서드 (Ib 상속)
	
	// 1개의 추상메서드
	
}

class A1 implements Ia { // 클래스와 인터페이스의 상속은 implements
	//오버라이딩
	// 3개의 추상메서드 선언(Ia상속)
}

class A2 implements Ib { // 클래스와 인터페이스의 상속은 implements
	//오버라이딩
	// 1개의 추상메서드 선언(Ib상속)
}

class A3 implements Ic { // 클래스와 인터페이스의 상속은 implements
	//오버라이딩
	// Ia, Ib 모두의 (4개) 추상메서드 선언  (Ic상속)
	
	void newMethod() {
		// 꼭 필요하다.
	}
	
}