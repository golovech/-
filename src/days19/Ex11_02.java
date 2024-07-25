package days19;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex11_02 {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		// 알파벳 순서로 정렬.
		ts.add("abc");      ts.add("alien");      ts.add("bat");
		ts.add("car");      ts.add("Car");      ts.add("disc");
		ts.add("dance");      ts.add("dzzz");      ts.add("dzzzz");
		ts.add("elephant");      ts.add("elevator");      ts.add("fan");
		ts.add("flower");   

		String regex = "[a-c].*";
		System.out.println(ts);
//		SortedSet<String> ss = ts.subSet("a", "d"); // a~ d앞(c) 까지 시작되는 단어를 검색.
		SortedSet<String> ss = ts.subSet("c", "dzzzz"); // c ~ dzzzz의 앞(dzzz) 까지 시작되는 단어를 검색.
		System.out.println(ss);
		
	} // main

} // class
