package days18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author love
 * @date 2024. 7. 24. - 오후 12:13:04
 * @subject
 * @content
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now(); // 현재 날짜를 가져옴
		//System.out.println(ld.toString());
		LocalDate ld2 = LocalDate.of(2024, 7, 24); // 날짜객체 생성!
		System.out.println(ld2);
		
		
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		LocalTime lt2 = LocalTime.of(12, 5, 32);
		System.out.println(lt2);
		
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime ldt2 = LocalDateTime.of(ld,lt); 
		System.out.println(ldt2);

	} //main

} //class
