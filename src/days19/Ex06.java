package days19;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author love
 * @date 2024. 7. 25. - 오후 12:46:24
 * @subject		ArrayList, Vector, LinkedList(Queue, DQ), Stack, Queue, PriorityQue 특징 기억하기.
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		// PriorityQueue
		// 우선순위 + 큐
		// 우선순위 높은 것부터 꺼내오는 큐
		// 숫자: 작은 숫자가 우선순위가 높다.
		Queue q = new PriorityQueue();
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		
		// System.out.println(q);
		
		while (!q.isEmpty()) {
			System.out.println(q.poll()); // 우선순위 높은것부터 꺼내오는 PriorityQueue
		}
		

	} // main

} // class
