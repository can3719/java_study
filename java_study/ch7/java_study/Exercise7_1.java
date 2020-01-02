package java_study;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard71[] cards = new SutdaCard71[CARD_NUM];
	
	SutdaDeck() {
		/*
		 * 배열 DutdaCard를 적절히 초기화 하시오.
		 */
		for(int i=0; i<cards.length; i++) {
			int num=i%10+1;
			boolean isKwang = (i<10) && (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard71(num, isKwang);
		}
	}
}

class SutdaCard71 {
	int num;
	boolean isKwang;
	
	SutdaCard71() {
		this(1, true);
	}
	
	SutdaCard71(int num, boolean isKwang){
		this.num = num;
		this.isKwang=isKwang;
	}
	
	// info() 대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i]+",");
	}

}
