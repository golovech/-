package days21;
// DataInputStream 은 데이터 읽고 쓰기가 편리하다.
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Ex09_02 {

	public static void main(String[] args) {

		String name ;
		int kor , eng , mat ;
		int tot ;
		double avg ;
		boolean gender;


		String fileName = ".\\src\\days21\\student.dat";
		try (	FileInputStream fis = new FileInputStream(fileName);
				DataInputStream dis = new DataInputStream(fis); 	){
			
			name = dis.readUTF();
			kor = dis.readInt();
			eng = dis.readInt();
			mat = dis.readInt();
			tot = dis.readInt();
			avg = dis.readDouble();
			gender = dis.readBoolean();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" E ~~ N ~~ D ~~ !! ");


	} // main

} // class
