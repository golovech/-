package days15;

//			~able : 움직일 수 있는
interface Movable {
	int COLOR = 1; // public static final 생략됨 (상수!)
	void move(int x, int y); // public abstract 가 사용되었지만 생략됨.



}

abstract class Unit {
	int currentHP; // 현재 유닛의 체력
	int x ; // 현재 유닛의 위치값 (x좌표)
	int y ; // 좌표

}

interface Attackable{
	void attack(Unit unit);
}
// 인터페이스끼리 다중상속이 가능하다 ( extends 사용 )
interface Fightalble extends Movable, Attackable {

}

// 하늘 유닛
class AirUnit extends Unit{

}

// 땅 유닛
class GroundUnit extends Unit{

}

// 수송선
class DropShip extends AirUnit implements Fightalble{

	@Override
	public void move(int x, int y) {


	}

	@Override
	public void attack(Unit unit) {


	}

}

// 군인
//class Fighter implements Movable, Attackable{
class Fighter extends GroundUnit implements Fightalble{

	@Override
	public void move(int x, int y) {
		// 걷기, 뛰기

	}

	@Override
	public void attack(Unit unit) {
		// 총, 칼

	}

}

class Tank extends GroundUnit implements Fightalble, Repairable{

	@Override
	public void move(int x, int y) {
		// 탱크이동
		
	}

	@Override
	public void attack(Unit unit) {
		// 포 공격
		
	}
	
}

interface Repairable{ // scv가 수리 가능한지 아닌지 구별하는 용도로만 쓰는 인터페이스.
	
}

// 공격, 수리, 건설
// 수리 가능 : tank, SCV
// 수리 불가 :Fighter
class SCV implements Fightalble, Repairable{

	@Override
	public void move(int x, int y) {
	
		
	}

	@Override
	public void attack(Unit unit) {
		
		
	}
	// 수리하는 메서드 추가
	void repair(Repairable unit) {
		if (unit instanceof Tank) {
			// 탱크 수리하는 코딩
		}else if (unit instanceof SCV) {
			// SCV 수리하는 코딩
		}
	}
	
	
}

// 해상
class Marine extends Unit implements Fightalble{

	@Override
	public void move(int x, int y) {
		
		
	}

	@Override
	public void attack(Unit unit) {
		
		
	}
	
}