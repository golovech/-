package days19;

import java.util.LinkedList;

/**
 * @author love
 * @date 2024. 7. 25. - 오후 12:11:41
 * @subject
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("박준용");
		list.add("김준석");
		list.add("김재민");
		
		System.out.println(list);
		
		// list.get(0); // 첫번째 값
		// list.getFirst();
		
		list.getLast(); // 마지막 값
		
		// list.contains("홍길동"); // 있니? 하고 물어봄
		// list.indexOf("홍길동");
		
		// list.addFirst(list); // 첫부분에 추가해서 붙이겠다.
		// list.addLast(list); // 마지막부분에 추가해서 붙이겠다.
		
		// ========================================
		
	    //                읽기     삽입/삭제     비고
	    // ArrayList     빠르다     느리다       순차적으로 추가,삭제 빠르다.
	    // LinkedList    느리다     빠르다       데이터 많으면 많을 수록 접근성은 떨어진다.
		// Vector 		 (ArrayList와 비슷함)
		
		

	} // main

} // class
