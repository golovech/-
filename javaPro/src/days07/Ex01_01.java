package days07;

public class Ex01_01 {

	public static void main(String[] args) {

		for (int k = 1; k <= 3; k++) {
			for (int i = 0; i <= 9 ; i++) {
				for (int j = 3*k-1; j <= 3*k+1 && j != 10 ; j++) {
					if (i==0)
						System.out.printf("[%d단]\t",j);
					else
						System.out.printf("%dx%d=%d\t",j,i,i*j);
				} // for j
				System.out.println();
			} // for i
		}
	}
}
