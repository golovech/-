package days18;
/**
 * @author love
 * @date 2024. 7. 24. - 오전 11:50:49
 * @subject
 * @content
 *
 *			[	jdk 1.8 에 추가된 날짜, 시간	]
 *				java.time
 *				ㄴ j.t.chrono: 표준(ISO)가 아닌 달력 시스템을 위한 클레스 제공
 *				ㄴ j.t.format: 형식화(파싱) 클래스 제공
 *				ㄴ j.t.temporal: 날짜, 시간의 필드(field)와 단위(unit) 클래스 제공
 *				ㄴ j.t.zone: 시간대(time-zone) 클래스 제공
 *
 *				2. java.time : 날짜, 시간을 다루는 핵심 클래스
 *                 1) 날짜 : LocalDate
 *                 2) 시간 : LocalTime
 *                 3) 날짜+시간 : LocalDateTime
 *                 4) 날짜+시간+시간대 : ZonedDateTime
 *                     -> Temporal, TemporalAdjuster 인터페이스를 구현한 클래스.
 *                     
 *              3. Period	= 날짜와 날짜 사이의 간격을 계산할때 사용하는 클래스
 *                 Duration = 시간과 시간 사이의 간격----.
 *                    -> TemporalAmount 인터페이스 구현
 *                    
 *              4. java.time 의 핵심 클래스    new 객체 생성 하지 X
 *                 : of(), now() 
 *               
 *              5. 날짜+시간의 <단위>를 정의하는 인터페이스 : TemporalUnit
 *                 위의 인터페이스를 구현한 클래스		  : ChronoUnit
 *                 
 *              6. 날짜+시간의 <필드(field)>를 정의해놓은 인터페이스 : TemporalField, ChronoField
 *              
 *              7. 특정 필드(년,월,시,분 등...) 얻어올 때
 *                 get(년도) , getYear()
 *                 get(월),	   getMonth()
 *                 			   getXXX()
 *              
 *              8. 특정 필드(년,월,시,분 등...)를 수정할 때
 *                 with()
 *                 plus()
 *                 minus()
 *                 roll() / add()
 *                 
 */         
public class Ex03 {

	public static void main(String[] args) {
		
		

	}//main

}//class
