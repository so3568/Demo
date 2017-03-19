package com.test.javaapi;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadDemo {

	private static final String FILE_NAME = "C:\\Java Practice\\Demo1\\src\\com\\test\\javaapi\\ExampleFile";

	public static void main(String[] args) throws Exception {

		FileReader fileReader = new FileReader(FILE_NAME);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		
		String currentLine;
		 while((currentLine=bufferedReader.readLine()) != null){

				System.out.println(currentLine);
				 
		 }
	}

}
