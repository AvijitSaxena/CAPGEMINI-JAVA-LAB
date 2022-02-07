package com.xyz;


class A{}
class B extends A{}

public class InstanceOfDemo {
	public static void main(String[] args)
	{
		B objOfClassB = new B();
		
		System.out.println("objOfClassB is an instance of B: " + (objOfClassB));
		System.out.println("objOfClassB is an instance of the parent class A: " + (objOfClassB));	
	}


}
