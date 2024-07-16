package days06;

public class Ex04_02 {

	public static void main(String[] args) {

		// 다섯 정수(a,b,c,d,e)를 입력받아서 max, min 출력.
		int a, b, c, d, e;
		a = (int) (Math.random() * 100) + 1;
		b = (int) (Math.random() * 100) + 1;
		c = (int) (Math.random() * 100) + 1;
		d = (int) (Math.random() * 100) + 1;
		e = (int) (Math.random() * 100) + 1;
		
		System.out.printf("a=%d,b=%d,c=%d,d=%d,e=%d\n", a,b,c,d,e);

		int min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
		int max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
		
		System.out.printf("min: %d max: %d", min, max);

	} // main

} // class
