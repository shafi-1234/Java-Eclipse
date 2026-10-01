//1.Create a Java program using inheritance with a parent class Vehicle and a child class Car.
//Requirements:
//Vehicle should have a variable speed = 50 and a method display().
//Car should have its own variable speed = 100 and override the display() method.
//Create a Car object using a parent-class reference.
//Access the speed variable and call the display() method.
//Predict the output before running the program.
//Explain why the variable and method behave differently. 

package com.oops.Inheritance.Lab;
class Vehical{
	int spedd=50;
	void display() {
		System.out.println("Vehical Speed : " +spedd);
	}
	
}

class car extends Vehical{
	int spedd=100;
	void display() {
		System.out.println("Car Speed : "+spedd);
	}
}

public class Drive {

	public static void main(String[] args) {
		Vehical c=  new car();
//		car c1=new Vehicle(); // Error because child class not refer to parent class 
		c.display();
		
	}
	

}
