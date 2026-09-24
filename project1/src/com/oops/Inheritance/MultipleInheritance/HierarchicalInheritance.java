// HierarchicalInheritance=Multiple child classes inherit from the same parent class.

//       A
//      / \
//     B   C

package com.oops.Inheritance.MultipleInheritance;

class vehicleHierarchical{
	void display() {
		System.out.println("Parent class -vehicle Hierarchical called");
	}
}
class carHierarchical extends vehicleHierarchical {
	void display() {
		System.out.println("child class 1 (car) - extends patrent class(vehicleHierarchical)");
	}
}

class suvHierarchical extends vehicleHierarchical{
	void display() {
		System.out.println("Child class 2(suv) - extends parent class(vehicleHierarchical)");
	}
	
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		vehicleHierarchical v= new vehicleHierarchical();
		v.display();
		
		vehicleHierarchical c= new carHierarchical();
		c.display();
		
		vehicleHierarchical s= new suvHierarchical();
		s.display();



	}

}
