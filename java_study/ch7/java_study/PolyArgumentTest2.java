package java_study;

class Product721 {
	int price;								// 제품의 가
	int bonusPoint;							// 제품구매 시 제공하는 보너스 점
	
	Product721(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);		// 보너스점수는 제품 가격의 10%
	}
	
	Product721() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv721 extends Product721 {
	Tv721(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer721 extends Product721 {
	Computer721() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product721 {
	Audio() {
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer721 {
	int money = 1000;
	int bonusPoint = 0;
	Product721[] item = new Product721[10];
	int i=0;
	
	void buy(Product721 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		item[i++] = p;
		System.out.println(p+"를 구입하셨습니다.");
//		System.out.println(item[i].price);
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) break;
			sum+=item[i].price;
			itemList+=item[i]+", ";
		}
		
		System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}

class PloyArgumentTest2 {
	public static void main(String args[]) {
		Buyer721 b = new Buyer721();
		Tv721 Tv721 = new Tv721();
		Computer721 com = new Computer721();
		Audio audio = new Audio();
		
		b.buy(Tv721);
		b.buy(com);
		b.buy(audio);
		b.summary();
		
//		System.out.println("현재 남은 돈은 "+b.money+"만원 입니다.");
//		System.out.println("현재 보너스점수는 "+b.bonusPoint+"점 입니다.");
	}
}
