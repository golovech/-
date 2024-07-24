package days18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * @author love
 * @date 2024. 7. 24. - 오후 4:34:30
 * @subject		ArrayList 
 * @content
 *
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// 배열의 단점
		// 1. 배열의 크기가 자동적으로 늘어나지 않음.
		// 2. 방크기 늘려야 추가가능...
		
		// <E> 제네릭 클래스 Element == 요소
		// ArrayList list = new ArrayList(10);  크기가 자동으로 추가됨!!!!!
		ArrayList list = new ArrayList(3);
		list.add("최사랑");
		list.add("강아지");
		list.add("고양이");
		System.out.println(list); // .toString() 생략가능
		System.out.println(list.size()); // 리스트 안의 요소의 수를 리턴함.
		list.add("햄스터");
		System.out.println(list); // 자동추가가 됨.
		
		list.contains("고양이");
		System.out.println(list.contains("고양이")); // true,false
		
		list.add("고양이");
		
		System.out.println(list.indexOf("고양이"));
		System.out.println(list.lastIndexOf("고양이"));
		
		// 3번 인덱스 요소의 값을 출력하려면?
//		list.clear();  // 모든 요소 삭제 메서드. clear()
//		System.out.println(list);
		list.set(1, "햄");
		System.out.println(list);

	
		System.out.println(list.get(3));
		
		// 고양이를 찾아서 삭제
//		int index = list.indexOf("고양이");
//		list.remove(index);
//		list.remove("고양이");
		// <E> -> 엘리먼트
		// <T> -> 타입 
//		list.removeIf(new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				return t.equals("고양이") ; // 참일때 제거하겠다.
//			}
//		});
//		
//		System.out.println(list);
		// list.removeIf(t -> t.equals("고양이")); // 삭제하는 코딩~	
		// System.out.println(list);
		
		// System.out.println(list.isEmpty()); // 비었니 안비었니?
//		list.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				
//				return o1.compareTo(o2);
//			}
//		});
//		System.out.println(list);
		
		// list.sort((o1,o2) -> o2.compareTo(o1)); // 람다식으로 정렬하기
		// list.sort(Comparator.reverseOrder()); 내림차순 정렬 함수
		// System.out.println(list);
		
		// list의 모든 요소를 출력하자!
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i)); 
//		}
		
		// iterator == 반복자
		Iterator ir = list.iterator(); // 반복자를 돌려주는 메서드.
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		
		
		
		
		
	} // main

} // class
