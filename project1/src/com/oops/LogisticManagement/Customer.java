package com.oops.LogisticManagement;

public class Customer {
	private int cid;
	private String cname;
	private String phnnum;
	
	public Customer(int cid,String cname,String phnnum) {
		this.cid=cid;
		this.cname=cname;
		this.phnnum=phnnum;
		
	}
	
	public int getCustomerId() {
		
		return cid;
	}
	
	public String getCustomerName() {
		return cname;
	}
	
	public String getPhoneNumber() {
		return phnnum;
	}
	

	public void displaycustomer() {
		System.out.println("Customer ID : "+cid);
		System.out.println("Customer Name : "+cname);
		System.out.println("Customer Phone Number : "+phnnum);
	}

}
