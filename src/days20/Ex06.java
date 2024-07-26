package days20;
/**
 * @author love
 * @date 2024. 7. 26. - 오후 2:01:15
 * @subject	클래스 안에 인터페이스(중첩) / 클래스 안에 클래스 중첩 가능 예시
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		
		Button callButton = new Button(new CallListener());
		callButton.touch();
		
		Button messageButton = new Button();
		messageButton.setListener(new MessageListener());
		messageButton.touch();
		
	} // main

} // class

// 버튼 : 클릭이벤트 발생 -> 일을 처리
class Button {
	
	OnClickListener listener; // 필드 선언 : 예) Engine engine;
	
	public OnClickListener getListener() {
		return listener;
	}
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	Button(){}
	Button(OnClickListener listener){
		this.listener = listener;
		
	}
	
	void touch() {
		this.listener.onClick();
	}
	
	interface OnClickListener {
		void onClick(); // 구현할 추상메서드 선언
		
	}
	
}
// Button.OnClickListener 구현한 클래스 선언
class CallListener implements Button.OnClickListener {
	
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
		
	}
	
}

class MessageListener implements Button.OnClickListener {
	
	@Override
	public void onClick() {
		System.out.println("문자 메세지를 전송할게요.");
		
	}
	
}

