package days19;

import java.util.HashSet;

/**
 * @author love
 * @date 2024. 7. 25. - 오후 2:08:05
 * @subject
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		// Set - 순서유지 X, 중복 X
		// 		 HashSet 컬렉션 클래스
		//		 순서유지 O + Set = LinkedHashSet 컬렉션 클래스 ***!!
		
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(2);
		hs.add(15);
		
		// 순서유지 안되고 자동정렬됨
		System.out.println(hs);
		
		// 중복허용 되지 않는다. (15가 추가 안됨)
		hs.add(15);
		System.out.println(hs);

	} // main

} // class
