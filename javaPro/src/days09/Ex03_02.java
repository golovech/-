package days09;

import java.util.concurrent.RecursiveAction;

public class Ex03_02 {

	public static void main(String[] args) {
		
		int n = 10;
		int result = RecursiveHap(n);
		System.out.println( result );

	} // main

	private static int RecursiveHap(int n) {
		if ( n == 1 ) return n;
		else return + RecursiveHap(n-1);
		
	}

} // class
