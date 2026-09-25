package com.oopsEncapsulation;

import java.util.Scanner;

public class ShoppingCartEn {
	private int cartItems ;
	private double totalAmount;
	
	Scanner sc = new Scanner(System.in);
	
	public ShoppingCartEn(int cartItems,double totalAmount) {
		this.totalAmount=totalAmount;
		this.cartItems=cartItems;
		
	}
	
	//Setter
	public void setcartItems() {
		this.cartItems=cartItems;
	}
	public void settotalAmount() {
		this.totalAmount=totalAmount;
	}
	
	//Getter
	public int getcartItems() {
		return cartItems;
	}
	
	public double totalAmount() {
		return totalAmount;
	}

	
	public void addItem() {
		System.out.println("Enter Amount Of The Item : ");
		 double amount =sc.nextDouble();
		cartItems+=1;
		totalAmount+=amount;
	}
	public void removeItem() {
		System.out.println("Enter Amount Of The item To Remove : ");
		double amount =sc.nextDouble();
		cartItems+=1;
		totalAmount-=amount;	
	}
	
	public double getTotal() {
		return totalAmount;
	}
	
}
