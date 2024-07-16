package days09;

public class Ex04_02 {

	public static void main(String[] args) {
		//8진수
		int n = 10;
		int share, reminder;
		String octal = " ";

		while ( n !=0 ) {
			share = n / 8;
			reminder = n%8;
			octal = reminder + octal;
			n = share;
		}
		octal  = "0"+octal;
		System.out.println(octal);

		//		int share, reminder;
		//		
		//		int [] binary = new int [n];
		//		
		//		
		//		int index = binary.length-1;
		//		while ( n !=0 ) {
		//			share = n / 8;
		//			reminder = n%8;
		//			binary[index--] = reminder;
		//			System.out.printf("%d",reminder);
		//			n = share;
		//		}
		//		for (int i = 0; i < binary.length; i++) {
		//			System.out.printf("%d", binary[i]);
		//			
		//		}
		//		System.out.println();



	}

}
