package days09;

/**
 * @author User
 * @Date 2024. 7. 11.
 * @subject 년도를 입력받아서 체크
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {

//		4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다. (year%4==0) : 평년조건식
//		100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 한다. (즉, 끝 두 자리가 00이면서 윗 자리가 4의 배수가 되는 해)	
//		year % 100 == 0 && year %400 !=0 : 평년조건식
	
		//위 사실들로 구한 윤년조건식
		//year % 4 ==0 && year %100 !=0 || year % 400 =0
		
		int count =0;
		for (int i = 1; i < 2020; i++) {;//1년부터 2020년까지
				if ( isLeapYear(i)) {
					System.out.println(i);
					count++;
				}
		}
	}//main
	

	public static boolean isLeapYear(int year) {
		if (year % 4==0 && year % 100 !=0 || year%400 ==0) {//윤년조건식
			return true;
		}
		return false;
		
	}
	
	
	
	
}//class
