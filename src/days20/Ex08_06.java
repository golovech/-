package days20;

import java.util.ArrayList;

/**
 * @author love
 * @date 2024. 7. 26. - 오후 3:43:11
 * @subject		<? extends T>
 * @content		<? super T>
 *				<?> == <? extends Object>
 *				 ㄴ>  와일드 카드
 */
public class Ex08_06 {

	public static void main(String[] args) {

		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Fruit> appleBox = new FruitBox<>();
		FruitBox<Fruit> grapeBox = new FruitBox<>();
		
		Juice juice = Juicer.makeJuice(fruitBox);
	//	Juice juice = Juicer.makeJuice(appleBox); 과일 다 가넝~
		

	} // main

} // class

//과일
class Fruit extends Object{
	public String toString() {
		return "Fruit";
	}
}

//과일 > 사과
class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}   
}

//과일 > 포도
class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}   
}

// 제네릭 클래스
class Box5 <T>{
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {  this.list.add(item); }

	int size() { return this.list.size(); }

	T get(int i) { return this.list.get(i); }

	public String toString() { return  this.list.toString();  } 

}

// 제한된 제네릭 클래스 // 과일이면서, box5에 있는.
class FruitBox <T extends Fruit> extends Box5<T> { 
	
}

// 일반 클래스 - 주스
class Juice {
	
}


// 과일(사과,포도) 상자로부터 주스를 만드는 기계
class Juicer {
	
//	static Juice makeJuice( FruitBox<?> box ) {
//	static Juice makeJuice( FruitBox<? extends Fruit> box ) { // <? extends Fruit> : 그놈과 그놈의 자식타입들 모두 다 받겠다.
//		return new Juice();
//	}
	
	
	
	// 위의 스태틱 메서드를 제네릭 메서드로 수정해보자.
	// [제네릭 메서드]
	//		ㄴ 메서드의 선언부에 제네릭타입이 선언된 메서드
	//			: 제네릭 메서드
	// 		ㄴ 선언형식
	//			접근지정자 static <T> 리턴자료형 제네릭메서드명(매개변수...){ }
	static <T extends Fruit> Juice makeJuice( FruitBox<T> box ) { // <? extends Fruit> : 그놈과 그놈의 자식타입들 모두 다 받겠다.
		return new Juice();
	}
//	static Juice makeJuice( FruitBox<? extends Fruit> box ) { // <? extends Fruit> : 그놈과 그놈의 자식타입들 모두 다 받겠다.
//	return new Juice();
//} // 위의 코딩과 똑같은 코딩이다.
	
	
	
	
	// 제네릭 타입의 매개변수는 오버로딩이 성립되지 않는다.
	// 문제점 ? 
	// 해결법 ?      		? 와일드 카드 사용
	//						? == 모든 타입(Object)과 같은 의미
//	static Juice makeJuice( FruitBox<Fruit> box ) {
//		return new Juice();
//	}
//	static Juice makeJuice( FruitBox<Apple> box ) {
//		return new Juice();
//	}
//	static Juice makeJuice( FruitBox<Grape> box ) {
//		return new Juice();
//	}
	
}

// 제네릭 메서드 예제
/*
 * public static void printAll(ArrayList<? extends Product> list, ArrayList<? extends Product> list2){}
 * public static <T extends Product>void printAll(ArrayList<T> list, ArrayList<T> list2){}
 * (위 두개는 똑같은 코딩.)
 * 
 * 				<T extends Comparable<? super T>>
 * 
 * */



