package com.oops.Inheritance.CopyClone;
class Student1{
	int sid;
	String sname;
	Address1 address1;
	
	public Student1(int sid, String sname, Address1 address1) {
		this.sid = sid;
		this.sname = sname;
		this.address1 = address1;
	}
	
	// Copy Constructer
	public Student1(Student1 s1) {
		this.sid=s1.sid;
		this.sname=s1.sname;
		this.address1=new Address1(s1.address1);
		
	}
}


class Address1{
	
	String city;
	
	public Address1(String city) {
		this.city=city;
	}
	// copy constructer
	public Address1(Address1 address1) {
		this.city=address1.city;
	}
	
}
public class DeepCopy {
	public static void main(String args[]) {
		
		// Creating a object for Address first becuse it initilized in student
		
		Address1 address1= new Address1("Kurnool");
		// Now Creating Second Object
		
		Student1 s= new Student1(1,"Shafi",address1);
		
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.address1.city);
		System.out.println("-----------------------------");
		
		// For Deep copy we use copy constructort
		
		Student1 s1= new Student1(s);
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address1.city);
		System.out.println("--------------------------------");
		System.out.println("***********************************");
		
		// Edge case 
		s1.address1.city="Hyderabad";
		
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println(s.address1.city);
		System.out.println("-----------------------------");
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address1.city);
		System.out.println("-----------------------------");
		// In OutPut  You can see That Internal object is not Changed when New Object is Changhed
	}

}
