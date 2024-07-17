package days13;

public class Point {
	// field
	public int x;
	public int y;
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		//
	}
	// p1.plusPoint(100)
	public Point plusPoint(int temp) {
		Point p = new Point(this.x + temp , this.y + temp) ;
		thisTest(this); // 매개변수로 사용되는 this의 3번째 용도
		return p; // 리턴값으로 사용되는 this의 3번째 용도
	}
	
	private void thisTest(Point p) {
		p.dispPoint(); // p1값 출력한다는 의미.
		
	}
	// method
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n",x,y);
	}
	// Duplicate method plusPoint(Point) in type Point 
	// p1.plusPoint(p2);
	public void plusPoint(Point p) { // p 이름은 마음대로 줘도 됨.
		x = x + p.x; // 여기서 p는 p1이다. p는 매서드를 호출한 객체임.
		x = y + p.y;
		
	} // p1.plusPoint(p1, p2)
	public Point plusPoint(Point p1, Point p2) { 
		int x = p1.x + p2.x; // 둘을 합쳐서 새로운 함수를 만든 것이다.
		int y = p1.y + p2.y;
		Point p = new Point();
		p.x = x;
		p.y = y;
		return p; // 
		
	}
}
