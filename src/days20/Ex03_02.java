package days20;
/*** XML 만들어본 예제 ***/
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Ex03_02 {

	public static void main(String[] args) {

		// Map : HT, HM, TM, SM,  Properties 컬렉션클래스
		// 1. HashTable<String, String> == Properties
		// 2. key + value = Entry
		// 3. 환경 설정값들을 파일로 쓰기 / 읽기 할때 사용!!
		// 							put() / get()
		//							setProperties() / getProperties()
		// 4. 저장되는 파일확장자 :	.properties
		//	  store(), storeToXML()
		//	  load()  // 읽어올때

		// 예) DBMS(오라클) + Java 연동 ( DB 연결 설정 정보 ) 
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";                                                                   
		String password = "tiger";  
		
		Properties p = new Properties();
		p.setProperty("className", "oracle.jdbc.driver.OracleDriver");
		p.setProperty("url", "jdbc:oracle:thin:@localhost:1521:xe");
		p.setProperty("user", "scott");
		p.setProperty("password", "tiger");
		
		String fileName = ".\\src\\days20\\jdbcConfig.xml";
		// 지금까지 쓴 FileReader, BufferedReader 
		// FileWriter
		try (FileOutputStream outputStream = new FileOutputStream(fileName)){
			p.storeToXML(outputStream, "jdbc config samlpe."); // FileWriter를 이용해 저장한다.
			System.out.println("SAVE END!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}