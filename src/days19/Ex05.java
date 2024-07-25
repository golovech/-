package days19;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author love
 * @date 2024. 7. 25. - 오후 12:36:27
 * @subject
 * @content
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		// 큐(Queue) 구조  FIFO == FirstIn FirstOut // 선입선출
		// 더블 큐 ( Deque )
		// offer()    poll() / peek()
		// 가져옴		집어넣음
		Deque q = new LinkedList(); // 
		q.offer("전재윤");
		q.offer("김준석");
		q.offer("김선우");
		q.offer("박준용");
		
		while (!q.isEmpty()) {
			System.out.println(q.poll()); // 먼저 들어가있는것 먼저 가져옴.
		}
		
		// Deque
		q.offerFirst(q);
		q.offerLast(q); 
		

	} // main
 
} // class
