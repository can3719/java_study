package java_study;

import java.util.*;

class Product722 {
	int price;								// 제품의 가
	int bonusPoint;							// 제품구매 시 제공하는 보너스 점
	
	Product722(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);		// 보너스점수는 제품 가격의 10%
	}
	
	Product722() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv722 extends Product722 {
	Tv722() { super(100); }
	public String toString() {return "Tv"; }
}

class Computer722 extends Product722 {
	Computer722() { super(200); }
	public String toString() {return "Computer"; }
}

class Audio722 extends Product722 {
	Audio722() { super(50); }
	public String toString() {return "Audio"; }
}

class Buyer722 {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	
	void buy722(Product722 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		item.add(p);
		System.out.println(p+"를 구입하셨습니다.");
	}
	
	void refund(Product722 p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary722() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Product722 p = (Product722)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", "+p;
		}
		System.out.println("구입하신 물품의 총금액은 "+sum+"만원 입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}

class PolyArgumentTest3 {
	public static void main(String args[]) {
		Buyer722 b = new Buyer722();
		Tv722 tv = new Tv722();
		Computer722 com = new Computer722();
		Audio722 audio = new Audio722();
		
		b.buy722(tv);
		b.buy722(com);
		b.buy722(audio);
		b.summary722();
		System.out.println();
		b.refund(com);
		b.summary722();
	}
}
