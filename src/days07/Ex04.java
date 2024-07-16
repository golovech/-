package days07;

public class Ex04 {
	
	public static void main(String[] args) {
		
		// 4. 복습 풀이
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		
		while ((nextTerm = firstTerm + secondTerm) <= 100) {
			System.out.printf("%d+", nextTerm);
			sum += nextTerm;
			
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		} // while
		
		System.out.printf("=%d\n", sum);
		// 3. 풀이
		/*
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm + secondTerm;
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		nextTerm = firstTerm + secondTerm;
		
		while (firstTerm + secondTerm <= 100) {
			sum += nextTerm;
			System.out.printf("%d+", nextTerm);
			
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			nextTerm = firstTerm + secondTerm;
		}
		
		System.out.printf("=%d\n", sum);
		*/
		/* 복습 . 2.풀이
		int firstTerm = 1;
		int secondTerm = 1;
		int nextTerm;
		int sum = firstTerm + secondTerm;
		
		while (true) {
			nextTerm = firstTerm + secondTerm;
			if (nextTerm > 100) break;
			System.out.printf("%d+", nextTerm);
			sum += nextTerm;
			
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}			 
		
		System.out.printf("=%d\n", sum);
		*/
		/*
		 * equals(String)=true/false=
			equalsIgnoreCase(String)=true/false=
			charAt(index)=char=
			split(정규식)=String[]
			trim()=String=
			format()
			length()=int=
			join(구분자, String배열)=String=
			toCharArray()=char[]=
			substring(index, index)=String=
			toUpperCase()=String
			toLowerCase()=String
		 * 
		 *  가변인자 매개변수의 개수가 유동적일때 사용 타입...식별자 로 선언 메서드 내에서 배열 형태로 받는다.
		 */
		
	}

}
