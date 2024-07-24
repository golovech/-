package days18;

import java.text.ChoiceFormat;

public class Ex02_03 {

	public static void main(String[] args) {
		// [ ChoiceFormat 형식화클래스 ]
		// 1. 특정 범위에 속하는 값을 문자열로 변환해 준다.
		// 2. 불연속적인 범위의 값을 처리하는데
		//		if, swtich -> 대신해서 처리할 수 있다.
		// 예) 입력받은 국어 점수 -> 수, 우, 미, 양, 가
		// 		90~100 	"수"
		//		80~89	"우"

		//		String newPattern = "0#가|60#양|70#미|80#우|90#수"; // ""안에 특정범위 들어가야.
		//		ChoiceFormat cf = new ChoiceFormat(newPattern);

		// 특정 범위
		double [] limits  = {0, 60, 70, 80, 90};
		// 문자열
		String [] formats = { "가","양", "미", "우", "수"};
		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		int [] kors = {90, 30, 60,80, 50};
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d (%s)\n", kors[i], cf.format(kors[i]));
		}


	} //main

} //class
