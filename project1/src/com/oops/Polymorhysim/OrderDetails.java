
package com.oops.Polymorhysim;

class PizzaOrder extends OrderDetails {

	public PizzaOrder(int orderid, String customerName, double price) {
		super(orderid, customerName, price);
	}
	public void prepareFood() {
		System.out.println("Pizaa Preaparing Food ....");
	}
	
	
}
class BurgerOrder extends OrderDetails {
	public BurgerOrder(int orderid,String customerName,double price) {
		super(orderid,customerName,price);
	}
	
	public void prepareFood() {
		System.out.println("Burger Preaparing Food ....");
	}
	
}

public class OrderDetails implements FoodOrder {
	int orderid;
	String customerName;
	double price;
	
	public OrderDetails(int orderid,String customerName,double price) {
		this.price=price;
		this.customerName=customerName;
		this.orderid=orderid;
	}
	
	public void prepareFood() {
		System.out.println("Preaparing Food ....");
	}
	void display() {
		System.out.println("Order ID : "+orderid);
		System.out.println("Customer Name : "+customerName);
		System.out.println("Order Price : "+price);
	}

	public static void main(String[] args) {
		
		OrderDetails od= new PizzaOrder(123,"Shafi",120);
		od.prepareFood();
		od.display();
		OrderDetails BO= new BurgerOrder(12345,"Shaik Shafi",8120);
		BO.prepareFood();
		BO.display();

	}

}
