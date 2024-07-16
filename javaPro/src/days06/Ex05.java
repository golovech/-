package days06;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		// 1~100 까지의 임의의 정수  10개 배열 m
		// 합
		// 갯수
		// 평균
		// 최대값
		// 최소값

		int [] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)( Math.random()*100 )+1;
		}
		System.out.println( Arrays.toString(m) );
		//
		int count = m.length;
		System.out.println( "Count : " +  count);
		int sum = m[0];
		for (int i = 1; i < m.length; i++) {
			sum += m[i];
		}
		System.out.println( "Sum : " +  sum);
		double avg= (double)sum / count;
		System.out.println( "Avg : " +  avg);

	}

}
