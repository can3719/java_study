package java_study;

class BindingTest {
	public static void main(String[] args) {
//		Parent54 p = new Child54();
		Child54 c = new Child54();
		
//		System.out.println("p.x="+p.x);
//		p.method();
		
		System.out.println("c.x="+c.x);
		c.method();
	}
}

class Parent54 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child54 {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}
