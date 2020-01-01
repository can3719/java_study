package java_study;

class InterfaceTest3 {
	public static void main(String[] args) {
		A728 a = new A728();
		a.methodA();
	}
}

class A728 {
	void methodA() {
		I728 i = InstanceManager.getInstance();
		i.methodB();
	}
}

interface I728 {
	public abstract void methodB();
}

class B728 implements I728 {
	public void methodB() {
		System.out.println("methodB in B728 class");
	}
}

class InstanceManager {
	public static I728 getInstance() {
		return new B728();
	}
}

