package com.oops.Inheritance;

public class PersonalLoan extends BankLoanTamplet {
	
	// The Rate Of Interset of personal loan is different From Another Loan Roi
		// so we override and change the change the roi
		
	@Override // override from interface
	public double getLoanROI() {
		double roi=8.0;
		int cibil=getCibilScore();
		if(cibil>=300 && cibil<=549) {
			System.out.println("(Poor / Very Poor): Lenders view you as high risk; loan or credit card approval is very unlikely.");
			roi=roi+4.0;
		}
		else if(cibil>=550 && cibil<=649) {
			System.out.println("(Average / Fair): Approval is difficult, and lenders may charge higher interest rates.");
			roi=roi+3.0;
		}
		else if(cibil>=650 && cibil<=749) {
			System.out.println("(Good): Shows fair-to-good credit health; most standard loan applications get approved.");
			roi=roi+2.0;
		}
		else if(cibil>=750 && cibil<=900) {
			System.out.println("(Excellent): Reflects strong financial discipline; you get faster approvals, higher credit limits, and the best interest rates");
			roi=roi+1.5;
		}
		else {
			System.out.println("You cibil Score is Invalid But Our Bank Give loan with Higher Intrest Rate ");
			roi=roi+7.0;
		}
		return roi;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to PErsonal Loan Application !! ");
		System.out.println("Please Enter Your Basic Details : ");
		PersonalLoan p= new PersonalLoan();
		int age=p.getCustomerAge();
		double salary=p.getCustomerSalary();
		int cibil=p.getCibilScore();
		if(age>=26 && salary>=900000 && (cibil>=300 && cibil<=900)) {
			System.out.println("Your Information is meet our Requirments!! Lets Discuss");
			System.out.println("Give More Details");
			if(p.isPhoneValid() && p.isAdharValid() && p.isPanValid()) {
				System.out.println("All Good You Are Eligibile For Loan ");
				System.out.println("Your Rate Of Intrest Details : "+p.getLoanROI());
			}else {
				System.out.println("Somethig Wrong In Details");
			}
			
		}else {
			System.out.println("Your Are Not Eligible");
		}
	}

}
