package days18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex04_03 {

	public static void main(String[] args) {
		 String 조1 = "[팀장]김재민(전),김선우(전), 김인경(비),  송세호(비), 전재윤(전)";
		 String 조2 = "[팀장]김준석(전), 최사랑(비), 박준용(전), 원충희(비), 이시훈(비)";
		
		 ArrayList team1 = new ArrayList();
		 String [] 조1Arr = 조1.split("(\\[팀장\\]|\\(전\\),\\s*|\\(비\\),\\s*)");
		 for (String name : 조1Arr) {
			//System.out.println(name);
			 team1.add(name);
		}
		 System.out.println( team1);
		 
		 
		 ArrayList team2 = new ArrayList();
		 String [] 조2Arr = 조2.split("(\\[팀장\\]|\\(전\\),\\s*|\\(비\\),\\s*)");
		 for (String name : 조2Arr) {
			 //System.out.println(name);
			 team2.add(name);
		 }
		 System.out.println( team2);
		 
		 ArrayList class5 = new ArrayList(team1);
		 class5.addAll(team1);
		 class5.addAll(team2);
		 System.out.println(class5);
		 
		 // class5.removeAll(team1);
		 // System.out.println(class5);

		
		 ArrayList class5Clone = (ArrayList) class5.clone(); // 복제!
		 
		 Collections.sort(class5); // 오름차순 정렬
		 System.out.println(class5);
		 
		 
	} // main

} // class
