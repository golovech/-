package days03;

/**
 * @author dewbuster
 * @date 2024. 7. 3. - 오후 5:16:36
 * @subject  [증감연산자]
 * @content
 *
 */
public class Ex05_06 {

	public static void main(String[] args) {
		
		// 어떤 기억공간의 값을 1증가 시키는 코딩
		 int n = 10;
		 System.out.println(n);
		 // n = n + 1;
		 // n += 1;  // += 복합대입연산자
		 //단독으로 사용될 때는 전위형/후위형 차이가 없다.
		 // n++;    // 후위형 증감연산자
		 ++n;       // 전위형 증감연산자
		 
		 // this.txtName.value = this.txtName.value + "안녕";
		 // this.txtName.value += "안녕";
		 
		 System.out.println(n);

	} //main

}  // class
