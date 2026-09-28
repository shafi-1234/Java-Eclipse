package com.oops.Inheritance.MultipleInheritance;
//MultiLevelInheritance=	A class inherits from another class, which itself inherits from another class.


class Vehicle{
	void display() {
		System.out.println("Parent - Vehicle Class Called");
	}
}
class car extends Vehicle{
	void display() {
		System.out.println("1st clild extend parent class - car class called");
	}
}

class suv extends car{
	void display() {
		System.out.println("2nd child extends 1 child - suv class called");
	}
}
public class MultiLevelInheritance {


	public static void main(String[] args) {
		
		Vehicle v= new Vehicle();
		v.display();
		
		// Using parent reference we can access the every chaild
		Vehicle c= new car();
		c.display();
		
		
		Vehicle s = new suv();
		s.display();

	}

}
