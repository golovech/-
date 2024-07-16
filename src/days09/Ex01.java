package days09;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
	      int year, month;
	      Scanner scanner = new Scanner(System.in);

	      int [] ymArr = getInputYM(scanner);
	      year = ymArr[0];
	      month= ymArr[1];

	      printCalendar(year, month);

	   } // main

	   static void printCalendar(int year, int month) {

	      /*            2024.7
	       * ---------------------------
	       * 일   월   화   수   목   금   토
	       * ---------------------------
	       *       1   2   3   4   5   6
	       * 7                  13
	       * 14                  20
	       * 21                  27
	       * 28         31
	       * ---------------------------
	       * 1) 년 월  1일 무슨 요일 ?   월
	       * 2) 년 월  마지막날짜 몇일 ? 31
	       * */
	      int dayOfWeek =  getDayOfWeek(year, month, 1);
	      int lastDay = getLastDay(year, month);

	      //
	      System.out.printf("\t\t\t[%d년 %d월]\n", year, month);
	      System.out.println("-".repeat(60));
	      String strWeek = "일월화수목금토";
	      for (int i = 0; i < strWeek.length(); i++) {
	         System.out.printf("\t%c", strWeek.charAt(i)   );
	      }
	      System.out.println(); // 개행
	      System.out.println("-".repeat(60));
	      // 날짜 출력.
	      // 공백찍는 for문 : 1의 위치를 잡기..
	      for (int i = 0; i < dayOfWeek; i++) {
	         System.out.print("\t");
	      }
	      // System.out.printf("\t%d", 1);
	      for (int i = 1; i <= lastDay; i++) {
	         System.out.printf("\t%d", i);
	          // if (++dayOfWeek % 7 == 0) 
	         if( ( dayOfWeek + i)%7==0) System.out.println();
	      }
	      System.out.println();

	      System.out.println("-".repeat(60));
	      
	      
	      

	   } // printCalendar

	   private static int getLastDay(int year, int month) {
	      int lastDay = 0;
	      int [] months = {31,28,31,30,31,30,31,31,30,31,30,31 };
	      lastDay = months[month-1];
	      if(Ex02.isLeapYear(year) && month == 2) lastDay++;

	      return lastDay;
	   }

	   private static int getDayOfWeek(int year, int month, int day) {
	      // 2020  5  1
	       int totalDays = getTotalDays(year, month, day);
	       int dayOfWeek = totalDays % 7; // 0 일 ~ 6 토요일

	       System.out.printf("%d.%d.%d [%d]일 (%c요일)\n"
	             ,year, month, day, totalDays
	             , "일월화수목금토".charAt(dayOfWeek));

	      return dayOfWeek;
	   }

	   private static int getTotalDays(int year, int month, int day) {
	      // 1.1.1 ~ 2020.5.1
	      // 365(366) x (2020-1) + 31+28(29)+31+30+1
	      // year( 2020 ) 이전 년도 까지의 총날짜수
	      int totalDays = 0;
	      for (int i = 1; i < year; i++) {
	         totalDays +=    Ex02.isLeapYear(i) ? 366 : 365;
	      }
	      // 5            1월                              12월
	      //               0  1  2  3                      11
	      int [] months = {31,28,31,30,31,30,31,31,30,31,30,31 };
	      for (int i = 0; i < month-1; i++) {
	         totalDays += months[i];
	      }
	      if(Ex02.isLeapYear(year) && month >= 3) totalDays++;
	      totalDays++;
	      return totalDays;
	   }

	   private static int[] getInputYM(Scanner scanner) {
	      int [] ymArr = new int[2];
	      System.out.print("년도 월 입력 ? ");
	      int year = scanner.nextInt();
	      int month = scanner.nextInt();
	      ymArr[0] = year;
	      ymArr[1] = month;
	      return ymArr;
	   }

	} // class



