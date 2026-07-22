package com.LabTask;

public class Product {
	int productId;
	String productName;
	int price;
	
//	
	Product(){
		System.out.println("No arg constructor called");
	}
	
	Product(int productId,String productName,int price){
		System.out.println("Constructor Called");
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		
	}

	 void main(String[] args) {
		System.out.println("Main method started");
		Product p1= new Product( 1, "pen", 10);
		p1.show();
		Product p2= new Product( 2, "pencil", 5);
		p2.show();
		Product p3= new Product( 3, "pen pencil", 15);
		p3.show();
		
		
		
	}
	void show() {
		System.out.println("product ID : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Product Price : "+price);
		
	}

}
