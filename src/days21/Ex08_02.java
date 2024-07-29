package days21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.MessageFormat;
import java.util.stream.Stream;

import javax.print.DocFlavor.INPUT_STREAM;

public class Ex08_02 {

	public static void main(String[] args) {

		String fileName = ".\\src\\days21\\student.txt";
		try (FileReader reader = new FileReader(fileName);
				BufferedReader br = new BufferedReader(reader);){
			String info = br.readLine();
//			String pattern = "{0}, {1}, {2}, {3}, {4}, {5}, {6}";
//			MessageFormat mf = new MessageFormat(pattern);
//			Object [] obs = mf.parse(info);
//			for (Object v : obs) {
//				System.out.println(v);
//			}
		
		String pattern ="{0},{1},{2},{3},{4},{5},{6}";
        MessageFormat mf = new MessageFormat(pattern );
        Object [] datas = mf.parse(info);
        String name = (String) datas[0];
        int kor = Integer.parseInt((String)datas[1]);


//        int eng = (int) datas[2]; // String인데 int로 형변환하려고 해서 오류나는것.
//        int mat = (int) datas[3];
//        int tot = (int) datas[4];
//        double avg = (double) datas[5];
//        boolean gender = (boolean) datas[6];
//
//        System.out.printf("%s %d %d %d %f %b\n"
//              , name , kor, eng, mat, avg, gender);

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

} // class
