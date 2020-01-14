package java_study;

abstract class Shape {
	Point p;
	
	Shape(){
		this (new Point(0,0));
	}
	
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea();		// 도형의 면적을 계산해서 반환하는 메서드
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Rect extends Shape {
	double width;
	double height;
	
	Rect(double width, double height){
		this(new Point(0,0), width, height);
	}
	
	Rect(Point p, double width, double height){
		super(p);
		this.width=width;
		this.height=height;
	}
	
	boolean isSquare() {
		return width*height!=0 && width==height;
	}
	
	double calcArea() {
		return width*height;
	}
}

class Circle extends Shape{
	double r;
	
	Circle(double r){
		this(new Point(0,0),r);
	}
	
	Circle(Point p, double r){
		super(p);
		this.r=r;
	}
	
	double calcArea() {
		return Math.PI*r*r;
	}
}

class Point {
	int x; 
	int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "["+x+", "+y+"]";
	}
}
class Exercise7_22 {

}
