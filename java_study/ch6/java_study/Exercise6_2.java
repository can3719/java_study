package java_study;

class Exercise6_2 {
	
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());		// 3이 출력된다.
		System.out.println(card2.info());		// 1k가 출력된다.
	}

}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);		// SutdaCArd(1, true)를 호출한다.
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + ( isKwang? "K" : "");
	}
	
}
