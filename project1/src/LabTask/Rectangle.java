package LabTask;

public class Rectangle {

	public static void main(String[] args) {
		Rectangle a= new Rectangle();
		a.calculateArea();
		System.out.println("Area of triangle : "+a);
		 

	}
	void calculateArea() {
		int length=20;
		int breadth=30;
		int area=length*breadth;
		int perimeter=2*(length+breadth);
		System.out.println("Area of triangle : "+area); 
		System.out.println("Perimeter of triangle : "+perimeter); 
	}

}
