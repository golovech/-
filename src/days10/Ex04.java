package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

	static int index = 0;
	static char con = 'y';
	static Scanner scanner = new Scanner(System.in);
	
	static int [] m = new int [2]; // 다른 곳에서도 접근하라는 용도.
	static int selectedNumber ; // 선택된 메뉴 번호를 저장할 변수.
	static String [] menus = {"추가","수정","삭제","검색","조회","종료"};
	
	public static void main(String[] args) throws IOException {
		
		while (true) {
			dispMenus(); // 메뉴를 출력하는 함수.
			selectMenus(); // 메뉴를 선택하는 함수.
			processMenus();
			
		}//while
		
		
	}
	// enum  열거형 선언이다.
	static final int ADD = 1;
	static final int EDIT = 2;
	
	private static void processMenus() throws IOException {
		switch (selectedNumber) {
		case ADD: //추가
			add();
			
			break;
		case EDIT: // 슈정
			
			break;
		case 3: // 삭제
			delete();
			break;
		case 4: // 검색
			search();
			break;
		case 5: // 조회 - 배열의 모든 요소를 출력.
			list();
			break;
		case 6: // 종료
			exit();
			break;


		} // switch
		일시정지();
		
	}

	private static void search() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4-1; j++) {
				System.out.printf("%d=%d",j,j+1);
				if (m[j] > m[j+1]) {
					System.out.print("change");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
					
				}
				System.out.println(Arrays.toString(m));
			}
		}System.out.println();
		
		
	}

	private static void delete() {
		System.out.println("[3. 삭제]");
		int deleteIndex ;
		
		String regex = String.format("[0-%d]", index-1); // 유효성검사
		String inpuData;
		do {
			System.out.print("> 삭제할 index 입력하세요?");
			inpuData = scanner.next();
			
		} while (! inpuData.matches(regex));
		deleteIndex = Integer.parseInt(inpuData);
		
		for (int i = deleteIndex+1; i < index; i++) {
			m[i-1] = m[i];
		}
		m[index-1] = 0;
		index--;
	}

	private static void 일시정지() {
		System.out.print(">엔터 누르면 계속합니다.");
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
	}

	private static void list() {
		System.out.println("[5. 조회]");
		if (index == 0) {
			System.out.println("\t 추가된 요소가 없습니다.");
			return; // 요소가 없기 때문에 메세지출력하고 빠져나간다는 뜻.
		} //if
		
		for (int i = 0; i < index; i++) {
			System.out.printf("m[%d]=%d", i, m[i]);
		}
		System.out.println();
	}

	private static void add() throws IOException {
		
		System.out.println("[1. 추가]");
		
		do {
			if (index == m.length)  {
				increasceArrayM();
				
				
				// System.out.println("\t 방이 가득 찼습니다!");
				// return;
			}
			System.out.printf(">정수입력?");
			int n = scanner.nextInt();
			m[index++] = n;
			
			System.out.print("\t 요소추가 계속할거니?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(con)=='Y');
		
		
		
	}
// --------------------------------------------------------------
	private static void increasceArrayM() {
//		while (index == m.length) index++;  {
//			for (int i = index; i < m.length; i++) { // 빈공간이필요함.
//			}
//		} 

			int [] temp = new int [m.length + 3];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = m[i];
			
			m = temp;
			System.arraycopy(m, 0, temp, 0, m.length);
			System.out.println(Arrays.toString(m));
		}
		
		
		
	}

	private static void exit() {
		// 메서드를 빠져나가는. 메서드 = 프로그램 종료하는 메서드 
		System.out.println("\n\n프로그램을 종료합니다.");
		System.exit(0);
		
	}

	private static void selectMenus() {
		String regex = "[1-6]"; // 유효성검사
		String inpuData;
		do {
			System.out.print("메뉴를 선택하세요!");
			inpuData = scanner.next();
			
		} while (! inpuData.matches(regex));
		selectedNumber = Integer.parseInt(inpuData); // 유효성 검사를 해서 담자.
		
		
		
	}

	private static void dispMenus() {
		System.out.println("\t\t\t[메뉴]");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("[%d]%s\t",i+1,menus[i]);
		}
		System.out.println();
	}

}
