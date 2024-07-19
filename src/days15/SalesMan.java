package days15;

import days14.Regular;

// 영업직 사원 클래스
// class 앞에 final 붙이면: 더이상 자식 클래스를 가질 수 없는 최종(마지막)클래스
public final class SalesMan extends Regular { // 세일즈맨은 자식 못만드는 클래스가 됨.
	
	// Employee 의 등등 물려받음.
	// R-p, getpay 등 물려받음.
	private int sales; // 판매량
	private int comm; // 커미션
	
	public SalesMan() {
		super();
		System.out.println("> SalesMan 디폴트 생성자 호출됨.");
	}

	public SalesMan(
			String name, String addr, String tel, String hiredate, int basePay,
			int sales, int comm) {
		super(name,addr, tel, hiredate, basePay);
		this.sales = sales;
		this.comm = comm;
		System.out.println("> SalesMan 7 생성자 호출됨.");
		
	}

	@Override // @Override == 부모에게 받은 메서드를 재정의
	public int getPay() {
		
		return super.getPay() + this.sales * this.comm; // 영업직 사원의 급여 // this: 부모의 멤버를 가리키는 용도로 사용. 
	}

	@Override
	public void dispEmpInfo() {
		System.out.printf("사원명: %s, 주소: %s, 연락처: %s, 입사일자: %s, 기본급:%d" + ", 판매량: %d, 커미션: %d\n"
				,this.getName(),this.getAddr(),this.getTel(),this.getHiredate(),this.getBasePay(),this.sales,this.comm);
	}
	
	
	
}
