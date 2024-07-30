package days22;

import java.io.Serializable;

public class User implements Serializable{ // implements Serializable 해야 직렬화가 가능.
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1700884782834193335L;
	
	String name;
	// 객체를 직렬화할 때 비번 포함 안시키려면? -> transient
	transient String password;
	int age;
	
	public User() {
		this("UnKnown", "1234", 0);
	}

	public User(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + "]";
	}

	
	
}
