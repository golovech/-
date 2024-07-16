package days09;

public class Ex04_04 {

	public static void main(String[] args) {
		
		// 16진수 : 125 -> 0x7D
		int n = 125;
		int share, reminder;
		String hex = "";
		char[] ch = {'0','1','2','3','4','5','6','7','8','9','a', 'b', 'c', 'd', 'e', 'f'};
		while ( n !=0 ) {
			share = n / 16; //몫
			reminder = n % 16; // 나머지
			hex = ch[reminder] + hex; // 기억하기!
			n = share;
		}
		hex  = "0x"+hex;
		System.out.println(hex);

	}

}
