import java.util.Scanner;

public class neonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch;
		do {
		System.out.println("Enter A Number : ");
		int n =sc.nextInt();
		int ans=n*n;
		System.out.println(n+"^2 : "+ans);
		int sum=0;
		int temp = 0;
		while(ans>0) {
			temp=ans%10;
			sum+=temp;
			ans/=10;	
		}
		if(sum==n) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not Neaon number");
		}
		System.out.println("Do You Wnat To continue : (Yes/No) : ");
		ch=sc.next();
		}while(ch.equalsIgnoreCase("yes"));
	

	}

}
