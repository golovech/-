package days18;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

/**
 * @author love
 * @date 2024. 7. 24. - 오후 12:26:17
 * @subject
 * @content
 *
 */
public class Ex03_03 {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now(); 
		System.out.println(ld);
		
		// int year = ld.get(ChronoField.YEAR);
		int year = ld.getYear();
		System.out.println(year);
		// 월, 일
		//int month = ld.getMonthValue();
		int month = ld.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(month);
		
		//int day = ld.getDayOfMonth();
		int day = ld.get(ChronoField.DAY_OF_MONTH);
		System.out.println(day);
		

		
		LocalTime lt = LocalTime.now();
		//System.out.println(lt);
		// 시,분,초,밀리초,나노세컨드
		//요일
		
		int time = lt.get(ChronoField.HOUR_OF_DAY);
		System.out.println(time);
		
		//int min = lt.get(ChronoField.MINUTE_OF_HOUR);
		int min = lt.getMinute();
		System.out.println(min);
		
		//int sec = lt.getSecond();
		double sec = lt.get(ChronoField.SECOND_OF_DAY);
		System.out.println(sec);
		
		int mms = lt.get(ChronoField.MILLI_OF_SECOND); // 밀리세컨드
		
		
		System.out.println(mms);
		
		int ms = lt.getNano(); // 나노세컨드??
		System.out.println(ms);
		
		
		
		

	} //main

} //class
