package java_study;

public class Exercise9_2 {
	public static void main(String[] args) {
		Point3D92 p1 = new Point3D92(1,2,3);
		Point3D92 p2 = new Point3D92(1,2,3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1==p2 ? "+(p1==p2));
		System.out.println("p1.equals(p2) ? "+(p1.equals(p2)));
	}
}

class Point3D92 {
	int x, y, z;
	
	Point3D92(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	Point3D92(){
		this(0,0,0);
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Point3D92) {
			Point3D92 s = (Point3D92)obj;
			return x==s.x && y==s.y && z==s.z;
		}
		return false;
	}
	
	public String toString() {
		return "["+x+","+y+","+z+"]";
	}
	
}
