package days12;
/**
 * @author love
 * @date 2024. 7. 16. - 오후 4:07:25
 * @subject
 * @content
 *
 */
public class Ex08_02 {

	public static void main(String[] args) {
		// 클래스 배열 초기화
//		Tv [] tvArr = new Tv[3];
//		tvArr[0] = new Tv();
//		tvArr[1] = new Tv();
//		tvArr[2] = new Tv();
		
		
//		Tv [] tvArr = new Tv[]{
//				new Tv(),
//				new Tv(),
//				new Tv()
//		};
		
		
		// 위 두 코딩과 아래 코딩은 100% 같은 코딩이다. (클래스 배열 초기화를 간단하게 한 것.)
		Tv [] tvArr = {
						new Tv(),
						new Tv(),
						new Tv()
						};	// new 는 인스턴스 생성하는 용이므로, 무조건!! 있어야 함.

	} // main

} // class
