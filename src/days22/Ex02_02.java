package days22;

import java.io.File;

public class Ex02_02 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days21";
		// 자바파일만 조회하려면?
		
		File file = new File(pathname);
		File [] list = file.listFiles();
		int no = 1;
		for (int i = 0; i < list.length; i++) {
			File f = list[i];
			if (f.isFile()) {
				String fileName = f.getName();
				if (fileName.endsWith(".java")) {
					System.out.printf( "%d. %s\n", no++, fileName );
				}
				
			}
		}
		
		

	}

}
