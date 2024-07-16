package days12;

public class Ex03_02 {

	public static void main(String[] args) {
		/*
		int [] m = null ; // 주소가 없어서. 출력이 안되는것.
		// 오류 * The local variable m may not have been initialized -> 초기화해야된다.
		// 오류 * java.lang.NullPointerException ***** 클래스 수업중 자주 나오는 오류
		 //        ㄴ 인스턴스가 생성 안 됐을때 나오는 오류!!!!
		System.out.println(m[0]);
		*/
		
		Tv t1 = null;
		t1 = new Tv(); // 출력값이 왜 1일까?
		tvTest(t1);
		
	} // main

	private static void tvTest(Tv t1) { // 클래스도 하나의 자료형.
		System.out.println(t1.channel);
		
	}

} // class
