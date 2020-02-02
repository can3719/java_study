package java_study;

class Point9_7 implements Cloneable {
	int x;
	int y;
	
	Point9_7(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x="+x+", y="+y;
	}
	
	public Object clone() {
		Object obj=null;
		try {
			obj=super.clone();
		} catch (CloneNotSupportedException e){ }
		return obj;
	}
}

class CloneEx1 {
	public static void main(String[] args) {
		Point9_7 original = new Point9_7(3, 5);
		Point9_7 copy = (Point9_7)original.clone();
		System.out.println(original);
		System.out.println(copy);
	}
}
