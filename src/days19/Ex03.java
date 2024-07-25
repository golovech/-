package days19;
/**
 * @author love
 * @date 2024. 7. 25. - 오전 11:45:53
 * @subject		[ Linked List ] 컬렉션 클래스
 * @content		== 사슬(고리)로 연결된 List
 * 				장점 : 삽입, 삭제 속도가 빠르다!
 *				단점 : 데이터 많으면 많을 수록 접근성은 떨어진다.
 *
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		
		Node node1 = new Node();
	      node1.value = 10;
	      
	      Node node2 = new Node();
	      node2.value = 20;
	      node1.next = node2; // 넥스트 필드에 노드2를 준다는건 노드1과 연결한다는 것.
	      
	      Node node3 = new Node();
	      node3.value = 30;
	      node2.next = node3;
	      
	      Node node4 = new Node();
	      node4.value = 40;
	      node3.next = node4;
	      
	      Node node5 = new Node();
	      node5.value = 50;
	      node4.next = node5; // null 들어간 상태
	      
	      
	      
	      // node1 시작노드로부터 모든 노드의 value 출력해보자.
	      Node node = node1;
	      
	      while (node != null) { // null이 나올 때까지 출력하겠다는 while문 // Linked List 구조
			System.out.println(node.value);
			node = node.next;
		}

	} //main

} //class

class Node {
	int value; // 값
	
	
	Node next = null; // 단방향 : 다음 노드의 주소를 저장.
	Node prev = null; // 이것까지 주면 양방향 됨.
}