package days09;

import java.sql.Date;
import java.util.Calendar;

public class Ex01_02 {

	public static void main(String[] args) {
		
		/*data클래스 사용.
		Date d = new Date(2022-1900, 7-1, 1);
		System.out.println(d.toLocaleString()); 
		
		int dayOfWeek = d.getDay();
		System.out.println(dayOfWeek);
		
		d.setMonth(d.getMonth()+1); // d.getMonth : 날짜 d의 월을 가져오겠다.
		System.out.println(d.toLocaleString());
		
		d.setDate(d.getDate()-1);
		System.out.println(d.toLocaleString() );
		
		System.out.println(d.getDate());
	*/
		
		//Calendar 사용. 앞으로 달력출력시 쓸 코딩임.
		Calendar c = Calendar.getInstance(); // 오늘날짜가 찍힘.
		c.set(2020, 5-1, 1); //왜 5에서 1을 빼나?
		System.out.println( c );
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); // 요일 가져오는 코드.
		
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);
		
		

	}

}
