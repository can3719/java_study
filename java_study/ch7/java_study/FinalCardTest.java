package java_study;

class Card_new {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card_new(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card_new(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND +" "+NUMBER;
	}
}

class FinalCardTest {
	public static void main(String args[]) {
		Card_new c = new Card_new("HEART", 10);
//		c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
	}
}

