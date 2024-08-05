package days23;
/**
 * @author love
 * @date 2024. 8. 2. - 오전 10:40:33
 * @subject
 * @content
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		// 최종 연산의 결과타입이 Optional 인 경우가 있다.
		// Optional<T> ==>	'T타입의 객체' 라는 래퍼클래스다.
		// 모든 타입의 참조변수를 저장할 수 있는 객체.
		
		// 1. Optional 객체 생성 가능한 방법
		//   1) of()				of(null) 예외발생
		//   2) ofNullable()				 예외발생 X
		
		// 2. Optional 객체로부터 값을 얻어오는 방법
		//   1) get()	null	-> null이 오면 예외발생시키겠다.
		//   2) orElse()	null -> " " 리턴 (빈 문자열 리턴)
		// 		orElseGet()		null일때 " " 이 아니라, 다른 값을 반환하는것도 가능.
		
		// 3. isPresent() : Optional 객체 값이 null이면 false, 아니면 true 발생.
		
		// Optional<T>	get()
		// OptionalInt, OptionLong, OptionDouble 
		// getAsInt()	getAsLong() getAsDouble()

	} // main

} // class
