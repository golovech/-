package days08;

import java.util.Calendar;

public class Ex03_02 {

	public static void main(String[] args) {
		// [주민등록번호]
		// 5. 나이( 만나이, 세는나이 )
		String rrn = "890722-1170001";
		// 한국식나이 올해년도-생일년도 + 1
		// 만나이  올해년도-생일년도 ( 생일안지났으면 - 1 )
		// 6. 검증
		
		int koreaAge = getKoreaAge(rrn);   //한국식 나이
		System.out.printf(">한국식(세는) 나이 : %d살\n", koreaAge);
		int americanAge = getAmericanAge(rrn); // 만 나이
		System.out.printf(">만 나이 : %d살\n", americanAge);
		
	} // main
	
	// 연 나이 = 올해년도 - 생일년도
	private static int getYearAge(String rrn) {
		int birthYear = Integer.parseInt(Ex03.getBirthday(rrn).substring(0,4));
		// Calendar 클래스 현재(올해)년도
		Calendar cal = Calendar.getInstance();
		int thisYear = cal.get(Calendar.YEAR);
		
		return thisYear - birthYear;
	}
	
	private static int getKoreaAge(String rrn) {
		return getYearAge(rrn) + 1;
	}
	
	private static int getAmericanAge(String rrn) {
		int americanAge = getYearAge(rrn);
		// 오늘 날짜가 생일이 지나지 않았다면 -1
		Calendar cal = Calendar.getInstance();
		int thisMonth = cal.get(Calendar.MONTH) + 1;
		int thisDay = cal.get(Calendar.DATE);
		int thisMD = thisMonth * 100 + thisDay;
		int birthMD = Integer.parseInt(rrn.substring(2,6));
		
		if ( thisMD < birthMD ) {
			americanAge--;
		}
		return americanAge;
		
		/*
		int currentDate = 0710;
		int getDate = Integer.parseInt(rrn.substring(2,6));
		if ( getDate < currentDate) {
			System.out.println("생일 지남");
			return getYearAge(rrn);
		} else {
			System.out.println("생일 안지남");
			return getYearAge(rrn) -1;
		}
		*/
	}

	public static String getBirthday(String rrn) {
		int year = Integer.parseInt(rrn.substring(0, 2));
		int month = Integer.parseInt(rrn.substring(2, 4));
		int day = Integer.parseInt(rrn.substring(4, 6));
		
		String gender = getGender(rrn);  // "1900/남/외국인"
		
		int century = Integer.parseInt(gender.split("/")[0]);
		year = century + year;
		
		String birthDay = String.format("%d년 %d월 %d일", year, month, day);
		return birthDay;
	}

	public static String getGender(String rrn) {
		// "1900/남/외국인"
		int gender = Integer.parseInt(rrn.substring(7, 8));
		
		char 성별 = gender % 2 == 0 ? '여' : '남';
		String 국적 = 5 <= gender && gender <= 8 ? "외국인" : "내국인";
		int 세기 = 1800;
		switch (gender) {
		case 1: case 2: case 5: case 6:
			세기 = 1900;
			break;
		case 3: case 4: case 7: case 8:
			세기 = 2000;
			break;
		default:
			세기 = 1800;
			break;
		}
		
		return String.format("%d/%c/%s", 세기, 성별, 국적);
	}

} // class
