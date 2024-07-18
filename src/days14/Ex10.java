package days14;

// static import 문
//import static java.lang.Math.random;
//import static java.lang.Math.PI;
import static java.lang.Math.*;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * 1. 패키지
		 * 	- 서로 관련 있는 클래스, 인터페이스들의 묶음.
		 * 2. 클래스의 효율적인 관리
		 * 3. 예)
		 * 		java.io 패키지
		 * 		java.net 패키지
		 * 			: 
		 * 		java.util 패키지
		 * 4. 패키지명 + 동일한 이름의 클래스(만약 패키지명과 이름까지 같다면? )
		 * 		패키지명의 충돌을 막으려면 ,, 도메인명 == 패키지명 사용하기.
		 * 		naver.com -> com.naver	순서를 바꾸던지..
		 * 5. 패키지명 == 물리적으로는 디렉토리(폴더) 생성
		 * 	  java.io 패키지명		java 폴더
		 * 							 ㄴ io 폴더 생성
		 * 								ㄴ 클래스
		 * 6. 자바 파일의 첫 문장에 package명 입력;
		 * 7. 패키지명은 소문자로 시작한다.
		 * 8. 다른 패키지의 클래스를 사용할 때는
		 * 	  import문을 사용해서 클래스가 포함된 패키지명을 적는다.
		 * 9. ex) 풀네임을 적으세요 -> 패키지명.클래스명
		 * 10. import 문이 없는 경우에는 ctrl + shift + o // 단축키 
		 * 		ㄴ 자동으로 import문 완성됨.
		 * 11. import java.io.*;
		 * 		java.io 패키지 안의 모든 클래스를 import 하겠다, 는 뜻
		 * 
		 * 	ex) 	com.sist
		 * 				ㄴ Student.class
		 * 			com.sist.class5
		 * 					ㄴ Member.class
		 * 
		 * 			import com.sist.*; // sist 내의 폴더영역만 임포트됨. (sist의 하위 폴더는 안됨)
		 * 
		 * 12. import java.lang.*; 컴파일러가 자동으로 추가함.
		 * */
		
		System.out.println(PI);
		System.out.println(random());

	}

}
