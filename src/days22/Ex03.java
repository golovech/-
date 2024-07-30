package days22;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		// [ 직렬화(Serialization) ]
		//   ㄴ	객체를 스트림으로 만드는 것.
		//			 (데이터 송/수신)
		// [ 역직렬화(Descrialization)]
		//   스트림 -> 객체로 만드는 것.
		
		// 객체를 직렬화/역직렬화 할 수 있는 바이트 스트림
		// ObjectInputStream
		// ObjectOutputStream
		
		// 사람(사용자) 정보를 송/수신하려면.
		// 이름, 주소, 나이 등.. 정보
		// String info = "최사랑/서울/27/등등";
		
		User u1 = new User("이시훈","1234",30);
		User u2 = new User("원충희","4321",38);
		
		ArrayList<User> list = new ArrayList<User>();
		list.add(u1);
		list.add(u2);
		
		// u1, u2, list 객체를 직렬화 -> 파일에 저장(쓰기)
		String name = ".\\src\\days22\\user.ser";
		try (FileOutputStream fos = new FileOutputStream(name);
			ObjectOutputStream oos = new ObjectOutputStream(fos); // 보조스트림	
				){
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			oos.flush();
			System.out.println("> u1,u2,list 객체를 직렬화 시켜서 oos파일로 저장완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
