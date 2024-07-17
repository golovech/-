package days13;

public class Person {

	// field
	private String name = "익명";
	private int age = 20;
	private boolean gender = false;
	
	public Person() {	}
	public Person(String n, int a, boolean g) {	
		name = n;
		age = a ;
		gender = g;
	}
	
	public Person(String n) { // 생성자 오버로딩 // 생성자의 역할: 필드 초기화 // new 뒤에 오는건 생성자 () ( 괄호 안은 매개변수 ) // 매개변수로 필드를 초기화. 
		name = n;
		
	}
	public Person(String n, int a) {
		
		name = n;
		age = a;
	}
	// method
	public void dispPerson() {
		System.out.printf("> 이름: %s, 나이: %d\n", name, age);
	}
	
	// getter, setter 만들자.
	public void setAge(int _age) { // 쓰기 전용
		if(0 <= _age && _age <= 150)
		age = _age;
		else {
			throw new NullPointerException();
		}
	}
	public int getAge() { // 읽기 전용
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
} // person
