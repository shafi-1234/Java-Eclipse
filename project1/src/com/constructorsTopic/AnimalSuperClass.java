package com.constructorsTopic;

public class AnimalSuperClass {
	String category;
	String sound;

	public static void main(String[] args) {
		AnimalSuperClass a= new AnimalSuperClass();
		a.show("Animal","Bark");

	}
	  void show(String category,String sound) {
		System.out.println("Extracted by the parent class");
		System.out.println("Category : "+category);
		System.out.println("Sound : "+sound);
		System.out.println("--------------------------------");
	}
}


 class dog extends AnimalSuperClass{
	String category = "SB";
	String sound="meow";
	public static void main (String args[]) {
		dog d = new dog();
		d.show("Dog","Bark");
		d.show1();
		
		
	}
	void show1() {
		System.out.println("Child class called ");
		System.out.println("Category : "+this.category);
		System.out.println("Sound : "+this.sound);
		System.out.println("-----------------");
		
	}
}
