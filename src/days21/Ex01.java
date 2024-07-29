package days21;
/**
 * @author love
 * @date 2024. 7. 29. - 오전 9:01:17
 * @subject
 * @content
 *
 */
public class Ex01 {

	//	enum Direction { EAST, SOUTH, WEST, NORTH } // enum 은 클래스와 같으므로.. 대문자로 선언.
	enum Direction { EAST(100, "▶"), SOUTH(200, "▼"), WEST(300, "◀"), NORTH(400,"▲") ;

		private int value;
		private String symbol;
		
		
		
		Direction(int value, String symbol) {
			this.value = value;
			this.symbol = symbol;
		} 
		
		public int getValue() {
			return this.value;
		}
		public String getSymbol() {
			return this.symbol;
		}
	} // enum 은 클래스와 같으므로.. 대문자로 선언.
	/*
	 * 컴파일러가 클래스 변환시킴
	 * class Direction extends Enum {
	 * 		static final Direction EAST = new Direction();
	 * }
	 * 
	 * private String name;
	 * public String name(){
	 * 	 return this.name;
	 * }
	 * 
	 * private int ordinal;
	 * public int ordinal(){
	 * 	 return this.ordinal;
	 * }
	 * 
	 * */


	public static void main(String[] args) {
//		System.out.println(Direction.EAST); // "EAST" 라는 문자열
//		System.out.println(Direction.EAST.toString()); // 위의 코딩과 같은 뜻이다.
//		System.out.println(Direction.EAST.name() ); // EAST
//		System.out.println(Direction.EAST.ordinal()); // 인덱스값 순번 출력
		
		Direction [] dirArr = Direction.values(); // 모든 Direction 을 가져오겠다.
		for (Direction dir : dirArr) { // foreach
			System.out.println(dir.name() + "/" + dir.ordinal() + "/" + dir.getSymbol() + "/" + dir.getValue());
		}
		

	} // main

} // class
