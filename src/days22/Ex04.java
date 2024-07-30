package days22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author love
 * @date 2024. 7. 30. - 오후 2:34:32
 * @subject
 * @content
 *
 */
public class Ex04 {

	public static void main(String[] args) {

		/*
		 *  [ 직렬화 / 역직렬화 ]
		 * 1. 부모를 직렬화할 수 있는 implements Serializable 구현한 클래스라면,
		 *    자식은 Serializable 구현하지 않아도 직렬화 가능하다.
		 *    
		 * 
		 * 
		 * 
		 * */
		
		Child c = new Child();
		c.name = "홍길동";
		c.age = 20;
		// 직렬화대상에서 부모의 멤버는 제외된다.
		String name = ".\\src\\days22\\child.ser";
		try (FileOutputStream fos = new FileOutputStream(name);
			ObjectOutputStream oos = new ObjectOutputStream(fos); // 보조스트림	
				){
			oos.writeObject(c);
			oos.flush();
			System.out.println("> c 객체를 직렬화 시켜서 oos파일로 저장완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

	
} // class

class Parent
{
	String name;	
}

class Child extends Parent implements Serializable{ // 부모가 직렬화되면, 자식도 직렬화됨.
	int age;
	
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name); // 개발자 직접  추가
		out.defaultWriteObject(); // age
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF(); // 개발자 직접  추가
		in.defaultReadObject();  // age
	}

}

//class Parent implements Serializable
//{
//	String name;	
//}
//
//class Child extends Parent{ // 부모가 직렬화되면, 자식도 직렬화됨.
//	int age;
//	
//}



