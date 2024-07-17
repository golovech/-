package days13;
/**
 * @author love
 * @date 2024. 7. 17. - 오후 2:38:10
 * @subject		[ this 키워드 ]
 * @content	1. 정의 ~~ 자기자신의 인스턴스 주소값을 갖는 참조 변수 / 주소값을 저장하는 기억공간 
 *				Tv t1;  // t1 : 변수, 참조변수, 객체
 *				Tv t2;  // new Tv 
 *				Tv [this] // 우리가 직접 만든 적은 없지만, 컴파일러가 만들어주는 참조변수.
 *				[0x100] <- 주솟값
 *				this
 *	
 *			2. this의 3가지 용도
 *				ㄱ. 멤버(class, 객체의 구성요소) = 생성자, 필드, 메서드(getter,setter)
 *					를 가리킬 때의 this 를 쓴다. p1  --> this. // 메서드를 구분하기 어려울때 ex. 이름이 같을때라던가... 메서드 앞에 붙여준다. this.name 처럼
 *				ㄴ. 생성자에서 또 다른 생성자를 호출할 때에 this 를 쓴다.
 *				ㄷ. 리턴값, 매개변수값으로 사용할 때 this 를 쓴다. (return this)
 *				
 */
public class Ex07 {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		p1.plusPoint(100).dispPoint();
		
		
		//
		Member m1 = new Member("최사랑","신월동");
		System.out.println(m1.getName() + "/" + m1.getAddr());
		
		Member m2 = new Member();
		System.out.println(m2.getName() + "/" + m2.getAddr());
	} // main

} // class

class Member{
	//field
	private String name;
	private String addr;



	// constructor
	public Member() {
	//	super();
		this("익명","미정"); // 디폴트 생성자 // 매개변수 2개를 가진 생성자를 호출-> name에는 익명이, 주소에는 미정이 들어감.
								// 주의!! 다른 코딩보다 제일 윗 라인에 있어야한다. (얼마나 위에?)
	}
	
	public Member(String name, String addr) {
		this.name = name; // 클래스 자기자신의 네임. 이라는 뜻의 this.
		this.addr = addr;
		
	}
	
	
	// getset
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}
