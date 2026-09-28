package com.constructorsTopic;

public class MovieCopyConstructor {
	String director;
	String hero;
	String producer;
	String name;
	String heroine;
	double budget;
	MovieCopyConstructor(){//for obj1;
		System.out.println("No Arg Constructer Called");
	}
	MovieCopyConstructor(String director){//for obj1;
		this.director=director;
	}
	MovieCopyConstructor(MovieCopyConstructor m1,String producer,String hero ){//for obj1;
		this.director=m1.director;
		this.producer=producer;
		this.hero=hero;
	}
	MovieCopyConstructor(MovieCopyConstructor m1,String heroine,double budget ){//for obj1;
		this.director=m1.director;
		this.producer=m1.producer;
		this.hero=m1.hero;
		this.heroine=heroine;
		this.budget=budget;
	}
	MovieCopyConstructor(MovieCopyConstructor m1,String name ){//for obj1;
		this.director=m1.director;
		this.producer=m1.producer;
		this.hero=m1.hero;
		this.heroine=m1.heroine;
		this.budget=m1.budget;
		this.name = name;
		
	}
	
	
	public static void main(String[] args) {
		
		MovieCopyConstructor m= new MovieCopyConstructor();
		m.movieInfo();
		MovieCopyConstructor m1= new MovieCopyConstructor("S S RAJA MOULI");
		m1.movieInfo();
		
		
		MovieCopyConstructor m2= new MovieCopyConstructor(m1,"D V V","Mahesh Babu");
		m2.movieInfo();
		
		
		MovieCopyConstructor m3= new MovieCopyConstructor(m2,"Priyanaka Chopra",3000000000.0);
		m3.movieInfo();
		
		
		MovieCopyConstructor m4= new MovieCopyConstructor(m3, "VARANASI");
		m4.movieInfo();
		

	}
	void movieInfo() {
		System.out.println("-------------------------");
		System.out.println("Director : "+director);
		System.out.println("Hero : "+hero);
		System.out.println("producer : "+producer);
		System.out.println("Name of Movie : "+name);
		System.out.println("Heroine : "+heroine);
		System.out.println("Budget Of Map : "+budget);
		System.out.println("Name of Movie : "+name);
 
		System.out.println("-------------------------");

	}

}
