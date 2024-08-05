package days23;

import java.io.File;
import java.util.stream.Stream;

public class Ex08 {

	public static void main(String[] args) {
		// 클래스 배열 초기화
		File [] fileArr = {
				new File("Ex1.java"), 
				new File("Ex1.bak"),             
				new File("Ex2.java"), 
				new File("Ex1"), 
				new File("Ex1.txt")
						};  
		 Stream<File> s = Stream.of(fileArr);
		 // map() 스트림의 요소를 변환하겠다.
		 
		 // 모든 파일의 이름만 출력?
		 Stream<String> s2 = s.map(File::getName);
		 s2.forEach(System.out::println);
		 
		 Stream<File> fs = Stream.of(fileArr);
		 fs.map(File::getName)
		 .filter( a -> a.indexOf('.') != -1 ) 
		 .map(a -> a.substring(a.indexOf('.')+1))
		 .distinct().forEach(System.out::println);
	}

}
