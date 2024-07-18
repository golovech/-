package days14;

public class Car {
	
	//field 차의 구성품
	String name;
	String gearType;
	int door;
	private Engine engine = null; // has - a 관계 
	// Engine engine = new Engine(); // 결합력이 높은 코딩. 일체형. 안하는게 좋음
	
	
	//constructor
	Car(){
		this.engine = new Engine();
	}
	
	
	public Car(Engine engine) {
		this.engine = engine;
	}


	//getter, setter
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	
	//method
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	void stop() {
		this.engine.stop();
	}
	
	
}
