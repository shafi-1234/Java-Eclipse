//Hybrid Inheritance=Combination of two or more types of inheritance.


//             Interface A
//             /         \
//            /           \
//    Interface B       Interface C
//            \           /
//             \         /
//           HybridInheritance

package com.oops.Inheritance.MultipleInheritance;

interface AH{
	void methodAH();
}

interface BH extends AH{
	void methodBH();
}

interface CH extends AH{
	void methodCH ();
}


public class HybridInheritance implements BH,CH{

	public static void main(String[] args) {
		
		HybridInheritance h= new HybridInheritance();
		h.methodAH();
		h.methodBH();
		h.methodCH();

	}
	@Override
	public void methodAH() {
		System.out.println("InterFace 1 called");
	}

	public void methodBH() {
		System.out.println("Interface 2 called which extends Interface 1");
	}

	public void methodCH() {
		System.out.println("Interface 3 called which extends Interface 1");
	}
	

}
