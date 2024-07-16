package days08;

public class Ex05_03 {

	public static void main(String[] args) {

		int[] m = {10, 20};
		System.out.printf("> 1. main  x=%d, y=%d\n", m[0], m[1]);
		
		swap(m);  // 3. Call By Reference

		System.out.printf("> 2. main  x=%d, y=%d\n", m[0], m[1]);

	} // main

	private static void swap(int[] m) {
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
	}

} // class
