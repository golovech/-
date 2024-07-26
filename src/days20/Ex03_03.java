package days20;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * @author love
 * @date 2024. 7. 26. - 오전 11:31:07
 * @subject		Properties 컬렉션 클래스 예제
 * @content		Ex03.java 의 jdbcConfig.pro~~파일을 사용해 환경설정값을 얻어오는 예제
 * 
 * 				p.load(FileReader)
 * 				value = p.getProperty(key)
 *				
 *				p.keySet() 모든 키를 얻어와서 value 출력함.
 */
public class Ex03_03 {

	public static void main(String[] args) {

		String className;            
		String url;                  
		String user;                                                                    
		String password; 
		
		Properties p = new Properties();
//		p.setProperty("className", "oracle.jdbc.driver.OracleDriver");
//		p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
//		p.setProperty("user", "scott");
//		p.setProperty("password", "tiger");
		
		String fileName = ".\\src\\days20\\jdbcConfig.properties";
		// 지금까지 쓴 FileReader, BufferedReader 
		// FileWriter
		try (FileReader reader = new FileReader(fileName)){
			p.load(reader);
			// user = p.getProperty("user"); // 그 값만 가져오려면? 이렇게 하면 댐.
			
			Set<Object> ks = p.keySet();
			Iterator<Object> ir = ks.iterator();
			while (ir.hasNext()) {
				String key = (String) ir.next();
				String value = p.getProperty(key);
				System.out.printf("key == %s, value == %s\n",key, value);
			}
			
			
			System.out.println("SAVE END!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
