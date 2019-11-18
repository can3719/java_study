package java_study;

class Tv {
	// Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	
	//Tv의 기능(메서드)
	void power() {power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; } 
}

public class TvTest3 {
	
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel 값은 "+t1.channel+"번 입니다.");
		System.out.println("t2의 channel 값은 "+t2.channel+"번 입니다.");
		
		t2=t1;
		t1.channel = 7;		// channel 값을 7로 한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel 값은 "+t1.channel+"번 입니다.");
		System.out.println("t2의 channel 값은 "+t2.channel+"번 입니다.");
	}

}
