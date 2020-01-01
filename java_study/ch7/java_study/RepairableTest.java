package java_study;

class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Marine725 Marine725 = new Marine725();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(Marine725);
	}
}

interface Repairable { }

class GroundUnit725 extends Unit725 {
	GroundUnit725(int hp){
		super(hp);
	}
}

class AirUnit725 extends Unit725 {
	AirUnit725(int hp){
		super(hp);
	}
}

class Unit725 {
	int hitPoint;
	final int MAX_HP;
	Unit725(int hp) {
		MAX_HP = hp;
	}
}

class Tank extends GroundUnit725 implements Repairable {
	Tank() {
		super(150);			// Tank의 HP는 150이다.
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit725 implements Repairable {
	Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marine725 extends GroundUnit725 {
	Marine725() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit725 implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if (r instanceof Unit725) {
			Unit725 u = (Unit725)r;
			while(u.hitPoint!=u.MAX_HP) {
				/* Unit725의 HP를 증가시킨다. */
				u.hitPoint++;
			}
			System.out.println(u.toString()+"의 수리가 끝났습니다.");
		}
	}
}