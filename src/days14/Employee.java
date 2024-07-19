package days14;

// 사원클래스
// 모든 사원들이 공통적으로 가지고 있을 멤버들을 선언.

public abstract class Employee { // 추상클래스
	
	// 필드
	private String name;
	private String addr;
	private String tel;
	private String hiredate;
	
	
	// 생성자
	public Employee() {
		super();
		System.out.println("> Employee 디폴트 생성자 호출됨.");
	}

	public Employee(String name, String addr, String tel, String hiredate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 4 생성자 호출됨.");
	}

	// Getter, Setter
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	// method
	// 사원들의 정보를 출력하는 메서드
		public void dispEmpInfo() {
			System.out.printf("사원명: %s, 주소: %s, 연락처: %s, 입사일자: %s\n"
					,this.name,this.addr,this.tel,this.hiredate);
		}
	/*
	// 가상메서드 ==
		public int getPay() { // 자식의 것을 부모가 가져오니까, 자동으로 오버라이딩 됐음.
			return 0; 
		}
	*/
		// This method requires a body instead of a semicolon
		public abstract int getPay() ; // => 추상 메서드 : 몸체가 구현안된 불완전한 메서드.
}
