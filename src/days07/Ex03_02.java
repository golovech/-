package days07;

public class Ex03_02 {

	public static void main(String[] args) {
		// 주민등록번호
		String rrn = "830412-1700001";
		// 주민등록번호를 출력
		// 830412-*******
		/*
	      String [] rrnArr = rrn.split("-");
	      System.out.println( Arrays.toString(rrnArr) );
	      rrnArr[1] = "*******";
	      // 복습 String 메서드들
	      String printRrn = String.join("-", rrnArr);
	      System.out.println(printRrn);
		 */
		// 830412-1******
		// 1. 풀이
		/*
	      String [] rrnArr = rrn.split("-");
	       char gender = rrnArr[1].charAt(0);
	       String printRrn = rrnArr[0]+"-"+ gender + "******";
	       System.out.println( printRrn );
		 */

		// 2. 풀이
		/*
	       char [] rrnCharArr = rrn.toCharArray();
	       System.out.println( Arrays.toString(rrnCharArr));
	       for (int i = 8; i < rrnCharArr.length; i++) {
	         rrnCharArr[i] = '*';
	      }
	       System.out.println( Arrays.toString(rrnCharArr));
	       // char [] -> String
	       String printRrn = new String(rrnCharArr);
	       System.out.println( printRrn );
		 */

		// 3. 풀이
		String strYear = rrn.substring(0, 2);
		String strMonth = rrn.substring(2, 4);
		String strDay = rrn.substring(4, 6);
		String strGender = rrn.substring(7, 8);
		System.out.println( strYear );
		System.out.println( strMonth );
		System.out.println( strDay );
		System.out.println( strGender );

		System.out.println(rrn.substring(0, 8) + "******" );


	}

}
