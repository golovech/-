package days14;
/**
 * @author love
 * @date 2024. 7. 18. - 오전 10:37:20
 * @subject		[ 클래스들 간의 관계 ]
 * @content		1. has - a  관계 (포함관계) a를 ~를 가지다.
 * 					a 클래스가 b 클래스를 가지는 관계(포함하는 관계)
 * 					예 ) 차 - 엔진 클래스 // 엔진이 차의 멤버가 된다.
 *  			2. is - a	관계 (상속관계) a는 ~이다.
 *  				기존 클래스를 재사용하여 새로운 클래스를 선언하는 것.
 * 					
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		
		Engine engine = new Engine(); // Engine engine = new Engine(); 코딩은 똑같은데, car 클래스에 두는 것과 ex4클래스에 두는 것과 무엇이 다른가요?
															// 

		
		// 의존성 주입 : DI (자동차가 엔진에 의존하는 것처럼)
		
		Car myCar = new Car();// 1) 생성자 주입
		// myCar.setEngine(engine); // 2) setter 주입
		
		
		myCar.speedUp(10); // . 을 언제 쓰는지 잘 모르겠다.
		int currentSpeed = myCar.getEngine().speed; // getter 로 가져옴
		
		
		// System.out.println();
		
		System.out.println("현재 속도 :"+ currentSpeed);

	}

}
