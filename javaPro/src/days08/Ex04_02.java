package days08;


public class Ex04_02 {

	public static void main(String[] args) {
		// [정보처리 기사 실기]
		
		int money = 125760;
		int count = 0;
		int unit = 50000;
		boolean sw = false; //스위치변수

		while (unit >= 1) {
			count = money / unit;
			money = money % unit;
			System.out.printf("%,d원 : %d개 \t %d\n", unit, count, money);
			
			unit /= sw ? 2 : 5;
			sw = !sw;
		}

	} // main

} // class
