package days12;

public class Ex03 {

	public static void main(String[] args) {
		// 지역변수(메인함수 안에 있는 변수)는 접근지정자(public) 붙이면 오류남. 
		// public int age = 10;	=> 지역변수
		
		int [] m = null;
		m = new int [3];
		
		
		
		Tv t1; // t1 == 객체
		t1 = new Tv(); // 인스턴스화 하는 코딩, 객체 생성하는 코딩, // 객체 = 인스턴스
		// 멤버들을 접근하는 방법 : 객체명, 필드명, 객체명, 메서드명()
		// Tv. 클래스명.
		t1.power();
		System.out.println(t1.power ? "O" : "X"); // 켜졌다!
		
		
		t1.channel = 10;
		System.out.println(t1.channel);
		t1.channelDown(); // 9
		System.out.println(t1.channel);
		
		t1.power();
		System.out.println(t1.power ? "O" : "X"); // 꺼졌다!
		
		
		
//동물
//당나귀 고양이 강아지
//강아지는 뉴 동물 
	
	
	} // main

} // class
