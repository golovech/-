package days13;
/**
 * @author love
 * @date 2024. 7. 17. - 오후 12:34:27
 * @subject		* * [ 생성자 (constructor)] * * 암 기 * *
 * @content			1. 일종의 메서드이다.
 * 					2. 메서드명 == 클래스명 . 반드시!
 * 					3. 리턴자료형 X 없다. void 등 아무것도 없음.
 * 					4. 역할 : 필드 초기화
 *					5. 호출시기 : 인위적으로 호출 X
 *									객체 생성할 때 자동으로 호출되는 함수.
 *									new Tv(); 
 *					6. 생성자도 오버로딩 가능 O
 *					7. 디폴트 생성자 (default constructor)
 *						매개변수가 없는 생성자.
 *					8. 생성자는 상속되지 않는다.
 *					9. 생성자는 접근지정자 사용 O, 기타제어자 사용 X
 *					10. 컴파일러에 의해서 생성자가 1개도 없는 경우에 
 *						자동으로 디폴트 생성자를 만든다.
 */
public class Ex05 {
	public Ex05() {

	}
	public Ex05(String msg) {

	}

	public static void main(String[] args) {
		
		// 클래스(객체) 배열
		Point2 [] points = {
				new Point2(10,20),
				new Point2(1,2)
		}; // 배열 초기화 형식이다.
		// 배열 선언은 int [] m = new int [2];
		// 배열 초기화는 int [] m = {1,2};      // { } 가 배열 초기화!
		
		
		
//		Point p1 = new Point2(10,20);
//		p1.dispPoint();
//		
//		Point2 p2 = new Point2(1,2);
//		
//		p1.x = 10;
//		p1.y = 20;
//		p1.dispPoint();
//
//		Point p2 = new Point();
//		p2.x = 1;
//		p2.y = 2;
//		p2.dispPoint();
//
//		Point p3 = p1.plusPoint(p1, p2);
//		p3.dispPoint();
//
//		p2.plusPoint(p1, p2).dispPoint();
		
	} // main

} // class
