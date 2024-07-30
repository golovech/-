package days22;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author love
 * @date 2024. 7. 30. - 오전 9:16:26
 * @subject
 * @content
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		String currentDirectory = System.getProperty("user.dir");
		File parent = new File(currentDirectory);
		// System.out.println(parent.isDirectory()); // parent는 디렉토리냐?
		
		// 하위 폴더, 파일 조회하려면?
		// String [] parent.list(); // 하위 디렉토리(폴더+파일) 목록을 반환하는 함수.
		// String [] parent.list(filter); // 필터링된 하위 디렉토리 목록을 반환함.
		// File [] parent.listFiles(); // <파일>객체 배열로 돌려주는 함수.
		// File [] parent.listFiles(filter); // 필터링된 <파일>객체 배열로 돌려주는 함수.
		
//		String [] list = parent.list();
//		for (int i = 0; i < list.length; i++) {
//			System.out.print(list[i] + " / ");
//			File child = new File(parent,list[i]);
//			System.out.println(child.isFile() ? "파일" : "폴더");
//		}
		
		File [] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			File child = list[i];
			String name = child.getName();
			long ms = child.lastModified(); // 마지막 수정된 날짜
			Date dt = new Date(ms);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");
			System.out.printf("%s\t%s\t\t%s%d\n", child.isFile() ? "파일" : "[폴더]",
					name,sdf.format(dt) , child.length());
		} // 삼항연산자.
		
		
		
	} // main

} // class
