/*
package java_study;

class Product720 {
	int price;								// 제품의 가
	int bonusPoint;							// 제품구매 시 제공하는 보너스 점
	
	Product720(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);		// 보너스점수는 제품 가격의 10%
	}
}

class Tv720 extends Product720 {
	Tv720(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product720 {
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product720 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		System.out.println(p+"를 구입하셨습니다.");
	}
}

class PloyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		Tv720 Tv720 = new Tv720();
		Computer com = new Computer();
		
		b.buy(Tv720);
		b.buy(com);
		
		System.out.println("현재 남은 돈은 "+b.money+"만원 입니다.");
		System.out.println("현재 보너스점수는 "+b.bonusPoint+"점 입니다.");
	}
}
*/