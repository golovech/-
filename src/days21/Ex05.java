package days21;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 *   Ex01Copy.java 복사하려면?
		 * 
		 * FileReader(읽기)  FileWriter
		 * 		      1문자 
		 * 
		 * */
		
		String sourceFile = ".\\src\\days21\\Ex01.java";
		String copyFile = "";	
		// -> split. remove. get . add. 
		
		int idx = sourceFile.lastIndexOf("\\");
		System.out.println(idx);
		
		String parent = sourceFile.substring(0,idx);
		System.out.println(parent);
		String child = sourceFile.substring(idx+1);
		System.out.println(child);
		
		idx = child.lastIndexOf(".");
		String fileName = child.substring(0,idx);
		System.out.println(fileName);
		String ext = child.substring(idx);
		System.out.println(ext);
		fileName += "Copy";
		
		copyFile = String.format("%s\\%s%s", parent, fileName, ext);
		System.out.println(copyFile);
		

		
		
		
		// 나의풀이
//		ArrayList<String> list = ArrayList<String>();
//		list.spliterator("\\");
//		list.add(xxxx);
//		System.out.println(list);
		
		// > 복사 처리 시간 : 2445300(ns)
		 fileCopyTextStream( sourceFile, copyFile );

	}

	private static void fileCopyTextStream(String sourceFile, String copyFile) {
		
		long strat = System.nanoTime();
		
		try (FileReader reader = new FileReader(sourceFile);
				FileWriter writer = new FileWriter(copyFile); ){
			int code;
			while ((code = reader.read()) != -1 ) {
				writer.write(code);
			} // while
			writer.flush();
			System.out.println("파일복사완료!");// 저장하려면 꼭 붙여야함! / 파일플러쉬
			
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n ", (end - strat));
			
		} catch (Exception e) {
			e.printStackTrace();
		}// try
		
		
		
	} // main

} // class
