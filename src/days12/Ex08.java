package days12;

/**
 * @author love
 * @date 2024. 7. 16. - 오후 3:44:26
 * @subject		객체 (클래스) 배열
 * @content
 *
 *				국어점수 5000명
 *				int kor = 90; . . . . 개많아!!안됨.
 *				이럴때 배열을 쓴다.
 *				int [] kors = new int [500000];  <-- 배열!
 *				
 *				Point p1 = new Point();
 *
 */
public class Ex08 {

	public static void main(String[] args) {
			// 객체명 X 배열명 O
		
		Point [] points = new  Point [5000]; // 클래스 배열
		points[0] = new Point() ; // 인스턴스 생성 // 클래스 배열을 사용할 때 주의할 점
		points[0].x = 10;
		points[0].y = 20;
		points[0].dispPoint();
		
	}

}
