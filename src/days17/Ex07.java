package days17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kenik
 * @date 2024. 7. 23. - 오후 2:36:09
 * @subject
 * @content
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		 * 1. 정규 표현식(regular expression == regex) 정규식
		 *  - 미리 정의된 기호
		 *  - 문자열 속에 원하는 패턴(조건)과 일치하는 문자열을
		 *  찾아내기 위해서 사용된다.
		 *  - boolean String.matches(regex)
		 *  - java.util.regex 패키지
		 *            ㄴPattern 클래스
		 *            ㄴMatcher 클래스
		 * */
		String [] data = {
				"bat","baby","bonus","cA","ca","co", "c.", "c0", "car"
                , "combat", "count", "date", "disc", "fx"
                };
		// 1) c 문자로 시작하는 문자열 찾아서 출력.
//		String regex = "c";
//		String regex = "^c.*";
		String regex = "c.*";
		for (int i = 0; i < data.length; i++) {
			//if(data[i].startsWith("c")) System.out.println(data[i]);
			if(data[i].matches(regex))	System.out.println(data[i]);
		}
		//
		//String regex ="c.*";
		regex ="c[a-zA-Z]*";
		regex ="c[a-zA-Z0-9]*";
		regex ="c\\w*";  // [a-zA-Z0-9]  == \\w
		regex ="c.";
		regex ="c\\.";
		regex ="c[0-9]";
		regex ="c\\d";
		regex ="^c.*t$";
		regex ="c[^0-9]";
		regex ="c\\D";   // [^0-9] == \\D
		regex ="(b|c).{2}";
		regex ="[bc].{2}";
		regex ="[bcd].{2,3}";
		regex ="[b-d].{2,3}";
		// bcd 문자는 제외한 알파벳 대소문자
		regex ="[A-Za-z&&[^b-d]].*";  // *  0개 이상
		regex ="[A-Za-z&&[^b-d]].+";  // +  1개 이상
		regex ="[A-Za-z&&[^b-d]].?";  // ?  0,1

		// 패턴 객체 p
		Pattern p = Pattern.compile(regex);
		for (int i = 0; i < data.length; i++) {
			// 매쳐 객체 m
			Matcher m = p.matcher(data[i]);
			if( m.matches() ) System.out.println( data[i]);
		}

		// [문제] 비밀번호 입력 ?
		//          비밀번호 길이 8~15 문자
		//                   숫자 1개 이상
		//                   소문자 1개 이상
		//                   대문자 1개 이상
		//                   특수문자 1개 이상   #@$%
		// String regex = "????";


	} // main

} // class








