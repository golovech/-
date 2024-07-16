package days09;

import java.util.Scanner;

public class Re01 {

	public static void main(String[] args) {
		
		int year, month;
		Scanner scanner = new Scanner(System.in);
		
		int [] ymArr = getInputYM(scanner);
		year = ymArr[0];
		month = ymArr[1];
		
		printCalendar(year, month);

	}

	private static void printCalendar(int year, int month) {
		
		int dayOfWeek = getInputYM(year, month, 1);
		int lastDay = getLastDay(year, month);
		
		System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
		System.out.println("-".repeat(60));
		String strWeek = "일월화수목금토";
		for (int i = 0; i < strWeek.length(); i++) {
			System.out.printf("\t%c",strWeek.charAt(i));
		}
		System.out.println(); // 개행
		System.out.println("-".repeat(60)); // 줄
		
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		for (int i = 0; i < lastDay; i++) {
			System.out.printf("\t%d",i);
			
			if ((dayOfWeek + i) %7 == 0) System.out.println(); {
			}
		}
		System.out.println();
		
		System.out.println("-".repeat(60));
		
	}

	private static int getLastDay(int year, int month) {
		int lastDay = 0;
		int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		lastDay = months[month-1];
		if (Ex02.isLeapYear(year) && month == 2) lastDay++; 
		
		return lastDay;
	}

	private static int getInputYM(int year, int month, int i) {
		
		return 0;
	}

	private static int[] getInputYM(Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}

}
