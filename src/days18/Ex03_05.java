package days18;

import java.time.LocalDate;

/**
 * @author love
 * @date 2024. 7. 24. - 오후 2:18:15
 * @subject		날짜와 시간을 비교하는 함수 
 * @content		: isAfter(), isBefore(), isEqual() 
 *
 */
public class Ex03_05 {

	public static void main(String[] args) {
		
		// 동동이의 생일 1999.1.20
		// 올해 동동이의 생일이 지났나?
		LocalDate today = LocalDate.now();
		LocalDate d_birthday = LocalDate.of(1999, 1, 20);
		// 1999 -> 2024
		d_birthday = d_birthday.withYear(today.getYear()); // 불변이기 때문에 = 을 꼭.. 초기화.
		System.out.println(d_birthday);
		
		System.out.println(today.isEqual(d_birthday)); // true & false 비교!
		System.out.println(today.isBefore(d_birthday));
		System.out.println(today.isAfter(d_birthday)); // ---> 생일 지났으니까.. isAfter()
		
		System.out.println(today.compareTo(d_birthday)); // 0 양수 또는 음수. // 0이면 같은날짜.
		
		
		
		
	} //main

} //class
