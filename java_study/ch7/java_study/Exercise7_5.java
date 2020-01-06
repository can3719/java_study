package java_study;

class Product75
{
	int price;		// 제품의 가격
	int bonusPoint;	// 제품구매 시 제공하는 보너스 점수
	
	Product75() {}
	
	Product75(int price){
		this.price = price;
		bonusPoint=(int)(price/10.0);
	}
}

class Tv75 extends Product75{
	Tv75() {}
	
	public String toString() {
		return "Tv";
	}
}

class Exercise7_5 {
	public static void main(String[] args) {
		Tv75 t = new Tv75();
	}

}
