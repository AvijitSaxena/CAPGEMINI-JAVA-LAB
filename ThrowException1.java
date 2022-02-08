package com.xyz;

//program to explain use of throw

public class ThrowException1 {
	static void func()
	{
		try
		{
			throw new NullPointerException("avijit");
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught inside fun().");
			throw e; 
		}
	}
	public static void main(String args[])
	{
		try
		{
			func();
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught in main.");
		}
	}

	

}
