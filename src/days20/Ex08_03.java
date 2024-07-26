package days20;

public class Ex08_03 {

	public static void main(String[] args) {
		/*
		 
		 		[제네릭의 제한]
		 제한 1) 제네릭클래스에는 클래스변수 선언 X
		 제한 2) 클래스 메서드에 T타입 사용 X
		 
		 ==>  스태틱이랑 같이 못쓴다!
		 
		 
		 * */
		

	} // main

} // class

class Box2<T>{
	// Cannot make a static reference to the non-static type T
	// 제한 1) 제네릭클래스에는 클래스변수 선언 X
	// static T item2;
	
	// 제한 2) 클래스 메서드에 T타입 사용 X
	// static int compare(T a, T b) {
	// 	return 0;
	// }
	
	
}