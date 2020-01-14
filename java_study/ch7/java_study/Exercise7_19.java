package java_study;

class Exercise7_19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv_e719());
		b.buy(new Computer());
		b.buy(new Tv_e719());
		b.buy(new Audio_e719());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product_e719[] cart = new Product_e719[3];		// 구입한 제품을 저장하기 위한 배열
	int i=0;							//Product_e719 배열 cart에 사용될 index
	
	void buy(Product_e719 p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 "+p+"을/를 살 수 없습니다.");
			return;
		}
		money=money-p.price;
		add(p);
	}
	
	void add(Product_e719 p) {
		if(i>=cart.length) {
			Product_e719[] tmp = new Product_e719[cart.length*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart=tmp;
		}
		cart[i++]=p;
	}
	
	void summary() {
		String itemList="";
		int sum=0;
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null)
				break;
			itemList = itemList+cart[i]+", ";
			sum=sum+cart[i].price;
		}
		
		System.out.println("구입한 물건 : "+itemList);
		System.out.println("사용한 금액 : "+sum);
		System.out.println("남은 금액 : "+money);
	}
}

class Product_e719 {
	int price;
	
	Product_e719(int price){
		this.price = price;
	}
}

class Tv_e719 extends Product_e719 {
	Tv_e719() {super(100); }
	public String toString() {return "Tv"; }
}

class Computer extends Product_e719 {
	Computer() {super(200); }
	public String toString() {return "Computer"; }
}

class Audio_e719 extends Product_e719 {
	Audio_e719() {super(50); }
	public String toString() {return "Audio"; }
}
