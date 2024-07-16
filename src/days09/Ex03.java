package days09;

/**
 * @author dewbuster
 * @date 2024. 7. 11. - 오후 12:30:48
 * @subject		재귀함수 - 되풀이되는 , 순환되는 함수. 함수 안에서 자기 자신을 다시 호출하는 함수.
 * @content
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		
		disp();
		

	}

	private static void disp() {
		System.out.println( " disp()...");
		disp();
	}

}
