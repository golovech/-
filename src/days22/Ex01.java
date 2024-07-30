package days22;

import java.io.File;
import java.io.IOException;

/**
 * @author love
 * @date 2024. 7. 30. - 오전 9:01:19
 * @subject		자바 IO
 * @content		팀프로젝트 진행
 * 				화수목 진행, 금 발표 / 후에 오라클 진도~
 *
 */
public class Ex01 {

	public static void main(String[] args) throws IOException {
		// [File 클래스]
		//   ㄴ 파일, 디렉토리를 관리한다.
		
		// String pathname = ".\\src\\days21\\Ex01.java";
		String pathname = "C:\\Class\\Workspace\\JavaClass\\javaPro.\\src\\days21\\Ex01.java";
		File file = new File(pathname);
		System.out.println(file.getParent()); // .\src\days21
		System.out.println(file.getName()); // Ex01.java

		System.out.println(file.getPath()); // .\src\days21\Ex01.java
		// 절대경로 : C:\Class\Workspace\JavaClass\javaPro\.\src\days21\Ex01.java
		System.out.println(file.getAbsolutePath()); 
		// 표준경로 : C:\Class\Workspace\JavaClass\javaPro\src\days21\Ex01.java
		System.out.println(file.getCanonicalPath()); 
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.length());
		System.out.println(file.exists()); // 파일 존재 유무, true
		
		// OS에서 사용하는 경로 구분자
		System.out.println(file.pathSeparator); // 파일 존재 유무, true
		// OS에서 사용하는 이름 구분자
		System.out.println(file.separator); // 파일 존재 유무, true
		
		// Ex01.java
		String fileName = file.getName();
		// 확장자
		String ext;
		// 확장자를 제외한 파일명
		String name;
		
		// 확장자 추출하는 법 채워넣기~
		
		
		
		
	} // main

} // class
