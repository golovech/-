package days19;

import java.security.DrbgParameters.Capability;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
public class Ex02_02 {

	public static void main(String[] args) {

		Vector vt = new Vector(); 
		vt.addElement("최사랑");
		vt.addElement("김준석");
		vt.addElement("박준용");
		vt.addElement("이시훈");
		vt.addElement("이시훈");
		vt.addElement(null);
		System.out.println( vt );

		System.out.println("=".repeat(30));
		ListIterator ir = vt.listIterator(); // 양방향 가능. (이터레이터는 단방향)
		while (ir.hasNext()) { // hasNext() : 다음 뭐니?
			String name = (String) ir.next();
			System.out.println(name);
		}
		System.out.println("-".repeat(30));
		while (ir.hasPrevious()) {  // hasPrevious() : 양방향.
			String name = (String) ir.previous();
			System.out.println(name);


		}

	} //main

} //class
