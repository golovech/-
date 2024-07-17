package days13;

public class Time {

	// field
	public int hour;
	protected int minute;
	int second; // package
	private long millsecond; // 1000ms == 1s(초)
	
	// method
	public void privateTest() {
		millsecond = 1900;
	}
	void test() { // package 가 숨어있음.
		
	}
}
