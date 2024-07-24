package days18;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author love
 * @date 2024. 7. 24. - 오전 10:08:53
 * @subject 1번 문제.
 * @content
 *
 */
public class Test01 {

	public static void main(String[] args) {
		int year = 2024;
		
		for (int i = 1; i <=12; i++) {
			int lastDay = getLastDay(year, i);
			System.out.printf("%d월 : %d일\n", i, lastDay);
		}
	} //main

	private static int getLastDay(int year, int month) {
//		Calendar c = Calendar.getInstance(); // 오늘날짜, 시간 가지는 객체
//		c.set(Calendar.YEAR, year);
//		c.set(Calendar.MONTH, month-1);
//		c.set(Calendar.DATE, 1);
		
		
		// ->>
		
		//Calendar  사용
		Calendar c = new GregorianCalendar(year, month - 1, 1);
		return c.getActualMaximum(Calendar.DATE); // 날짜 중 가장 큰 날짜
		
	}
	
}//class
