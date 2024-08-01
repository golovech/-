package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author love
 * @date 2024. 7. 31. - 오전 9:01:11
 * @subject
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		 * [ 람다식 ]
		 * 1) jdk 1.8 추가
		 * 2) 자바 = 객체지향 프로그래밍 언어 + 함수형 언어(장점)
		 * 3) 정의 : 메서드를 하나의 식(Exprssion)으로 표현한 것.
		 * 			-> 화살표 연산자(람다 연산자)
		 * 4) 메서드(함수) -> 람다식 표현
		 * 	  ㄱ. 메서드(함수)이름 생략
		 *    ㄴ. 리턴값 생략
		 *    람다식을 '익명 함수( anonymous function )' 이라고도 함.
		 * 
		 * 5) 모든 메서드는,
		 * 	  - 반드시 클래스를 선언한 후 -> 함수 호출.
		 *    - 객체를 생성해야, ->	 객체명.함수명() 호출
		 *    
		 *    ==> 하지만 람다식은 이 모든 과정없이 오직 람다식 자체만으로 함수를 대신할 수 있다.
		 * 
		 * 6) 람다식은 함수의 매개변수로 전달될 수 있다.
		 *    람다식은 함수의 리턴값으로 반환할 수 있다.
		 *    
		 * 7) 함수 / 메서드의 차이점?
		 *    - 메서드 : 클래스 안에 선언된 멤버 함수
		 *               객체의 동작, 기능을 나타냄.
		 *    - 함수 : 하나의 독립적인 기능 (클래스를 만들 필요 없이 기능할 수 있다.)
		 *    
		 * 2. [ 람다식 형식 ]
		 *    리턴자료형 메서드명(매개변수...) {
		 *    		명령코딩;
		 *    		명령코딩;
		 *    		return 반환값;
		 *    }
		 *   => (매개변수...) -> {
		 *    		명령코딩;
		 *    		명령코딩;
		 *    		return 반환값;
		 *    }
		 *    
		 * 2-2. 메서드 -> 람다식 선언 방법
		 * int max(int a, int b){
		 * 		return a>b? a: b;
		 * }
		 *  =>
		 * (int a, int b) -> { return a>b? a: b; }
		 * => 리턴값이 있는 경우 "return 리턴값" 형식이 아닌
		 *    수식으로 대신할 수 있다.
		 *    (주의) 세미콜론(;)을 생략한다.
		 * 	  (int a, int b) -> a>b? a: b 
		 * 
		 * => 람다식에 선언된 매개변수의 타입(형식/자료형. int...)이 추론 가능할 경우, 
		 * 	  생략 가능하다(대부분 추론 가능해서 생략함)(다른 코딩에서 타입이 쓰여있다면)
		 * 	  (a, b) -> a>b? a: b
		 * => 매개변수가 1개인 경우에만 괄호를 생략 가능
		 *    a -> a*2
		 *    int a  X
		 *    
		 * => 괄호 안에 명령문장이 한문장이면, {} 생략가능, 세미콜론 X
		 * (name, i) -> System.out.println(name+ "/" + i)
		 * 
		 * - 괄호 생략할 때 주의할 점
		 *   : 괄호 안에 명령문장 1개일지라도, return문인경우 {} 생략 불가.
		 * (name, i) -> {return name+ "/" + i}
		 * (name, i) -> name+ "/" + i => return 지우면 괄호생략 가능.
		 * 
		 * 3. 함수형 인터페이스
		 *   1) 함수형 인터페이스 : 람다식을 다루기 위한 인터페이스.
		 *   2) 오직 하나의 추상메서드만 가진다.
		 *   3) 메서드 1개 -> 식 = 람다식
		 *      모든 메서드는 클래스의 멤버로 선언되어야 함.
		 *      람다식도 어떤 클래스의 멤버로 선언되어야 한다.
		 *   4) static, defult 메서드는 갯수 제약이 없다.
		 *   5) @FunctionInterface 어노테이션을 붙이면 
		 *      -> 컴파일러가 함수형 인터페이스로 인식함
		 *      -> 올바르게 정의되었는지 체크함.
		 *      
		 *  3-2 예시
		 *  	// 함수형 인터페이스 (람다식을 다루기 위한)
		 *  	@FunctionInterface
		 *      interface MyFunction {
		 *      	int max(int a, int b);
		 *      }
		 *      
		 *      MyFunction myfunc = new MyFunction(){
		 *       	@Override
		 *       	int max(int a, int b){
		 *       		return a>b?a:b
		 *		        }
		 * 				int max = myfunc.max(1,2);
		 *      	 }
		 *     
		 *      
		 *      ----> 람다식으로 바꾸려면?    MyFunction myfunc = (a,b) -> a>b?a:b // 람다식
		 *       							  int max = myfunc.max(1,2);
		 *      
		 *      // 익명클레스 = 클래스 선언과 동시에 생성.
		 *      // == 익명 개체
		 *      new 부모인터페이스 (){
		 *      	@오버라이딩?
		 *      	max
		 *      }
		 * 
		 * 		ㄴ 이처럼 MyFunction 인터페이스를 구현한 익명클래스를 람다식으로 대체 가능한 이유?
		 * 		: 내부적으로 람다식도 실제로 익명 객체이기 때문이다.
		 * 		ㄴ 자바의 규칙으로 하나의 추상메서드가 선언된 인터페이스를 정의해서 람다식으로 다루자.
		 * 
		 * 		=> 람다식을 다루기 위한 인터페이스 : "함수형 인터페이스(FunctionInterface)"라고 부른다.
		 * 
		 * 3-3. 함수형 인터페이스의 매개변수와 반환타입 설명하는 예제
		 * @FunctionInterface
		 * interface MyFunction {
		 * 		void test();
		 * }
		 * 
		 * MyFunction myfunc = () -> System.out.println("test");
		 * 
		 * ㄴ
		 * class X {
		 * 		void disp(MyFunction f){
		 * 			f.test();
		 * 		}
		 * }
		 * 
		 * obj.disp( () -> System.out.println("test"));
		 * 
		 * ㄴ 함수형 인터페이스(람다식) 타입의 리턴자료형으로 사용되는경우
		 * class Y{
		 * 		// disp2() 메서드의 리턴자료형이 함수형인터페이스타입.
		 * 		MyFunction disp2(){
		 * 			//MyFunction f = ()->{};
		 * 			//return f;
		 * 			*
		 * 			return ()->{};
		 * 		}
		 * }
		 * 
		 * 3-4. 람다식의 타입과 형변환
		 * @FunctionInterface
		 * interface MyFunction{
		 * 	 void myMethod();
		 * }
		 * 
		 * MyFunction f = (MyFunction)(()->{}); // 타입에 맞게 형변환은 필요하다.
		 * 
		 * 3-5. 외부변수를 참조하는 람다식.
		 * 
		 * 4. [ java.util.function 패키지 ]
		 *   1) 제네릭 메서드    
		 *   2) 대부분의 메서드는 비슷하다.
		 *      == 매개변수 갯수, 리턴값이 비슷하다.
		 *   3) 자주 사용되는 형식의 메서드를 함수형 인터페이스로 정의해서,
		 *      java.util.function 패키지에 정의함.
		 *   4) 이유?
		 *      매번 새로운 함수형 인터페이스를 개발자가 매번 정의하지 말고,
		 *      이 패키지의 함수형 인터페이스를 활용하라는 뜻.
		 *      (표준화, 재사용 ,유지보수 용이)   
		 * 
		 * 5. java.util.function 패키지의 주요 함수형 인터페이스
         *     1) java.lang.Runnable         void run()           매 0, 리 0
         *     2) Supplier<T>                T get()              매 0, 리 1
         *     3) Consumer<T>                void accept(T t)     매 1, 리 0
         *     4) Function<T,R>              R apply(T t)         매 1, 리 1
         *     5) Predicate<T>               boolean test(T t)    매 1, 리턴타입 boolean
         *     
		 * 6. 매개변수가 두 개인 함수형 인터페이스
		 *    1) BiConsumer<T,U>      void accept(T t, U u)
		 *    2) BiPredicate<T,U>      boolean test(T t, U u)
		 *    3) BiFunction<T,U,R>      R apply(T t, U u)
		 * 
		 * 
		 * */
		
//		 ArrayList<Integer> list = new ArrayList<Integer>();
//		 list.add(3);
//		 list.add(5);
//		 list.add(23);
//		 list.removeIf(( t) -> t>= 10);
		
		 
		 List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
		 Collections.sort(list, (o1, o2)-> o2.compareTo(o1)); // 람다식으로 표현
		 
		 
				 

	} // main

} // class

@FunctionalInterface
interface MyFunction{
	void myMethod();
}

class Outer {
	int val = 10; // Outer.this.val
	class Inner {
		int val = 20; // this.val
		void method(int i) {
			int val = 30; // final int val = 30;  상수
			MyFunction f = ()->{
				System.out.println(i);
				System.out.println(val);
				System.out.println(this.val); // inner객체
				System.out.println(Outer.this.val); // outer객체
				
			};
			
			f.myMethod(); // 호출
			
		}
	}
	
}
