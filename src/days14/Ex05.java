package days14;
/**
 * @author love
 * @date 2024. 7. 18. - 오전 11:39:38
 * @subject		is - a [ 상속관계 ]
 * @content		상속 (inheritance)
 * 				: 기존 클래스를 재사용하여 새로운 클래스를 선언하는 것.
 * 					(	멤버들	)
 * 				장점 : 있는 코딩 재사용 -> 개발 빨라짐 -> 유지보수 용이
 * 				[접근지정자][기타제어자]class 클래스명 extends super클래스 { 
 * 							멤버 (필드, 메서드(생성자,게터세터))
 * }
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		
//		Point3D p1 = new Point3D(1,2,3);
//		System.out.println(p1.x);
		
		new Point3D(1,2,3);
		

	}//main

}//class

//class Point3D{
//	int x;
//	int y;
//	int z;
//	
//	Point3D() {	}
//	Point3D(int x, int y, int z) {
//		this.x = x;
//		this.y = y;
//		this.z = z;
//	}
//}
class Point3D extends Point2D { // 2D를 상속받겠다.
			 // extends : 확장, 연장된
	int z; // x, y는 상속되어서 지웠음.
	
	Point3D() {	
		System.out.println("Point3D 객체생성 - 디폴트생성자 호출됨.");
	}
	Point3D(int x, int y, int z) {
		
		// ㄱ 부모(super)클래스로부터 물려받은 필드를 초기화 한것.
//		this.x = x;
//		this.y = y;
		super(x, y); // 부모의 매개변수 x,y를 초기화하겠다. // 위의 코딩보다는 이 코딩이 좋다. 
		
		this.z = z;
		System.out.println("Point3D 객체생성 - 3 호출됨.");
	}
}




//기존 클래스
class Point2D { // 상속되었다.
	int x;
	int y;
	
	Point2D() {	
		System.out.println("Point2D 객체생성 - 디폴트생성자 호출됨.");
	}
	Point2D(int x, int y) { // 생성자는 상속되지 않는다.
		this.x = x;
		this.y = y;
		System.out.println("Point2D 객체생성 - 2 호출됨.");
	}
}