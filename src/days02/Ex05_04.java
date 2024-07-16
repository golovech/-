package days02;

/**
 * @author dewbuster
 * @date 2024. 7. 2. - 오후 4:32:00
 * @subject 진법 변환 설명
 * @content 자바 문자 타입
 *                  char 유니코드 2byte
 *
 */
public class Ex05_04 {

	public static void main(String[] args) {
		
		char ch = 'A';
		// 문자코드표
		// char(48) == '1'
		// char(65) == 'A'
		// char(97) == 'a'
		
		// 대문자
		System.out.printf("\'%c\' - %d\n", ch, (int)ch);
		System.out.printf("\'%c\' - %d\n", 'Z', (int)'Z');
		// 소문자
		System.out.printf("\'%c\' - %d\n", 'a', (int)'a');
		System.out.printf("\'%c\' - %d\n", 'z', (int)'z');
		// 숫자
		System.out.printf("\'%c\' - %d\n", '0', (int)'0');
		System.out.printf("\'%c\' - %d\n", '9', (int)'9');
		// 한글
		System.out.printf("\'%c\' - %d\n", '가', (int)'가');
		System.out.printf("\'%c\' - %d\n", '힣', (int)'힣');
		
		char c = 'A';
		char c2 = 65;
		char c3 = 0x0041;
		char c4 = '\u0041';  // 유니코드 2바이트 문자
		
		// 진법 변환
		// 63
		// 128 64 32 16   8 4 2 1
		//   0    0   1   1    1 1 1 1 
		// 8진수 077
		// 16진수 0x3f
	
	} //main

} // class
