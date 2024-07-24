package days17;

import java.io.FileReader;
import java.util.Arrays;

/**
 * @author kenik
 * @date 2024. 7. 23. - 오후 2:11:29
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		String fileName = ".\\src\\days17\\Ex01.java";
		// 대문자 : A-20개... Z-10개   26문자
		// 소문자 : a-20개... z-10개   26문자
		// 숫자   : 0-20개... 9-10개   10문자
		// 막대그래프 출력.....
		//     가변 배열
		int [][] counts = new int[3][];
		// 0 행 대문자  0 A 65 ~ 25 Z
		counts[0] = new int[26];
		// 1 행 소문자  0열 a 97 ~ 25 z
		counts[1] = new int[26];
		// 2 행 숫자    0열 0   9 9
		counts[2] = new int[10];

		try (FileReader reader = new FileReader(fileName) ){ // try with resources 문

			// int reader.read(); 문자 코드값 , -1
			int code;
			while(  (code = reader.read()) != -1) {
				// System.out.println(code);
				if ( Character.isUpperCase( (char)code ) ) { // 대문자
					// code == 65 == 'A'
					counts[0][code - 'A']++;
				}else if(Character.isLowerCase( (char)code )) { // 소문자
					counts[1][code - 'a']++;
				}else if(Character.isDigit(code)) { // 숫자
					counts[2][code - '0']++;
				}
			} // while

			System.out.println( Arrays.toString(counts[0]));
			System.out.println( Arrays.toString(counts[1]));
			System.out.println( Arrays.toString(counts[2]));

			// 막대 그래프
			for (int i = 0; i < counts.length; i++) {
				System.out.println("=".repeat(40));
				for (int j = 0; j < counts[i].length; j++) {

					System.out.printf("'%c' : %s(%d)\n"
							, i==0?'A'+j: i==1?'a'+j: '0'+j
							, "#".repeat(counts[i][j])
							, counts[i][j]);

				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	} // main

} // class
