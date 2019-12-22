package java_study;

class CastingTest2 {
	public static void main(String args[]) {
		Car_wan Car_wan = new FireEngine();
		Car_wan Car_wan2 = null;
		FireEngine fe = null;
		
		Car_wan.drive();
//		fe = (FireEngine)Car_wan;
		fe.drive();
		Car_wan2 = fe;
		Car_wan2.drive();
	}
}


