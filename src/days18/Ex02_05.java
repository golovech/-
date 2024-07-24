package days18;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex02_05 {

	public static void main(String[] args) throws ParseException {
		
		// String s = " [팀장]김준석(전), 최사랑(비), 박준용(전), 원충희(비), 이시훈(비)";
		String output = "이름:권맑음, 나이:26살, 성별:남자, 키:178.67, 등급:A 입니다.";
		
		String pattern = "이름:{0}, 나이:{1}, 성별:{2}, 키:{3}, 등급:{4} 입니다.";
		MessageFormat mf = new MessageFormat(pattern);
		Object [] objs =  mf.parse(output); // 안의 이름들만 뽑아오겠다~
		for (Object v : objs) {
			System.out.println(v);
		}
	}

}
