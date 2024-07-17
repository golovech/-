package days13;

/**
 * @author love
 * @date 2024. 7. 17. - 오전 11:13:11
 * @subject
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		// 1. [메서드 - 리턴자료형이 참조형(클래스)인 경우]
		// [메서드 - 매개변수가   참조형(클래스)인 경우]
		
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		p1.dispPoint();
		
		Point p2 = new Point();
		p2.x = 1;
		p2.y = 2;
		p2.dispPoint();
		
		//p1.plusPoint(p2);
		
		//p1.dispPoint();
		
		Point p3 = p1.plusPoint(p1, p2);
		p3.dispPoint();
		// ==
		p2.plusPoint(p1, p2)       .dispPoint();
		
	} // main

} // class
