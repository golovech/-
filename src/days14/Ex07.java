package days14;
/**
 * @author love
 * @date 2024. 7. 18. - 오후 12:28:28
 * @subject		[단일 상속] single inheritance
 * @content		[다중 상속] multiple inheritance
 * 					ㄴ 자바는 다중 상속을 지원하지 않는다.
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		

	}//main

}//class

class Tv{
	boolean power;
}

class VCR{ // 비디오 카세트 레코드
	boolean power;
}

/*
// tv + vcr
class TVCR extends Tv, VCR{

	< 다중상속은 안 돼! >
}

	==> 인터페이스를 사용하여 다중상속을 구현한다.

*/


