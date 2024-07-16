package days02;


/**
 * @author dewbuster
 * @date 2024. 7. 2. - 오후 12:35:42
 * @subject 자바 표준 출력 함수
 * @content println(), print(), printf()
 *
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		String name;
		double height;
		
		name = "원충희";
		height = 172.55;
		// [출력 형식]
		// 이름은 "원충희"이고, 키는 172.55cm 이다.
		/*
		System.out.println(name);
		System.out.println(height);
		System.out.print("이름은 " + name + "이고, 키는 " + height +"cm 이다.");
		*/
	
		//출력형식이 있는 경우 출력하는 메서드: printf() + format(형식)
		// String name => printf( %s ) conversion
		// double height => printf( %f ) conversion
		System.out.printf("이름은 \"%s\"이고, 키는 %.2fcm 이다.", name, height);
	}

}
