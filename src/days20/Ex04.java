package days20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.*; // static + .* 붙이면 함수 앞에 collection 안 붙여도 됨.

/**
 * @author love
 * @date 2024. 7. 26. - 오후 12:03:08
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		// Arrays 클래스 : 배열을 사용하기 쉽도록 구현된 클래스
		int [] m = {3,5,2,4,1};
//		Arrays.sort(m); // 정렬
//		Arrays.binarySearch(m, 5); // 값 검색
//		Arrays.toString(m); // 출력
//		Arrays.fill(m, -1); // -1값으로 전부 채우겠다.
//		System.out.println(Arrays.toString(m));
		
		// Collections 클래스 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(3);
//		list.add(5);
//		list.add(2);
//		list.add(4);
//		list.add(1);
		
		addAll(list, 3,5,2,4,1);
		System.out.println(list);
		rotate(list, 2); // 오른쪽으로 2칸씩 이동하는 함수 rotate()(회전. 로테이션)
		System.out.println(list);
		swap(list, 0, 3); // 자리바꿈 swap()함수
		System.out.println(list); 
		Collections.shuffle(list); // 임의로 섞는것. shuffle()
		System.out.println(list); 
		Collections.sort(list, Collections.reverseOrder()); // 오름차순 정렬 후 리버스 -> 내림차순 정렬
		System.out.println(list); 
		Collections.sort (list, (a,b) -> b-a); // 내림차순 정렬.
		System.out.println(list); 
		Collections.reverse(list); // 다시 바꿔서 오름차순 정렬.
		System.out.println(list); 
		
		
		
		
		
		
		
	} // main

} // class





