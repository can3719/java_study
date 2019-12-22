package java_study;

public class CastingTest1 {
	
	public static void main(String args[]) {
		Car_wan Car_wan = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		Car_wan = fe;		// Car_wan=(Car_wan)fe;
//		Car_wan.water();
		fe2 = (FireEngine)Car_wan;
		fe2.water();
		
	}

}

class Car_wan {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car_wan {
	void water() {
		System.out.println("water!!!");
	}
}
