package days22;

import java.io.File;
import java.io.IOException;

/**
 * @author love
 * @date 2024. 7. 30. - 오전 10:33:38
 * @subject
 * @content
 *
 */
public class Ex02_04 {

	public static void main(String[] args) throws IOException {
		// 폴더 생성, 삭제
		String parent = ".\\src\\days22";
		// days22 폴더 안에 upload 폴더가 있나없나?
		// -> 없을경우 폴더 생성하기
		
		File uploadDir = new File(parent, "upload" );
		
		//System.out.println(uploadDir.exists());
		if (!uploadDir.exists()) {
//			uploadDir.createNewFile(); // createNewFile : boolean형
//			uploadDir.mkdir();
//			uploadDir.mkdirs();
			System.out.println(uploadDir.mkdirs());
		} else {
			// upload 된 폴더 삭제
			System.out.println(uploadDir.delete()); // 즉시 삭제
			// System.out.println(uploadDir.deleteOnExit()); // 실행중인 프로그램이 종료되면 삭제함.
		}
		
	} // main

} // class
