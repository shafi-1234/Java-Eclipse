package com.LabTask;

public class productconstructor {
	String productName;
	double price;
	int quantity;
	double totalPrice;
	
	productconstructor(){
		this("Laptop");
	}
	productconstructor(String productName){
		this(productName,55000.0);
		
	}
	productconstructor(String productName,double price){
		this(productName,price,2);
		
	}
	productconstructor(String productName,double price,int quantity){
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
		double r=(price*quantity);
		this.totalPrice=r;
		//System.out.println("Total  cost : "+totalPrice);
		
		
	}
	
	

	public static void main(String[] args) {
		productconstructor p1 = new productconstructor();
		
		p1.show();
		

	}
	void show() {
		System.out.println("Enter Product : "+productName);
		System.out.println("Enter Price : "+price);
		System.out.println("Enter Quantity : "+quantity);
//		double totalPrice=price*quantity;
		System.out.println("Total  cost : "+totalPrice);
	}

}
