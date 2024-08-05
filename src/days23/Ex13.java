package days23;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex13 {

	public static void main(String[] args) {
		// collect() 최종 연산
		Student[] stuArr = {
		         new Student("이자바", 3, 300),
		         new Student("김자바", 1, 200),
		         new Student("안자바", 2, 100),
		         new Student("박자바", 2, 150),
		         new Student("소자바", 1, 200),
		         new Student("나자바", 3, 290),
		         new Student("감자바", 3, 180)   
		      }; 
		
//		List<String> nameList = new ArrayList<String>();
//		for (int i = 0; i < stuArr.length; i++) {
//			Student s = stuArr[i];
//			String name = s.getName();
//			nameList.add(name);
		
//		} ---> Stream으로 바꿔보자!
		
//		List<String> names = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
//		System.out.println(names);
		
//		Student [] stuArr2 = Stream.of(stuArr).toArray(Student[]::new); // 메서드 참조
		Map<String, Student> stuMap = Stream.of(stuArr).collect(Collectors.toMap(s->s.getName(), p->p ) );
		
		for (String keyName : stuMap.keySet() ) {
			System.out.println(keyName);
		}
		
		
		
		

	} // main

} // class
