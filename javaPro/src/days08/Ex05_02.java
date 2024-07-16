package days08;

public class Ex05_02 {

	public static void main(String[] args) {

		int x = 10, y = 20;
		System.out.printf("> 1. main  x=%d, y=%d\n", x, y);
		
		swap(x,y);  // 3. Call By Reference

		System.out.printf("> 2. main  x=%d, y=%d\n", x, y);

	} // main

	private static void swap(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
	}

} // class
