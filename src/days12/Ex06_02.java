package days12;

/**
 * @author love
 * @date 2024. 7. 16. - 오후 3:25:21
 * @subject		얕은 복제
 * @content		깊은 복제
 *
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		// 객체(클래스) 복제 (Clone)
		Point p1 = new Point ();
		p1.x = 10;
		p1.y = 20;
		p1.m = new int[2];
		p1.m[0]=1; p1.m[1]=2;
		
		p1.dispPoint();
		
		// 객체 복사
		Point p2 = p1;
		p2.dispPoint();
		
		// 객체(클래스) 복제 (Clone)
		Point p3 = new Point();
		p3.x = p1.x;
		p3.y = p1.y;
		// p3,n = p1.m; => 얕은 복제
		
		//깊은 복제 -> 수를 일일히 복제한다..
		p3.m = new int [2];
		p3.m[0] = p1.m[0];
		p3.m[1] = p1.m[1];
	}

}
