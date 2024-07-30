package days22;

import java.io.File;
import java.io.IOException;

/**
 * @author love
 * @date 2024. 7. 30. - 오전 10:49:39
 * @subject // https://needjarvis.tistory.com/742
 * @content	람다와 스트림 코딩 이해 해두기
 *
 */
public class Ex02_05 {

	public static void main(String[] args) throws IOException {
		// days22
		//    ㄴ temp 폴더
		// 			ㄴ a.txt
		//			ㄴ b.txt
		//			ㄴ subtemp 폴
		//				ㄴ c.txt
		
//		String parent = ".\\src\\days22";
//		File folder = new File(parent, "temp");
//
//		String pathname = ".\\src\\days22\\temp\\subtemp";
//		File f = new File(pathname);
//		f.mkdirs();
//		//
//		File atxt = new File(".\\src\\days22\\temp\\a.txt");
//		atxt.createNewFile();
//		File btxt = new File(".\\src\\days22\\temp\\b.txt");
//		btxt.createNewFile();
//		File ctxt = new File(".\\src\\days22\\temp\\subtemp\\c.txt");
//		ctxt.createNewFile();
	      
	      
//		if (!folder.exists()) {
//			System.out.println(folder.mkdirs());
//			File folder2 = new File(parent, "subtemp");
//			if (!folder2.exists()) {
//				System.out.println(folder2.mkdirs());
//				File file3 = new File(parent, "c.txt");
//				if (!file3.exists()) {
//					System.out.println(file3.mkdirs());
//				} else {
//
//				}
//			} else {
//
//			}
//		} else {
//			//System.out.println(uploadDir.delete());
//		}
		
		String pathname = ".\\src\\days22\\temp";
		File f = new File(pathname);
		
		if (f.exists()) {
			// System.out.println( f.delete());
			// delete()함수 : 하위 디렉토리가 없고, 
			// 안에 파일이 없어야 삭제할 수 있다.
			// 재귀함수로 제일 자식파일부터 삭제하는 코딩 만들어보자.
			
			
			
//			del(f);
//			
//		}
//		System.out.println("end");
//		
//	} // main
//
//	private static void del(File f) {
//		if (f.exists()) {
//			System.out.println(f.delete());
//		} else {

		}
		
		scanDelete(f);
		f.delete();
		System.out.println(f.getName()+" 폴더 삭제");
	}

	public static void scanDelete(File f) {
	      File[] files = f.listFiles();

	      for (File file : files) {
	         if (file.isFile()) {
	            file.delete();
	            System.out.println(file.getName()+" 파일 삭제");
	         } else {
	            scanDelete(file.getAbsoluteFile());
	            file.delete();
	            System.out.println(file.getName()+" 폴더 삭제");
	         }
	      }
	   }




} // class
