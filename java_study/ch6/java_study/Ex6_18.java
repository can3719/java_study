package java_study;

class Ex6_18 {

}

class MemberCall {
	int iv = 10;				// 인스턴스 변수
	static int cv = 20;			// 클래스 변수
	
	int iv2 = cv;
	static int cv2 = iv;		// static 변수 초기화에 인스턴스 변수를 사용할 수 없다. 꼭 사용해야 한다면, 객체를 생성해야 한다.
	
	static void staticMethod1() {
		System.out.println(cv);
		System.out.println(iv);	//static메서드에서는 인스턴스 변수를 사용할 수 없다.
	}
	
	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
		instanceMethod1();		//static메서드에서는 인스턴스메서드를 사용할 수 없다.
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}
