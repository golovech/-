package days06;

import java.util.Arrays;

public class Ex04_03 {

	public static void main(String[] args) {
		// 1~100 임의의 정수 10개 중에 max, min
		int [] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = (int) (Math.random() * 100) + 1;
		}
		
		System.out.println(Arrays.toString(m));
		
		int max = m[0];
		int min = m[0];
		
		for (int i = 0; i < m.length; i++) {
			max = Math.max(max, m[i]);
		}
		for (int i : m) {
			min = Math.min(min, i);
		}
		
		System.out.printf("min: %d max: %d", min, max);

	}

}
