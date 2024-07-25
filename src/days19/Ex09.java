package days19;

import java.util.LinkedHashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author love
 * @date 2024. 7. 25. - 오후 2:48:29
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// Set : HashSet, LinkedHashSet
//		new Person2()
//		.builder()
//		.name("홍길동")
//		.age(20)
//		.id("love")
//		.build(); // 객체생성

		Set s = new LinkedHashSet();
		s.add(new Person2("love","최사랑",20));
		s.add(new Person2("laaa","이사랑",20));
		s.add(new Person2("lqqq","관리자",36));
		
		s.add(new Person2("lqqq","관리자",36));
		System.out.println(s.size());
		
	} // main

} // class

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Person2 {
	String id; // 식별자
	String name;
	int age;
	
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person2) {
			Person2 p = (Person2) obj;
			return p.id.equals(this.id); // id가 똑같은 person 객체를 중복 처리해서 => 갯수 추가 안하고 싶다면~~
		}
		return false;
	}
	
	
}