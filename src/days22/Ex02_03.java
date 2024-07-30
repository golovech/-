package days22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author love
 * @date 2024. 7. 30. - 오전 10:16:39
 * @subject
 * @content
 *
 */
public class Ex02_03 {

	public static void main(String[] args) {
		// Line  Text  Path
		
		String pathname = ".\\src\\days21";
		String keyword = "DataInputStream";
		File parent = new File(pathname);
		File [] list = parent.listFiles((dir,name) -> name.endsWith(".java"));
		
		File child = null;
		int line = 0;
		String text = null;
		String path = null;
		String fileName = null;
		String strLine = null;
		
		for (int i = 0; i < list.length; i++) {
			child = list[i];
			fileName = child.getName(); // 파일 가져온 상태
			line = 1;
			
			try (
					FileReader reader = new FileReader(child);
					BufferedReader br = new BufferedReader(reader); // 보조
					){
				while ((strLine = br.readLine()) != null) {
					if(strLine.contains(keyword)) {
						strLine.replace(keyword, "***"+keyword+"***");
						System.out.printf("%d\t%s\t%s\n", line, strLine, fileName);
						// strLine = strLine.replaceAll(keyword, "<span style='color:red'>"+keyword+"</span>");

					} // if
					line++; // line 1씩 증가
				} // while
				
			} catch (Exception e) {
				e.printStackTrace();
			} // try
		} // for
		

	} // main

} // class
