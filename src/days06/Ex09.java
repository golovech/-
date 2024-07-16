package days06;

/**
 * @author dewbuster
 * @date 2024. 7. 8. - 오후 5:08:38
 * @subject
 * @content
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		/*
		*
		**
		***
		****
		*/
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=".repeat(30));
		/*
		****
		***
		**
		*
		*/
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		___*
		__**
		_***
		****
		*/		
		
		System.out.println("=".repeat(30));


		for (int i = 1; i <= 4; i++) {  // 행 갯수
			// _ 공백 찍는 for
			for (int j = 1; j <= 4-i; j++) {
				System.out.print("_");
			}
			// 별 찍는 for
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} // for i
		/*
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		****
		_***
		__**
		___*
        */

		System.out.println("=".repeat(30));
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		*
        _*
        __*
        ___*
        ____*
		*/

		System.out.println("=".repeat(30));

		for (int i = 5; i >= 1; i--) {
			for (int j = i+1; j <=5; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}


       /*
  	   ____*
	   ___*
	   __*
	   _*
	   *
       */

		System.out.println("=".repeat(30));
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <=i-1; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}

		
	} // main

} // class
