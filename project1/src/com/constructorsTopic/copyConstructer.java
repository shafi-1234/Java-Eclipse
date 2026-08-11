package com.constructorsTopic;

public class copyConstructer {
	String name;
	int id;
	String instute;
	String area;
	
	public copyConstructer() {
		
	}
	public copyConstructer(copyConstructer p1) {
		this.name=p1.name;
		this.id=p1.id;
		this.instute=p1.instute;
		this.area=p1.area;
		
	}
	

	public static void main(String[] args) {
		copyConstructer p1 = new copyConstructer();
		p1.name="Shafi";
		p1.id=123;
		p1.instute="Vcube";
		p1.area="Kphb";
		System.out.println(p1);

		p1.show();
		
		copyConstructer p2 = new copyConstructer(p1);
		System.out.println(p2);
		p2.show();

	}
	void show() {
		System.out.println("---------------------");
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		System.out.println("Instute : "+instute);
		System.out.println("Area : "+area);
		System.out.println("---------------------");
		
	}

}
