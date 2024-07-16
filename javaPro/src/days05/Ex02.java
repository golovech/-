package days05;

public class Ex02 {

	public static void main(String[] args) {
		// 복습
		// foreach문 (== 확장 for문)
		/*
	      for (타입 요소 : 배열 ) {         
	      }
		 */
		/* 1.
	      String [] names = new String[3];
	      names[0] = "홍길동1";
	      names[1] = "홍길동2";
	      names[2] = "홍길동3";
		 */
		/* 2. 배열 초기화
	      String [] names = new String[] {
	            "홍길동1", "홍길동2", "홍길동3"
	      };
		 */
		// 3. 배열 초기화
		String [] names = {
				"홍길동1",
				"홍길동2", 
				"홍길동3"
		};
		
		for (String name : names) {
			System.out.println(name);
		}


	} // main

} // class
