package days14;

public class Engine {
	
	// field
	int speed;
	
	// constructor (생성자)
	
	
	
	// methid
	void moreFuel(int fuel) {
		this.speed += fuel*0.05;
	}
	void lessFuel(int fuel) {
		this.speed -= fuel*0.05;
	}
	void stop() {
		this.speed = 0;
	}

}
