package com.xyz;

//program to demonstrate importing of file//////


import java.io.File;


public class Exception3 {
	  public static void main(String[] args) {

		    File file = new File("avijit.txt");

		    try {
		boolean value = file.createNewFile();
		      if (value) {
		System.out.println("The new file is created.");
		      }
		      else {
		System.out.println("The file already exists.");
		      }
		    }
		    catch(Exception e) {
		e.getStackTrace();
		    }
		  }


}
