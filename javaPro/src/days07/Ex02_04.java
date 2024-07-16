package days07;


public class Ex02_04 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {    //행갯수
			for (int j = 1; j <= 5; j++) { //열갯수
				if ( i == j ) System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {    //행갯수
			for (int j = 1; j <= 5; j++) { //열갯수
				if ( i+j == 6 ) System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
		}

/*
		*___*
		_*_*
		__*
		_*_*
		*___*
*/

		
		

/*
		__*
		_***
		*****
		_***
		__*
*/

	}

}
