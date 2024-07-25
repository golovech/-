package days19;

import java.util.Stack;

/**
 * @author love
 * @date 2024. 7. 25. - 오후 12:22:04
 * @subject		[ 스택(stack) 구조와 큐(Queue) 구조 ]
 * 
 * @content		* 스택 *					
 * 		LIFO (Last in, First out) 		
 * 	나중에 들어간 게 먼저 나오는			
 * 	
 *		넣을때	가져올때	 비엇니?	 찾을때
 *		push(), pop(),		 empty(), 	search()
 *				peek()
 */
public class Ex04 {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push("박준용");
		s.push("김준석");
		s.push("김재민");
		s.push("전재윤");
		
		// System.out.println( s.pop() ); --> 3
		// System.out.println( s.peek() ); --> 4 왜?
		// System.out.println( s.size() );
		
		// System.out.println(s.search("김재민"));
		// System.out.println(s.indexOf("김재민")); // indexOf: 가능은 한데 안쓰기로 약속했다?
		
		while ( !s.empty()) { // 비어있지 않다면 끄집어내!
			System.out.println(s.pop());
		}

	} // main

} // class
