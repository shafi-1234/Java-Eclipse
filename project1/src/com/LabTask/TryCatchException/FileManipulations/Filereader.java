package com.LabTask.TryCatchException.FileManipulations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f1 = new File("F:\\Vcube Java FileCreations\\Second.txt");
		
		FileReader f2 = new FileReader(f1);
		
		int i=f2.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=f2.read();
			Thread.sleep(250);
		}	

	}

}
