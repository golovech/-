package days17;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author kenik
 * @date 2024. 7. 23. - 오전 11:09:02
 * @subject
 * @content
 *
 */
public class Ex01_02 {

	public static void main(String[] args) {
		Integer [] m = { 3, 5, 2, 4, 1 };
		System.out.println( Arrays.toString( m ) );

		//Arrays.sort(m, new 비교자());
		/*
		Arrays.sort(m, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				 return  o2 - o1;
			}
		});
		*/

		/*
		Arrays.sort(m, (Integer o1, Integer o2)->{
			 return  o2 - o1;
		});
		*/

		// Arrays.sort(m, (o1, o2)-> o2 - o1);
		Arrays.sort(m, (o1, o2)-> o1.compareTo(o2));


		System.out.println( Arrays.toString( m ) );



		/*
		Arrays.sort(m);  // ASC(오름차순 정렬)
		System.out.println( Arrays.toString( m ) );
		int [] temp = new int[m.length];
		for (int i = 0; i < m.length; i++) {
			temp[temp.length-1 -i] = m[i];
		}
		System.out.println( Arrays.toString( temp ) );
		*/

		/*
		// IntStream -> Stream<Integer>
		Integer [] temp = Arrays.stream(m).boxed().toArray(Integer[]::new);
		Arrays.sort(temp, Collections.reverseOrder());
		System.out.println( Arrays.toString( temp ) );
		*/



	} // main

} // class


class 비교자 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		int a = (int) o1;
		int b = (int) o2;

		return b-a;
	}

}



