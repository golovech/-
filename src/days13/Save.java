package days13;

// 저축 클래스

public class Save {
	// field
	// 인스턴스 변수
	private String name; // 예금주
	private long money; // 예금액
	
	private static double rate = 0.04;  // 명시적 초기화 == 선언할 때 초기화하여 값을 주는 것.
	// 이자율. ㄴ 클래스 변수, 공유(shared) 변수, static(정적) 변수. 클래스에 하나만 있는 변수.
	
	// constructor
	public Save() {
		// super();
		
	}

	public Save(String name, long money, double rate) {
		// super();
		this.name = name;
		this.money = money;
		this.rate = rate;
	}
	
	//getter,setter

	
	public void dispSave() {
		System.out.printf("> 예금주: %s, 예금액:%d, 이자율:%.2f\n", this.name, this.money, this.rate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		Save.rate = rate;
	}
	
}
