package com.xyz;

//variation with finally

public class Exception2 {
	  public static void main(String[] args) {
		    try {
		      
		      int div = 8 / 0;
		    }

		    catch (ArithmeticException e) {
		System.out.println("ArithmeticException => " + e.getMessage());
		    }

		    finally {
		System.out.println("This is the finally block");
		    }
		  }


}
