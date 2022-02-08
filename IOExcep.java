package com.xyz;

import java.io.*;

public class IOExcep {
	public static void findFile() throws IOException {

	    File newFile = new File("avijit.txt");                       //we may expect an exception here
	FileInputStream stream = new FileInputStream(newFile);
	  }

	  public static void main(String[] args) {
	    try {
	findFile();
	    }
	    catch (IOException e) {
	System.out.println(e);
	    }
	  }


}
