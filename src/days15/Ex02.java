package days15;

public class Ex02 {

	public static void main(String[] args) {
		// [추상(abstract) 메서드]
		//  ㄴ 몸체(body)가 없는 메서드
		
		// [추상(abstract) 클래스]
		//  ㄴ 공통적인 멤버를 가진 클래스(ex.도형) 설계할 때,, 추상클래스를 만듦. // 따로 빼서 상속하려고 할때의 용도.
		//  ㄴ 객체를 생성할 수 없다. 객체 생성할 목적이 아니다.
		//      ㄴ  new Parent(); => 불가
		
			Parent p = new Child();
			p.dispA();
	}

}

abstract class Parent{
	// 필드
	// 생성자
	// 추상메서드
	abstract void dispA();
	abstract void dispB();
	abstract void dispC();
}
class Child extends Parent{ // 반드시 재정의(?뜻은?)해야한다. -> 추상클래스가 아니게 된다. // 자식은 부모의 몸체 1개라도 구현 안했다면, 추상클래스가 된다.

	@Override
	void dispA() {		
	}

	@Override
	void dispB() {		
	}

	@Override
	void dispC() {		
	}
	
}