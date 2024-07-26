package days20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author love
 * @date 2024. 7. 26. - 오후 2:12:59
 * @subject
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		 
		 [익명 클래스 == 무명 == Anonymous 클래스]
								 ^ . ^
		 1. 이름이 없는 클래스 ( \ _ / ) 
		 2. 선언 형식
		    new 부모클래스명 ( 매개변수... ){
		    	@Overide
		    	부모메서드(){
		    	}
		    	@Overide
		    	부모메서드(){
		    	} //   ==>  몇개든 생성가능
		    }
		    
		    ================================
		    
		    new 부모인터페이스 () {
		    	@Overide
		    	부모메서드(){
		    	}
		    	@Overide
		    	부모메서드(){
		    	}
		    } //  ==> 부모메서드만 오버라이딩 가능
		    
		 * */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 3,5,2,4,1);
		System.out.println(list); // [3, 5, 2, 4, 1]
		
		// 내림차순 정렬하여 출력하려면?
		list.sort(new Comparator< Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(list);
		
	} // main

} // class



