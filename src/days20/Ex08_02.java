package days20;

import days13.Person;

/**
 * @author love
 * @date 2024. 7. 26. - 오후 2:49:19
 * @subject
 * @content
 *
 */
public class Ex08_02 {

	public static void main(String[] args) {
		/*
		 1. 제네릭 타입은 클래스, 메서드에 선언할 수 있다.
		    1) 제네릭 클래스 !
		    2) 제네릭 메서드
		    
		 T
		 E
		 K
		 V
		 
		원시타입 (Raw Type)
		  ↓
		Box<T>		제네릭 클래스, 'T' 의 Box
			T		타입변수 또는 타입 매개변수
		T, E, K, V 등등 -> 타입변수
		 
		 
      */
      
		Box<Person> b1 = new Box<>();
		b1.setItem(new Person());
		Person p = b1.getItem();

   } // main

} // class


// 제네릭 클래스 선언!
class Box< T >{ // Type
   T item;

   public T getItem() {
      return item;
   }

   public void setItem(T item) {
      this.item = item;
   }   
} 

/*
class Box{
   double item;

   public double getItem() {
      return item;
   }

   public void setItem(double item) {
      this.item = item;
   }   
} 
*/

/*
class Box{
   String item;

   public String getItem() {
      return item;
   }

   public void setItem(String item) {
      this.item = item;
   }   
} 
*/

/*
class Box{
   int item;

   public int getItem() {
      return item;
   }

   public void setItem(int item) {
      this.item = item;
   }   
}
*/




