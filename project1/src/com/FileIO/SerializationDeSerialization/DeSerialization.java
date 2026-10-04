package com.FileIO.SerializationDeSerialization;

import java.io.*;
public class DeSerialization {
	//DeSerialization : DeSerialization is Mechanism used for converting the ByteStrem(File) into java object 

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f = new File("F:\\VcubeFileIO\\Serialization\\input.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e= (Employee)ois.readObject();
		
		System.out.println(e.userName);
		System.out.println(e.password);

	}

}
