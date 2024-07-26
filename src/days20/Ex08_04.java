package days20;

import java.util.ArrayList;

/**
 * @author love
 * @date 2024. 7. 26. - 오후 3:20:25
 * @subject
 * @content
 *
 */
public class Ex08_04 {

	public static void main(String[] args) {
		/*
		 [ 제네릭 클래스의 객체 생성과 사용 ]
		 
		 
		 * */ 
//		Box3<Fruit> fruitBox = new Box3<>();
//		Box3<Apple> appleBox = new Box3<>();
//		Box3<Grape> grapeBox = new Box3<>();
//		Box3<Toy> toyBox = new Box3<>();
//		
//		// Type mismatch: cannot convert from Box3<Grape> to Box3<Apple>
//		// Box3<Apple> box1 = new Box3<Grape>();
//		// Box3<Fruit> box1 = new Box3<Grape>();
//
//		// fruitBox.add(new Toy()); // 상속관계 없으므로 X
//		fruitBox.add(new Apple());
//		fruitBox.add(new Grape());
		

	} // main

} // class



//// 과일
//class Fruit extends Object{
//	public String toString() {
//		return "Fruit";
//	}
//}
//
//// 과일 > 사과
//class Apple extends Fruit{
//	public String toString() {
//		return "Apple";
//	}   
//}
//
//// 과일 > 포도
//class Grape extends Fruit{
//	public String toString() {
//		return "Grape";
//	}   
//}
//
//// 장난감
//class Toy{
//	public String toString() {
//		return "Toy";
//	}   
//}
//
//class Box3<T>{ // T의 제네릭 클래스 Box3
//	
//	ArrayList<T> list = new ArrayList<T>();
//	
//	void add(T item) {  this.list.add(item); }
//	
//	int size() { return this.list.size(); }
//	
//	T get(int i) { return this.list.get(i); }
//	
//	public String toString() { return  this.list.toString();  } 
//	
//}

