package java_study;

class DeckTest {

	public static void main(String args[]) {
		Deck d = new Deck();
		Card6 c = d.pick(0);
		System.out.println(c.toString());
		
		d.shuffle();
		c=d.pick(0);
		System.out.println(c);
	}
	
}

// Deck클래스
class Deck {
	final int CARD_NUM = 52;
	Card6 c[] = new Card6[CARD_NUM];
	
	Deck() {
		int i=0;
		
		for(int k=Card6.KIND_MAX; k>0; k--) {
			for(int n=1; n<Card6.NUM_MAX+1; n++) {
				c[i++]=new Card6(k,n);
			}
		}
	}
	
	Card6 pick(int index) {
		if(0<=index && index<CARD_NUM)
			return c[index];
		else
			return pick();
	}
	
	Card6 pick() {
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	void shuffle() {
		for(int n=0; n<1000; n++) {
			int i=(int)(Math.random()*CARD_NUM);
			Card6 temp = c[0];
			c[0]=c[i];
			c[i]=temp;
		}
	}
}

// Card 클래스
class Card6 {
	static final int KIND_MAX = 4;	// 카드 무늬의 수
	static final int NUM_MAX = 13;	// 무늬별 카드 수
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card6() {
		this(SPADE, 1);
	}
	
	Card6(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String kind = "";
		String number = "";
		
		switch(this.kind) {
		case 4:
			kind="SPADE";
			break;
		case 3:
			kind="DIAMOND";
			break;
		case 2:
			kind="HEART";
			break;
		case 1:
			kind="CLOVER";
			break;
		default:
		}
		
		switch(this.number) {
		case 13:
			number="K";
			break;
		case 12:
			number="Q";
			break;
		case 11:
			number="J";
			break;
		default:
			number=this.number+"";
		}
		return "kind : "+kind+", number : "+number;
	}
}