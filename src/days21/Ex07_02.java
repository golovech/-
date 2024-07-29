package days21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.stream.Stream;

/**
 * @author love
 * @date 2024. 7. 29. - 오후 2:10:05
 * @subject
 * @content
 *
 */
public class Ex07_02 {

	public static void main(String[] args) throws IOException {
		String content = "package days21;\r\n"
				+ "/**\r\n"
				+ " * @author love\r\n"
				+ " * @date 2024. 7. 29. - 오전 9:01:17\r\n"
				+ " * @subject\r\n"
				+ " * @content\r\n"
				+ " *\r\n"
				+ " */\r\n"
				+ "public class Ex01 {\r\n"
				+ "\r\n"
				+ "	//	enum Direction { EAST, SOUTH, WEST, NORTH } // enum 은 클래스와 같으므로.. 대문자로 선언.\r\n"
				+ "	enum Direction { EAST(100, \"▶\"), SOUTH(200, \"▼\"), WEST(300, \"◀\"), NORTH(400,\"▲\") ;\r\n"
				+ "\r\n"
				+ "		private int value;\r\n"
				+ "		private String symbol;\r\n"
				+ "		\r\n"
				+ "		\r\n"
				+ "		\r\n"
				+ "		Direction(int value, String symbol) {\r\n"
				+ "			this.value = value;\r\n"
				+ "			this.symbol = symbol;\r\n"
				+ "		} \r\n"
				+ "		\r\n"
				+ "		public int getValue() {\r\n"
				+ "			return this.value;\r\n"
				+ "		}\r\n"
				+ "		public String getSymbol() {\r\n"
				+ "			return this.symbol;\r\n"
				+ "		}\r\n"
				+ "	} // enum 은 클래스와 같으므로.. 대문자로 선언.\r\n"
				+ "	/*\r\n"
				+ "	 * 컴파일러가 클래스 변환시킴\r\n"
				+ "	 * class Direction extends Enum {\r\n"
				+ "	 * 		static final Direction EAST = new Direction();\r\n"
				+ "	 * }\r\n"
				+ "	 * \r\n"
				+ "	 * private String name;\r\n"
				+ "	 * public String name(){\r\n"
				+ "	 * 	 return this.name;\r\n"
				+ "	 * }\r\n"
				+ "	 * \r\n"
				+ "	 * private int ordinal;\r\n"
				+ "	 * public int ordinal(){\r\n"
				+ "	 * 	 return this.ordinal;\r\n"
				+ "	 * }\r\n"
				+ "	 * \r\n"
				+ "	 * */\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "//		System.out.println(Direction.EAST); // \"EAST\" 라는 문자열\r\n"
				+ "//		System.out.println(Direction.EAST.toString()); // 위의 코딩과 같은 뜻이다.\r\n"
				+ "//		System.out.println(Direction.EAST.name() ); // EAST\r\n"
				+ "//		System.out.println(Direction.EAST.ordinal()); // 인덱스값 순번 출력\r\n"
				+ "		\r\n"
				+ "		Direction [] dirArr = Direction.values(); // 모든 Direction 을 가져오겠다.\r\n"
				+ "		for (Direction dir : dirArr) { // foreach\r\n"
				+ "			System.out.println(dir.name() + \"/\" + dir.ordinal() + \"/\" + dir.getSymbol() + \"/\" + dir.getValue());\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "\r\n"
				+ "	} // main\r\n"
				+ "\r\n"
				+ "} // class\r\n"
				+ "";
		// 21번째 라인의 문자열을 String line21 변수에 저장한 후 출력해라!
		// 1. 풀이
//		String [] datas = content.split("\r\n");
//		String line21 = datas[20];
//		System.out.println(line21);
		
		// 2. 풀이
//		StringReader reader = new StringReader(content);
//		BufferedReader br = new BufferedReader(reader);
//		for (int i = 0; i < 20; i++) br.readLine(); 
//			String line21 = br.readLine();
//			System.out.println(line21);
		
		// 3. 풀이
		// content 안의 데이터를 \r\n을 기준으로 자르겠다. 20줄 스킵하겠다.
		String line21 = Stream.of(content.split("\r\n")).skip(20).findFirst().get() ; 
		
		
	} // main

} // class
