package days14;

public class Ex03 {

	public static void main(String[] args) {
		
		// 객체(클래스) 복사, 복제
		// 생성자 복제
		Point p1 = new Point();
		p1.x  =1;
		p1.y = 5;
		
		Point p2 = new Point(); 
		

	}//main

}//class
class Shape{
	String color = "white";
	
	void draw() {
		System.out.printf("[color = %d]",this.color);
	}
	
	void 면적계산() {
		
	}
	
} // shape


class Circle extends Shape {
	Point center;
	int r;
	
	Circle(){
		this(0,0,0);
	}
	Circle(int x, int y, int r){
		this.center = new Point(x,y);
		this.r = r;
	}
	@Override // 아무것도 수정하면 안되는데, 부모의 접근지정자보다 크거나 같은 접근지정자를 붙이는건 괜찮다.
	void 면적계산() {
		
		
	}

	
	
}
class Triangle extends Shape{
	
	Point [] p = null;
	
	public Triangle(Point []p) { // 생성자 DI (의존성 주입)
		this.p = p;
	}

	@Override
	void 면적계산() {
		
		super.면적계산();
	}
	
}
// 모든 클래스의 최상위 클래스 == Object 클래스. [ java.lang.Object ]
class Point { // 컴파일러가 자동으로 Object 클래스 상속해버린다.
	int x,y;
	
	int x , y; // 필드생성
	Point(){	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point(){
		this(0,0);
	}
	
	String getXY(){
		return String.format("(%d, %d)", this.x,this.y);
	}
}
