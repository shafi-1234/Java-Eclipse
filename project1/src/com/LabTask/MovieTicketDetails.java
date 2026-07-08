package com.LabTask;

public class MovieTicketDetails {
	int  TicketID;
	int ScreenNumber;
	float TicketPrice;
	boolean OnlineBookingStatus;
	int ViewerAge;
	int NumberofTickets;
	long ContactNumber;
	float GSTAmount;
	public static void main(String[] args) {
		
		MovieTicketDetails p1 = new MovieTicketDetails();
		p1.TicketID=123;
		p1.ScreenNumber=5;
		p1.TicketPrice=250;
		p1.OnlineBookingStatus=true;
		p1.ViewerAge=21;
		p1.NumberofTickets=3;
		p1.ContactNumber=949430403;
		p1.GSTAmount=18;
		
		p1.display();


	}
	void display() {
		System.out.println("Ticket ID : "+TicketID);
		System.out.println("Screen Number: "+ScreenNumber);
		System.out.println("Ticket Price : "+TicketPrice+"Rs");
		System.out.println("Ticket Confirmed  : "+OnlineBookingStatus);
		System.out.println("Viewer Age : "+ViewerAge);
		System.out.println("Contact Number : "+ContactNumber);
		System.out.println("GST Amount : "+GSTAmount+"Rs");
		System.out.println("Total Amount : "+(TicketPrice+GSTAmount)+"Rs");
		
		
		
	}

}
