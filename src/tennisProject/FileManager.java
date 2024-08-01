package tennisProject;

import java.io.File;
import java.io.FileWriter;

public class FileManager {
	
	String path = "C:\\Users\\User\\Documents\\tennis.txt";
	
	public void log(String line) {

		File file = new File(path);
		
		try (FileWriter writer = new FileWriter(file,true)){

			writer.write(line);

		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
	} 
}
