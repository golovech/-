package days12;

/**
 * @author love
 * @date 2024. 7. 16. - 오후 2:51:28
 * @subject			[ 객체(클래스) 복사와 객체(클래스) 복제 ]
 * @content						   copy                clone
 * 
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		t1.color = "red";
		System.out.println(t1.color);
		// 객체 복사 (copy)
		Tv t2 = t1; // 객체 복사(클래스 복사)
		t2.color = "blue";
		System.out.println(t1.color);

		tvTest(t1);
		System.out.println(t1.color);
		
		
	}

	private static void tvTest(Tv t) { // Tv t = t1 ; 객체 복사!
		t.color = "green";
	
		
	}

}
