package days08;


public class Ex03_03 {

	public static void main(String[] args) {
		// [주민등록번호]
		// 5. 검증
		String rrn = "890122-1170110";
		
		if ( isCheckRRN(rrn) ) {
			System.out.println("올바른 주민등록번호이다.");
		} else {
			System.out.println("잘못된 주민등록번호이다.");
		}
	} // main
	
	public static boolean isCheckRRN(String rrn) {
		
		// 2*A+3*B+4*C+5*D+6*E+7*F+8*G+9*H+2*I+3*J+4*K+5*L
		int[] m = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		int T = 0;
		for (int i = 0; i <= 12; i++) {
			// if (i == 6) continue;
			T += m[i] * ( rrn.charAt(i)-'0' );
		}
		
		int X = rrn.charAt(13)-'0';
		
		return X == (11-T%11)%10;
	}
	
/*
	public static boolean isCheckRRN(String rrn) {
		// ABCDEF-GHIJKL
		// X=(11−(2*A+3*B+4*C+5*D+6*E+7*F+8*G+9*H+2*I+3*J+4*K+5*L)mod11)mod10
		// mod 나머지연산자 : %
		int A = rrn.charAt(0)-'0';
		int B = rrn.charAt(1)-'0';
		int C = rrn.charAt(2)-'0';
		int D = rrn.charAt(3)-'0';
		int E = rrn.charAt(4)-'0';
		int F = rrn.charAt(5)-'0';
		int G = rrn.charAt(7)-'0';
		int H = rrn.charAt(8)-'0';
		int I = rrn.charAt(9)-'0';
		int J = rrn.charAt(10)-'0';
		int K = rrn.charAt(11)-'0';
		int L = rrn.charAt(12)-'0';
		int X = rrn.charAt(13)-'0';

		return X == (11-(2*A+3*B+4*C+5*D+6*E+7*F+8*G+9*H+2*I+3*J+4*K+5*L)%11)%10;
		
	}
*/
	

} // class
