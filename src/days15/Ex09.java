package days15;
/**
 * @author love
 * @date 2024. 7. 19. - 오후 4:16:53
 * @subject		[ 클래스 간의 관계 ]
 * @content		1) has - a 관계 : engine, car
 * 				2) is - a 관계
 *
 */
public class Ex09 {

	public static void main(String[] args) {
		
		// HEngine
		Engine hengine = new HEngine();
		Car c1 = new Car(hengine);
		
		Engine kengine = new KEngine();
		Car c50000 = new Car(kengine);
		
		Engine sengine = new SEngine();
		 c50000.setEngine(sengine);

	} //main

} //class
