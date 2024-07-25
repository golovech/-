package days19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex10 {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

		ArrayList<Integer> b = new ArrayList<>();
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);

		// 1) a U b  합집합 [1, 2, 3, 4, 5, 6, 7, 8] // 중복되는 수 없이 하려면? -> Set
		HashSet<Integer> hab = new HashSet<Integer>(a);
		hab.addAll(b);
		System.out.println( hab );



		// 2) a - b  차집합 [1, 2, 3] // 
		a.removeAll(b); // b를 통으로 제거하겠다.
		System.out.println(a);
		
		// 3) a ∩ b  교집합 [4, 5]
//		hab = hab - (a.removeAll(b) + b.removeAll(a)) ;
//		System.out.println(hab);
		
		ArrayList<Integer> kyo = new ArrayList<>();
	      Iterator<Integer> ir = b.iterator();
	      while (ir.hasNext()) {
	         Integer i =  ir.next();
	         if( a.contains(i) ) kyo.add(i);
	      }
	      System.out.println( kyo);
		


	} // main

} // class
