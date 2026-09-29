package com.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filewriter {

	public static void main(String[] args) throws IOException {
		File f = new File("F:\\Vcube Java FileCreations\\Second.txt");
		FileWriter f1=new FileWriter(f);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Data : ");
		String data=sc.nextLine();
		f1.write(data);
		f1.close();
		sc.close();
		System.out.println("Data Added Successfully!!");
		
	}

}
