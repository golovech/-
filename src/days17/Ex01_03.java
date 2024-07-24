package days17;

import java.util.Arrays;
import java.util.Collections;

public class Ex01_03 {

	public static void main(String[] args) {
		String[] names = {
				"김재민",
				"전재윤",
				"김선우",
				"송세호",
				"김인경"
		};
		Arrays.sort(names); // 오름차순 정렬
		System.out.println(Arrays.toString(names));
		Arrays.sort(names,  Collections.reverseOrder());
		System.out.println(Arrays.toString(names));

	}

}
