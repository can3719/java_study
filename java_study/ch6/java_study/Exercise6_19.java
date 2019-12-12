package java_study;

class Exercise6_19 {
	
	public static void change(String str) {
		str += "456";
	}
	
	/*
	public static String change(String str) {
		String str1 = "";
		str1 = str + "456";\
		return str;
	}
	*/
	
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);
	}

}
