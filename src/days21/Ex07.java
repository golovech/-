package days21;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author love
 * @date 2024. 7. 29. - 오후 2:01:19
 * @subject		[ 메모리 스트림 ]
 * @content		주로 다른 곳에 입력/출력하기 전, 메모리상에서 데이터를 임시저장하기 위해 사용하는 스트림.
 *				ByteArray[InputStream]/ByteArray[OutputStream]
 				
 				1) 바이트 스트림 x
 *				ByteArray[InputStream]/ByteArray[OutputStream]
 				2) 문자 스트림 x
 				CharrArray[Reader] / CharrArray[Writer]
 				3) 문자 스트림	O
 				StringReader / StringWriter
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		byte [] buf = {0,1,2,3,4,5,6,7,8,9};
		try (ByteArrayInputStream bis = new ByteArrayInputStream(buf);
				ByteArrayOutputStream bos = new ByteArrayOutputStream();
				){
			int code;
			while ((code = bis.read()) != -1 )  {
				System.out.println(code);
				bos.write(code);
			}
			
			byte [] outBuf = bos.toByteArray();
			System.out.println(Arrays.toString(outBuf));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	} // main 

} // class
