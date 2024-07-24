package days18;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author love
 * @date 2024. 7. 24. - 오전 10:36:21
 * @subject		[형식화 클래스 (format)]
 * @content		1. SimpleDateFormat
 * 				2. DecimalFormat
 * 				3. ChoiceFormat
 * 				4. MessageFormat
 *
 */
public class Ex02 {

	public static void main(String[] args) throws ParseException {
		
//		// 1번
//		Calendar c = Calendar.getInstance();
//		Date d = c.getTime();
//		
//		// 간편한. 날짜. 형식!
//		String pattern = "yyyy.MM.dd (E) hh:mm:ss";
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		String s = sdf.format(d);
//		System.out.println(s);
		
//		// 2번
//		String s = "2024/07/24 (수)"; 
//		Date d = new Date(s);
		
		String s = "2024.07.24 (수)";  // 꼭 . 을 써서 바꾸고싶다면?
		String pattern = "yyyy.MM.dd (E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date d = sdf.parse(s);
		System.out.println(d.toLocaleString());
		
		
		
	} // main

} // class
