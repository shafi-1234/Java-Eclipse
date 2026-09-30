package com.FileIO;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException  {
		File f =new File("F:\\Vcube Java FileCreations\\Second.txt");
		boolean status = f.createNewFile();
		
		if(status) {
			System.out.println("File Created SuccessFully");
		}else {
			System.out.println("Something Went Wrong !!");
		}
		
	}

}
