package java_study;

class Parent77 {
	int x = 100;
	
	Parent77(){
		this.x=200;
	}
	
	Parent77(int x){
		this.x=x;
	}
	
	int getX() {
		return x;
	}
}

class Child77 extends Parent77{
	int x=3000;
	
	Child77(){
		this.x = x;
	}
	
	Child77(int x){
		this.x = x;
	}
}

class Exercise7_7 {
	public static void main(String[] args) {
		Child77 c = new Child77();
		
		System.out.println("x="+c.getX());
	}
}
