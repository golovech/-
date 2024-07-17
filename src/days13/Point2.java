package days13;

public class Point2 {

	private int x;
	private int y;
	
	public Point2() {
		
	}
	// constructor
	public Point2(int a, int b) {
		// 필드 초기화
		x = a;
		y = b;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n",x,y);
	}

	public void plusPoint(Point2 p) { 
		x = x + p.x; 
		x = y + p.y;
		
	} 
	public Point2 plusPoint(Point2 p1, Point2 p2) { 
		int x = p1.x + p2.x; 
		int y = p1.y + p2.y;
		
		// The constructor Point2() is undefined // 매개변수가 없는 생성자(디폴트 생성자)다. 매개변수 2개가 이미 있어서, 디폴트 생성자를 추가하거나, 매개변수를 넣어줘야한다?
		Point2 p = new Point2();
		p.x = x;
		p.y = y;
		return p; 
		
	}
}
