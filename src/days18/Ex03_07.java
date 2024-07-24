package days18;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Ex03_07 {

	public static void main(String[] args) {
		
		//	 1. 이번 달의 마지막 날짜 몇 일까지 있나?
		//		이번 달의 마지막 수요일은 몇일?
		//		이번 달의 첫 번째 금요일은 몇일?
		// 		with(), plus(), minus()... 날짜 수정 메서드 + 날짜계산
		
		//   2. 자주 쓰이는 날짜 계산을 대신해주는 메서드를 구현한 클래스 (jdk1.9~)
		//		: TempralAdjusters
//		// 1.
//		LocalDate d = LocalDate.now();
//		System.out.println(d);
//		d = d.withDayOfMonth(1); // 1일로 설정
//		System.out.println(d);
//		d = d.plusMonths(1);
//		System.out.println(d);
//		d = d.minusDays(1); // 하루빼고
//		System.out.println(d);
//		int lastDay = d.getDayOfMonth(); // 마지막날을 가져온다.
//		System.out.println(lastDay); 
		
		// 2.
//		LocalDate d = LocalDate.now();
//		System.out.println(d.lengthOfMonth()); // 그달의 길이 구하는 함수.
		
		
		
		LocalDate d = LocalDate.now();
		d = d.with(TemporalAdjusters.lastDayOfMonth()); 
		// 달의 마지막 날짜 가져오는 함수 :  .with(TemporalAdjusters.~) 
		System.out.println(d);
	
		
//		LocalDate d = LocalDate.now();
//		d = d.with(TemporalAdjusters.lastDayOfMonth()); 
//		LocalDate d = LocalDate.now();
//	      System.out.println(d);
//	      // 다음 달의 첫 날
//	      System.out.println( d.with( firstDayOfNextMonth()  ) );
//	      // 이번 달의 첫 날  
//	      System.out.println( d.with( firstDayOfMonth()  ) );
//	      // 이번 달의 첫 번째 월요일
//	      System.out.println( d.with( firstInMonth(MONDAY)  ) );
//	      
//	      // 지난 주 월요일
//	      System.out.println( d.with( previous(MONDAY)  ) );
//	      System.out.println( d.with( previousOrSame(MONDAY)    ) ); 
		
	}//main

}//class
