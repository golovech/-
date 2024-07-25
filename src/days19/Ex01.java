package days19;

import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new Person("최사랑",27));
		list.add(new Person("이사랑",27));
		list.add(new Person("김사랑",27));
		list.add(new Person("박사랑",27));
		
		list.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		
		
		
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Person p = (Person) ir.next();
			System.out.println(p);
		}
		
	    // 4번 내 풀이
//		LocalDateTime day = LocalDateTime.of(2023, 8, 10, 9, 0);
//		LocalDateTime day2 = LocalDateTime.of(2023, 8, 15, 18, 0);
//		System.out.println(day.isEqual(day2));
		
		// 2번 강사님 풀이
//		LocalDateTime ldt = LocalDateTime.now();
//		String pattern = "yyyy/MM/dd E요일   hh:mm:ss.SSS";
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
//		String sldt =  dtf.format(ldt);
//		System.out.println(sldt);
		
		// 2-2번 강사님 풀이
//		String  s = "2023.08.11 (금)";
//		String pattern = "yyyy.MM.dd (E)";
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
//		LocalDate d = LocalDate.parse(s, dtf);
//		System.out.printf(s,dtf);
		
		// 1)
//		ArrayList list = new ArrayList();
//		list.add("김준석");
//		list.add("최사랑");
//		list.add("박준용");
//		list.add("원충희");
//		list.add("이시훈");
		// 2)
	
	
//		list.removeIf(new Predicate<String>() {
//			
//		});
		
		
				
		
//		3-2. ArrayList 컬렉션 클래스를 사용해서 ( 10분 )
//		  1) 팀원들의 이름을 요소로 추가    add(), addAll()
//		  2) 반복자를 사용해서 모든 요소(팀원들) 출력 
//		  3) 팀원들의 인원수를 출력
//		  4) 두 번째 팀원이 누구인지 확인 후 "홍길동" 팀원으로 수정
//		  
//		  5) "홍길동" 팀원의 존재 유무를 확인 후 삭제
//		  6) "이"씨 팀원들만 삭제 후 확인.

		
		//  [팀장]김준석(전), 최사랑(비), 박준용(전), 원충희(비), 이시훈(비)
		
//		String team =  "[팀장]김준석(전), 최사랑(비), 박준용(전), 원충희(비), 이시훈(비)";
//		
//		ArrayList team1 = new ArrayList();
//		String [] teamArr = team.split("(\\(전\\), \\(비\\))");
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		

	}

}

@Data
@AllArgsConstructor
class Person {
	private String name;
	private int age;
	

	
	
}
