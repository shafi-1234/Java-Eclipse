package com.LabTask;

public class Rectangle {
	int length=20;
	int breadth=30;
	static int area;
	static int perimeter;

	public static void main(String[] args) {
		Rectangle a= new Rectangle();
		a.calculateArea();
		System.out.println("Area of triangle : "+area); 
		System.out.println("Perimeter of triangle : "+perimeter); 
		 

	}
	void calculateArea() {
		
		area=length*breadth;
		perimeter=2*(length+breadth);
		
	}

}
