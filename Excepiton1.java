package com.xyz;

//Program to demonstrate working of arithmetic exception

public class Excepiton1 {
	public static void main(String[] args) {

	    try {
	      int div = 10/ 0;
	System.out.println("Rest of code in try block");
	    }

	    catch (ArithmeticException e) {
	System.out.println("ArithmeticException => " + e.getMessage());
	    }
	  }


}
