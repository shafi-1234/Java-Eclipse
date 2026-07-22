import java.util.*;
import java.math.*;

public class Areas {

	
	
	double AreaRectangle(double length,double breadth) {
		double area=length*breadth;
		return area;
	}
	
	double Areatriangle(double base , double height) {
		double areaTri=0.5*(base*height);
		return areaTri;
	}
	
	int AreaSquare(float side) {
		double areaSquare=side*side;
		return (int) areaSquare;
	}
	
	double AreaCircle(double radius) { 
		double areaCircle=Math.PI*radius*radius;
		return areaCircle;
	}
	void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("--------------Area of Rectangle-----------------");
		System.out.println("Enter The Length of rectangle : ");
		double l=sc.nextDouble();
		System.out.println("Enter The Breadth of rectangle : ");
		double b=sc.nextDouble();
		double Arc=AreaRectangle(l,b);
		System.out.println("Area of Rectangle : "+Arc);
		System.out.println("------------------------------------------------");
		
		
		System.out.println("--------------Area of Triangle-----------------");
		System.out.println("Enter The Base of Triangle : ");
		double base=sc.nextDouble();
		System.out.println("Enter The Height of Triangle : ");
		double h=sc.nextDouble();
		double ArT=Areatriangle(base,h);
		System.out.println("Area of Triangle : "+ArT);
		System.out.println("------------------------------------------------");
		
		
		System.out.println("--------------Area of Square-----------------");
		System.out.println("Enter The Side of Square : ");
		float s=sc.nextFloat();
		double Ars=AreaSquare(s);
		System.out.println("Area of Circle : "+Ars);
		System.out.println("------------------------------------------------");
		
		System.out.println("--------------Area of Circle-----------------");
		System.out.println("Enter The Radius of circle : ");
		double r=sc.nextDouble();
		double Arcircle=AreaCircle(r);
		System.out.println("Area of Circle : "+Arcircle);
		System.out.println("------------------------------------------------");


	}

}
