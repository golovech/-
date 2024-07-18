package days14;

public class Ex11 {

	public static void main(String[] args) {
		
		
		/*
		 * 	[4개 클래스]
		 * 	  Object
		 * 	  ↑	   ↑
		 * temp	Employee	사원클래스 (공통적으로 가지고 있는 멤버)
		 * 		   ↑
		 * 		Regular		정규직 사원 클래스
		 * 		   ↑
		 * 		SalesMan	영업직 사원 클래스
		 * 
		 * 	 [개념설명]
		 * 1. 상속
		 * 2. 오버로딩 / 오버라이딩
		 * 3. this / super 키워드 설명
		 * 4. 추상메서드, 추상 클래스
		 * 5. 인터페이스
		 * 6. 다형성
		 * 7. 업캐스팅 / 다운캐스팅 (클래스들 간의 형변환)
		 * 
		 * 	
		 * */
		
		// 1. 사원 객체 생성 -> 출력
//		Employee emp1 = new Employee("최사랑","서울 양천구","010-1234-1234","2024.07.18");
//		emp1.dispEmpInfo();

		
		// 2.
//		Regular emp2 = new Regular("최사랑","서울 양천구","010-1234-1234","2022-02-02",5000000);
//		emp2.dispEmpInfo(); // 기본급은 출력이 안됐다. 부모에게서 물려받지 못했기 때문..
//		System.out.println(emp2.getPay());
		
		
		// 2-2.  다형성 이해가 필요함.
		// 부모타입			자식객체
		// 정규직(R)은 사원(E)이다.
		// [ 클래스 간의 형변환 ]
		// 업캐스팅(upcasting) 자동 형변환 : 높은 부모에 자식이 속해서 자동으로 속하는 것.
		Employee emp2 = new Regular("최사랑","서울 양천구","010-1234-1234","2022-02-02",5000000);
		emp2.dispEmpInfo();
		// System.out.println(emp2.getPay());
		
		// 다운캐스팅 : 부모객체 --> 자식객체로 형변환 
		// cast 연산자 사용하여 강제 형변환. 
		// == (Regular) emp2;
		Regular emp3 = (Regular) emp2;
		
		
		//int i = 100;
		//long l = i;
		
		// 상속관계가 없는 클래스들은 형변환이 되지 않는다.
		// Point p = new Regular;
		
		
		
	} // main
	
	

} // class
