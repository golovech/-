package days20;

import java.util.ArrayList;

/**
 * @author love
 * @date 2024. 7. 26. - 오후 3:29:59
 * @subject
 * @content
 *
 */
public class Ex08_05 {

	public static void main(String[] args) {
		/*
			[ 제한된 제네릭 클래스 ] 

			Box<T extends Fruit> 란?
			과일에서 물려받은 자식들만 사용할 수 있게 됨.
		
		 * */
		
//		// Box4 <Toy> toybox = new Box4<>();
//		// Box4 <빵> 빵box = new Box4<>();
//		Box4 <Apple> Applebox = new Box4<>();
//		Box4 <Grape> Grapebox = new Box4<>();
//		
//	} // main
//
//} // class
//
////class Box4 <T extends Fruit>{ // 제네릭 클래스
//class Box4 <T extends Fruit & eatable>{ // 제네릭클래스의 교집합 & 
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
//
//// 먹을 수 있는 음식
//interface eatable {
//
//}
//
//class 빵 implements eatable {
//
//}
//
////과일
//class Fruit extends Object implements eatable{
//	public String toString() {
//		return "Fruit";
//	}
//}
//
////과일 > 사과
//class Apple extends Fruit{
//	public String toString() {
//		return "Apple";
//	}   
//}
//
////과일 > 포도
//class Grape extends Fruit{
//	public String toString() {
//		return "Grape";
//	}   
//}
//
////장난감
//class Toy{
//	public String toString() {
//		return "Toy";
	}   
}