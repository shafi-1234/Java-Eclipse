package com.FileIO.SerializationDeSerialization;

//Serialization : Serialization is Mechanism used for converting the java object into ByteStrem(File)

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	 String userName="Shafi";
//	 transient String password="Shafi@123";
//	 If We Use Transient it gives the default values of data types,because it hide the Data
	 String password="Shafi@123";
	 String s="123";
	 
}
public class Serialization {

	public static void main(String[] args) throws IOException {
		Employee e=new Employee();
		File f = new File("F:\\VcubeFileIO\\Serialization\\input.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(e);

		System.out.println("Main Method Ended");
	}

}
