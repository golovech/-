package days19;
/*********************** 오늘 총정리 **********************
* 
* 						Collection
* 
* 				List		Set 		Map
* 			1) ArrayList		
* 			2) [Vector 컬렉션 클래스]
* 				차이점 : 멀티 스레드에 안전하다(동기화 처리 O) / 그 외는 동일함.
* 
* 		StringBuffer	멀티스레드 안전, 동기화 O
* 		StringBuilder	멀티스레드 안전 X, 동기화 X   ===> 이 둘의 차이점과 동일함.
* 
* =========================================================================
* 
* 				[ Linked List ] 컬렉션 클래스
* 				== 사슬(고리)로 연결된 List
* 				장점 : 삽입, 삭제 속도가 빠르다!
*				단점 : 데이터 많으면 많을 수록 접근성은 떨어진다.
*
* =========================================================================
*
*				[ 스택(stack) 구조와 큐(Queue) 구조 ]
* 
* 						* 스택 *					
* 				LIFO (Last in, First out) 		
* 	     	  나중에 들어간 게 먼저 나오는			
* 	
*			넣을때	가져올때	 비엇니?	 찾을때
*			push(), pop(),		 empty(), 	 search()
*					peek()
* 
* 			큐(Queue) 구조  FIFO == FirstIn FirstOut // 선입선출
		 	더블 큐 ( Deque )
		 	offer()    poll() / peek()
		 	가져옴		집어넣음
		 
============================================================================
		 
* 	
* 
* 
* 			 Set - 순서유지 X, 중복 X
			 HashSet 컬렉션 클래스
			 순서유지 O + Set = LinkedHashSet 컬렉션 클래스 ***!!
			 
			 
			 
				[ Set : TreeSet, HashSet, LinkedHashSet ]
* 				< TreeSet 이란? >
* 				1. 중복허용 x, 순서유지 x
* 				2. "이진 검색 트리" 라는 자료 구조로 데이터를 저장하는 컬렉션 클래스
* 				3. LinkedList 처럼 노드(Node)가 서로 연결된 구조
* 				   class TreeNode {
* 								Object value;
* 								TreeNode left;
* 								TreeNode right;   
* 								}
* 
* 				4. 최상위 노드 == 루트 (root)
* 				5. 노드들 간의 관계 : 부모 - 자식 , 형제 . . .
* 
* 				Integer 배열은 TreeSet으로 바꿀 수 있다.
* 
* ============================================================================================
* 
*   					[ Map ]
* 				1. key + value == Entry
* 				2. key 중복 x / value 중복 o
* 				3. HashMap (신)    / HashTable (구)
*				4. 해싱 (Hashing) 이란? / hash = 검색
*					- 해시함수를 사용하여 해시 테이블에 data를 저장하고, 검색하는 기법.
*					- 해시함수란?
*					  데이터를 저장하는 곳을 알려주는 함수.
*					  데이터를 빠르게 검색 가능. 
*
*				예)
*					[2022 일기] - [1월][2월]. . .[12월]
*					[2023 일기] - [1월][2월]. . .[12월]
*					[2024 일기] - [1월][2월]. . .[12월]
*					해싱을 사용하기 때문에, 
*					많은 데이터도 금방 읽어올 수 있다.
* 
* 	ArrayList, Vector, LinkedList(Queue, DQ), Stack, Queue, PriorityQue, Set : [ TreeSet, HashSet, LinkedHashSet ], Map
*/
