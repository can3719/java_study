package java_study;

class Card9_6 {
	String kind;
	int number;
	
	Card9_6(){
		this("SPADE", 1);
	}
	
	Card9_6(String kind, int number){
		this.kind=kind;
		this.number=number;
	}
	
	public String toString() {
		return "kind : "+kind+", number : "+number;
	}
}

public class CardToString2 {
	public static void main(String[] args) {
		Card9_6 c = new Card9_6("HEART", 10);
		System.out.println(c.toString());
	}
}
