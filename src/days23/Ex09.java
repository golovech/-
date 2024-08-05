package days23;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author love
 * @date 2024. 8. 2. - 오전 9:02:59
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		// Arrays.stream()
		Stream<Student> s = Stream.of( 
				new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180)
				);
		
		
		// Stream<Integer> is = s.map(Student::getTotalScore); ==
		IntStream is = s.mapToInt(Student::getTotalScore); // 박싱,언박싱 안해도 되는 간편한 코딩이 됨.
		
		// 요약		통계량  SummaryStatistics
		IntSummaryStatistics stat = is.summaryStatistics();
		System.out.println("count = " + stat.getCount());
		System.out.println("sum = " + stat.getSum());
		System.out.println("avg = " + stat.getAverage());
		System.out.println(stat.getMax());
		System.out.println(stat.getMin());
		
		
		
		/*
		s.sorted
				(Comparator.comparing
						(Student::getBan).
						thenComparing
						(Comparator.naturalOrder()))
		.forEach(System.out::println);
		*/
		
		

	} // main

} // class


