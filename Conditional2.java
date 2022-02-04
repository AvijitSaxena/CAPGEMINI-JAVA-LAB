package com.xyz;

public class Conditional2 {
	public static void main(String[] args) {

	    int a=5;
	    int b=6;
	    int c=4;
	    if(a>b && a>c) {
	System.out.println("a is greatest");
	    }

	    else if (b>a && b>c) {
	System.out.println("b is greatest");
	    }
	    
	    else if (c<a && c>b) {
	System.out.println("The number is 0.");
	    }

	    // if both condition is false
	    else {
	System.out.println("All are equal");
	    }
	  }


}
