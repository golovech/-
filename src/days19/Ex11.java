package days19;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author love
 * @date 2024. 7. 25. - 오후 3:37:48
 * @subject		[ Set : TreeSet, HashSet, LinkedHashSet ]
 * @content			< TreeSet 이란? >
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
 */
public class Ex11 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(6);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		// 범위 검색
		SortedSet<Integer> ss = ts.subSet(4, 7); // 4 ~ 7 앞까지 범위검색
		System.out.println(ss);
		
		// 1보다 큰 값을 가진, 가장 가까운 수를 반환
		System.out.println(ts.higher(1)); // 4
		// 4보다 작은 값을 가진, 가장 가까운 수
		System.out.println(ts.lower(4)); // 1
		
		// 지정된 값(3)과 같은 객체를 반환 
		// or 트리구조에서 3값이 없으면, 작은 값 중 가장 가까운 값을 반환
		System.out.println(ts.floor(3)); // 1
		System.out.println(ts.ceiling(3)); // 4
		

	} // main

} // class
