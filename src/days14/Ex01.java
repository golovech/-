package days14;

/**
 * @author love
 * @date 2024. 7. 18. - 오전 9:28:53
 * @subject
 * @content
 *
 *
  6. [취업 문제] ego(자아)
  String n = "keNik";   kenik
  String m= "kKnie";   kknie
  
  위의 두 문자열 n, m 이 알파벳과 알파벳갯수가 똑같은지 비교하는 코딩 
  결과는 같을 경우 true/ 다를 경우 false 로 출력.
  조건) 대소문자는 구분하지 않는다.    
  
 *
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		
		  String n = "keNik";   
		  String m = "kKnie";   // 길이 체크 -> 대/소문자로 변환 -> char. Array.배열 -> 정렬 sort -> 문자가 같은지 비교
		  
		  char [] nArr = n.toUpperCase().toCharArray();
		  char [] mArr = m.toUpperCase().toCharArray();
		  
		  //System.out.println(n);
		  //System.out.println(m);
		  
		  
		

	}

}
