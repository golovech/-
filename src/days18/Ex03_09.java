package days18;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Ex03_09 {

	public static void main(String[] args) {
		// Period	= 날짜 - 날짜 !!
		// Duration	= 시간 - 시간 !!
		// 수료일 - 오늘날짜 = 남은일수(날짜간격)?

		LocalDate ed = LocalDate.of(2024, 12, 14); 
		ed = ed.plusDays(1);
		LocalDate td = LocalDate.now();

		Period p = Period.between(td, ed);
		System.out.println(p); //P4M21D

		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
		
		// 18:00 집가려면 얼마나 남앗나?
		LocalTime et = LocalTime.of(18, 0); // 18시 0분
		System.out.println(et);
		
		LocalTime tt = LocalTime.now();
		System.out.println(tt);
		
		Duration d = Duration.between(et, tt);
		System.out.println(d);
		System.out.println(d.getSeconds());
		System.out.println(d.getSeconds()/60);
		System.out.println(d.getSeconds()/60/60); // 시간이 나옴.
		

	}//main

}//class
