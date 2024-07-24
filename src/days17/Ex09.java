package days17;

import java.util.Calendar;

/**
 * @author kenik
 * @date 2024. 7. 23. - 오후 5:08:29
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		// jdk 1.0    java.util.Date  클래스
		//                    ㄴ java.sql.Date

		// jdk 1.1     java.util.Calendar 클래스
		Calendar c = Calendar.getInstance();
		// System.out.println( c.toString() );
		// 년
		// public static final int YEAR = 1;
		System.out.println( Calendar.YEAR );
		System.out.println( c.get(1)  );
		System.out.println( c.get(Calendar.YEAR)  );
		// 월
		System.out.println( c.get(Calendar.MONTH) + 1 );
		// 일
		System.out.println( c.get(Calendar.DATE)  );
		System.out.println( c.get(Calendar.DAY_OF_MONTH)  );

		// 시간
		System.out.println( c.get(Calendar.HOUR)  ); // 0-11 12시간
		System.out.println( c.get(Calendar.HOUR_OF_DAY)  ); // 0-11 24시간
		// 분
		System.out.println( c.get(Calendar.MINUTE)  );
		// 초
		System.out.println( c.get(Calendar.SECOND)  );
		// 밀초
		System.out.println( c.get(Calendar.MILLISECOND)  );

		// 요일
		// Date      0(일) 1(월) 2(화)... 6(토)
		// Calendar  1(일) 2(월) 3(화)... 7(토)
		System.out.println( c.get(Calendar.DAY_OF_WEEK)  );

		System.out.println( c.get(Calendar.AM)  );
		System.out.println( c.get(Calendar.AM_PM)  );

		// 마지막날짜


	} // main

} // class








