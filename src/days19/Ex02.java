package days19;

import java.security.DrbgParameters.Capability;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * @author love
 * @date 2024. 7. 25. - 오전 11:10:24
 * @subject			Collection
 * @content		List		Set 		Map
 * 			1) ArrayList		
 * 			2) [Vector 컬렉션 클래스]
 * 				차이점 : 멀티 스레드에 안전하다(동기화 처리 O) / 그 외는 동일함.
 * 
 * 	StringBuffer	멀티스레드 안전, 동기화 O
 * 	StringBuilder	멀티스레드 안전 X, 동기화 X   ===> 이 둘의 차이점과 동일함.
 *
 */
public class Ex02 {

	public static void main(String[] args) {

		Vector vt = new Vector(); // ()값 안줘도 10 들어간것과 같다.
		vt.addElement("최사랑");
		vt.addElement("김준석");
		vt.addElement("박준용");
		vt.addElement("이시훈");
		vt.addElement("이시훈");
		vt.addElement(null);
		System.out.println( vt );
		
		System.out.println( vt.size() );
		System.out.println(vt.capacity());
		
		vt.trimToSize(); // 남는 (비어있는) 공간 제거..
		System.out.println(vt.capacity());
//		vt.setSize(10);
//		System.out.println(vt.capacity()); ??
		
		System.out.println( vt.get(1) ); // 첫번째 요소 얻어옴
		System.out.println( vt.elementAt(1));  // 위와 같은 코딩
		
//		vt.remove("최사랑"); // 참, 거짓
//		vt.removeElement("최사랑");  // 위와 같은 코딩
//		
//		vt.removeAll(vt); // 모두 삭제.
//		vt.clear(); // 위와 같은 코딩
		
		vt.set(2, "XXX"); // 1번값에 xxx를 추가.
		vt.setElementAt( "YYY" , 1); // 위와 같은 코딩
		
		// 모든 요소 출력 : 반복자(iterator)
		
		vt.removeIf(e -> e == null);
		
		System.out.println("-".repeat(30));
		
//		vt.forEach(new Consumer<String>() { // Consumer로 구현된 함수는 리턴값은 없고, 매개값은 1개라는 뜻.
//
//			@Override
//			public void accept(String n) {
//				
//				System.out.println(n);
//			}
//		});
		
		// vt.forEach((n) -> System.out.println(n)); ↓ 와 같은 코딩
		vt.forEach( System.out::println); // 메서드 참조. (끄집어낸 한 글자를 출력한다는 뜻) // forEach문 무진장많이 출력보다 간단함.
		
		System.out.println("=".repeat(30));
		
		Iterator ir = vt.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
		
		vt.firstElement(); // == vt.get(0)
		vt.lastElement(); // == vt.get(vt.size()-1);
		
		int index = vt.indexOf("YYY"); // 1 를 돌려주겟지
		vt.insertElementAt("강아지", index+1); // ArrayList와 똑같은데.. 추가된 메서드가 더 있긴 하다.. ==> Vector & ArrayList중에 골라 써라.
		System.out.println(vt);
		
		Vector subVt = new Vector();
		for (int i = 2; i <= 4; i++) {
			subVt.add( vt.get(i));
		}
		
		List subList = vt.subList(2, 5);
		
		
	} //main

} //class
