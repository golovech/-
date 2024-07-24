package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Ex03_04 {

	public static void main(String[] args) {
		// String
		String a = "xyz";
		String b = a.replace('y', '와');
		System.out.println(a); 
		System.out.println(b); 
		// String 불변...
		
		// 날짜객체도 불변...
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		//년도 수정하려면?
		ld = ld.withYear(2020);
		System.out.println(ld);
		
		ld = ld.with(ChronoField.YEAR, 2024);
		System.out.println(ld); // 불변
		
		//12월로 수정
		ld = ld.withMonth(5);
		ld = ld.with(ChronoField.MONTH_OF_YEAR,12);
		System.out.println(ld);
		
		// 5달 빼기		minus XXX(), plusXXX(), minus(), plus()
		ld = ld.minusMonths(5);
		System.out.println(ld);
		ld = ld.plusMonths(4); // 4달 더하깅
		System.out.println(ld);
		
		// truncatedTo()  절삭하다, 끝을 잘라내다
		LocalTime lt = LocalTime.now();
		System.out.println(lt); // 현재시간 읽어오깅
		// 시간보다 작은 단위를 모두 절삭하려면?
	//	lt = lt.truncatedTo(ChronoUnit.HOURS);// 시간 밑으로 절삭 한 것.
		lt = lt.truncatedTo(ChronoUnit.MICROS); // 마이크로 아래로 절삭
		System.out.println(lt); 
		
		// 날짜 + 시간 객체
		LocalDateTime dt = LocalDateTime.now();
		System.out.println (dt);
		dt = dt.truncatedTo(ChronoUnit.MINUTES); // 분 아래로 절삭.
		System.out.println(dt);
		dt = dt.truncatedTo(ChronoUnit.DAYS); // 날짜 아래로 절삭. 큰 단위가 위로 와야함.
		System.out.println(dt);

	} // main

} // class
