package days23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author love
 * @date 2024. 8. 1. - 오전 9:03:49
 * @subject   
 * @content
 *		   5. java.util.function 패키지의 주요 함수형 인터페이스 !암기!
         *     1) java.lang.Runnable         void run()           매 0, 리 0
         *     2) Supplier<T>                T get()              매 0, 리 1
         *     3) Consumer<T>                void accept(T t)     매 1, 리 0
         *     4) Function<T,R>              R apply(T t)         매 1, 리 1
         *     5) Predicate<T>               boolean test(T t)    매 1, 리턴타입 boolean
 */
public class Ex02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)  list.add(i); // list를 출력하려면?
//		list.forEach(i -> System.out.println(i)); // 람다식으로 . forEach.
		list.forEach( System.out :: println); // 메서드 참조
		list.removeIf(i-> i%2==0); // 람다식으로 홀수를 출력하려면? // 아주 간단해짐.
		System.out.println(list);
		
		list.replaceAll(i->i*2); // 하나하나의 요소를 가져와서 *2 해줌.
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
	
		map.forEach((k,v) -> System.out.println(k + "/" + v)); // forEach는 출력하는 용도.
		
		
		
	} // main

} // class





