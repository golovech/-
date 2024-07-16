package days12;

public class Tv { 

	// 채널이동, 볼륨조절, 전원
	
	// 멤버(구성요소)
	//   ㄴ 멤버변수(필드) - 속성(특징)
	//     ㄴ [접근지정자][기타제어자]자료형 필드명[ = 초기값];
	// 지역변수는 초기화하지 않으면 사용할 수 없다.
	// 멤버변수는 초기화 이미 되어있어서. 안해도 된다.
	public boolean power ; // 멤버변수라서 ()가 없다.
	public int channel = 1;
	public String color = null;
	
	// 멤버함수 == 메서드 == 동작(기능)
	public void power() { // 멤버함수(메서드)라서 ()가 있다.
		power = !power;
		
	}
	public void channelUp() {
		channel++;
	}

	public void channelDown() {
		channel--;
	}
}
