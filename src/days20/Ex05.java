package days20;

import days14.Engine;

/**
 * @author love
 * @date 2024. 7. 26. - 오후 12:18:23
 * @subject
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		  		[ 내부(inner) 클래스 == 중첩 클래스, 중첩 인터페이스 ]
		  			ㄴ 클래스 안에 선언되는 클래스
		  			ㄴ 장점 : 내부 클래스 --> 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
		  					  코드의 복잡성을 줄일 수 있다.
		 		 class Car{
							Engine engine; // has - a 관계
							}
							
				 class Car{ // 외부 클래스
							class Engine { // 내부 클래스
											} 
							}
					ㄴ AWT, swing 에서 자주 사용
					
					ㄴ 내부 클래스의 종류
					  1) 인스턴스 클래스
					  2) static 클래스
					  3) 로컬 클래스 - 외부 클래스의
					  				   메서드 내부, 초기화 블럭에 선언된 클래스
					  				   메서드가 실행될 때만 사용할 수 있다.
					  4) 익명 클래스
					  
					  
		
		 
		 */

		A a = new A();
		a.disp();
		

		

	} // main

} // class

class A {
	private int age;
	public void disp() {
		
		// 3) 로컬 클래스
		class D{
			D(){}
			int d1;
			void test1() {
				
			}
		} // 로컬 클래스 선언
		
		D obj = new D();
		obj.test1();
		
	}
	
	
	// 2) 스태틱 클래스
	public static class C {
		// 모든 필드와 모든 메서드를 선언할 수 O
		public C() {
//			int c1;
//			static int sc1;
//			void test1() {}
//			static void test2() {} ---> 오류 남!! 왜!!
			
		}
		
	}
		
//			A.C c = new A.C();
//			c.c1 = 100;
//			c.test1();
//			
//			A.C.sc1 = 200;
//			A.C.test2();
	
	
	
	
	// 1) 인스턴스 클래스 / A 안에 생성된 B
	// (바깥) A 객체가 생성되어야 B 객체를 사용할 수 있다.
	public class B {
		
		// static 필드, 메서드 선언 할 수 없다.
		
		B(){}			// 생성자
		int b1;			// 필드
		void test() { 	// 메서드
			
//			A a = new A();
//			A.B b = a.new B();
//			b.b1 = 100;
//			b.test();
			
		}
	}

}




