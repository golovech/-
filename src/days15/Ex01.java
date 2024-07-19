package days15;

import days14.Employee;

public class Ex01 {

	public static void main(String[] args) {
		/*
		Employee emp3 = new SalesMan("최사랑","서울 양천구","010-1234-1234","2022.02.02",5000000, 20, 80000);

		emp3.dispEmpInfo(); // 조부모클래스에 임포트해도.. 본인의 객체가 출력된다. // 오버라이딩 - 오버라이딩 2번한 함수 : 건너건너 결국 본인의 객체를 호출하는 원리 //
		 */
		Employee emp4 = new Temp("최사랑","서울 양천구","010-1234-1234","2022.02.02", 20, 80000);

		emp4.dispEmpInfo();

	}

}
