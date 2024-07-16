package days07;

public class Ex02_03 {

	public static void main(String[] args) {
//      이등변삼각형
//      __*  i=1  j=2   j=1
//      _*** i=2  j=1   j=3
//      *****i=3  j=0   j=5
     //              2*i-1

     for (int i = 1; i <= 3; i++) { // 행갯수
        for (int j = 1; j <= 3-i; j++) {
           System.out.print("_");
        }
        for (int j = 1; j <= 2*i-1; j++) {
           System.out.print("*");
        }
        System.out.println();
     }

	}

}
