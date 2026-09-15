package com.oops.Inheritance.CopyClone;


class student implements Cloneable{
	int sid;
	String sname;
	Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	public student(int sid,String sname,Address address) {
		this.sid=sid;
		this.sname=sname;
		this.address=address;	
	}
	
}

class Address{
	String city;
	
	
	public Address(String city) {
		this.city=city;
	}
	
}
public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main Method Started");
		// First we have to create address object because address object is used in Student classs
		// First  Object Details
		System.out.println("First Object Details");
		Address address= new Address("Kurnool");
		System.out.println(address.city);
		
		
		// Then We have to create Student Object
		System.out.println("Second Object Details");
		student s= new student(1,"Shafi",address);
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.address.city);
		System.out.println("------------------------------");
		
		// For Copying Student data into another Object We use clone methiod
		System.out.println("Copying Student data to another Student");
		student s1=(student) s.clone();
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("-------------------------");
		System.out.println("***********************************");
		
		
		// DrawBack: Shallow copy does not create a copy of the internal object; it shares the same reference
		// Internal Object address.city is internal object , 
		// When address change in new Object(i.e, s1)  where the internal object of old object(i.e, s) is also change
		// To over Come We use Deep Copy
		s1.sname="Rafi";
		s1.address.city="Banglore";
		
	
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.address.city);
		System.out.println("------------------------------");
		
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("-------------------------");
		
		System.out.println("Main Method Ended");
		

	}

}
