package days18;
// DecimalFormat
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.regex.Pattern;

public class Ex02_02 {

	public static void main(String[] args) throws ParseException {
		int money = 3276500; // "3,276,500" ->  문자열이 됨 . 콤마때문에.
		
		// 1.
//		String smoney = String.format("%,d", money);
//		System.out.println(smoney);
		
		// 2. DecimalFormat
//		// String pattern = "#,###"; // 세자리마다 콤마를 찍겠다는 뜻.
//		// String pattern = "#,###.00"; // 소숫점 2째자리까지 찍겠다는 뜻.
//		String pattern = "\u00A4#,###.00"; // 통화기호를 붙이겠다는 뜻.
//		DecimalFormat df = new DecimalFormat(pattern);
//		String smoney = df.format(money);
//		System.out.println(smoney);
		
		String s = "3,123.23";
		// 1.
//		s = s.replace(",", "");
//		System.out.println(s);
//		double d = Double.parseDouble(s);
//		System.out.println(d);
		
		// 2.
		String pattern = "#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		double d = (double) df.parse(s);
		System.out.println(d);
		
		
		
	} // main

} // class
