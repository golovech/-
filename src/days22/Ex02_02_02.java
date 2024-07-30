package days22;

import java.io.File;
import java.io.FilenameFilter;

public class Ex02_02_02 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days21";
		// 자바파일만 조회하려면?
		File file = new File(pathname);
		
		File [] list = file.listFiles((d,n) -> n.endsWith(".java")); // 람다식
		for (int i = 0; i < list.length; i++) {
			File f = list[i];
			System.out.println(f.getName()); // 출력 for문
		}
		
		
//		File [] list = file.listFiles(new FilenameFilter() {
//			
//			@Override
//			public boolean accept(File dir, String name) {
//				
//				return name.endsWith(".java");
//			}
//		});
//		for (int i = 0; i < list.length; i++) {
//			File f = list[i];
//			System.out.println(f.getName());
		//}
		
		

	}

}
