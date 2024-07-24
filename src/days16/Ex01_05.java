package days16;

import java.util.Scanner;

public class Ex01_05 {

	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		scanner.close();
//
		/*
		Scanner scanner = new Scanner(System.in);
		try {
			//
			//
			//
			//
		} catch (Exception e) {

		} finally {
			scanner.close();
		}
		*/

		// try~ resources 문
		try (Scanner scanner = new Scanner(System.in);){

		} catch (Exception e) {
			// TODO: handle exception
		}


		try {
			try {
				try {

				} catch (Exception e) {
					// TODO: handle exception
				}
			} catch (Exception e) {
				try {

				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			try {

			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
