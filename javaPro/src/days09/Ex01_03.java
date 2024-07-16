package days09;

public class Ex01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int year = 2020; year <= 2025; year++) {
			for (int month = 1; month <=12; month++) {
				Ex01.printCalendar(year,month);
			}
			System.out.println("X" .repeat(60));
		}
		
	}

}
