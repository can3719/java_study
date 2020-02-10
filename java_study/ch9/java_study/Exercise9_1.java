package java_study;

public class Exercise9_1 {
	public static void main(String[] args) {
		SutdaCard91 c1 = new SutdaCard91(3,true);
		SutdaCard91 c2 = new SutdaCard91(3,true);
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c1.equals(c2) : "+c1.equals(c2));
	}
}

class SutdaCard91 {
	int num;
	boolean isKwang;
	
	SutdaCard91(){
		this(1,true);
	}
	
	SutdaCard91(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard91) {
			SutdaCard91 c = (SutdaCard91)obj;
			return num==c.num && isKwang==c.isKwang;
		}
		return false;
		/*
		 * 매개변수로 넘겨진 객체의 num, isKwang과
		 * 멤버변수 num, isKwang을 비교하도록 오버라이딩 하시오.
		 */
	}
	
	public String toString() {
		return num + (isKwang ? "K":"");
	}
}
