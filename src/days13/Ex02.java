package days13;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 *  [멤버(필드, 메서드, 생성자)앞의 접근지정자 ] ** 암기
		 *  1. public - 패키지 내부, 외부 어디에서나 참조가능
		 *  2. package(defualt) - 패키지 내부에서만 참조가능
		 *  3. private - 클래스 내부에서만 참조가능
		 *  4. protected == package(defualt) + [상속]
		 *  									ㄴ ** 패키지 외부라도, 상속관계가 있다면 참조 가능 **
		 *  
		 *  접근범위 : public > protected > package > private
		 *  		 
		 **/
		
//		지역변수는 접근지정자를 사용할 수 없다.
//		public int age = 20; ㄴㄴ
		
		// Time.java
		Time t = new Time();
		t.hour = 10;
		t.minute = 15;
		t.second = 2;
		
		t.privateTest();
		t.test();

	} // main

} // class
