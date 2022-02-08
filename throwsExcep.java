package com.xyz;

//program to explain the working of Throws



public class throwsExcep {
	static void func() throws IllegalAccessException
	{
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException("avijit");
	}
	public static void main(String args[])
	{
		try
		{
			func();
		}
		catch(IllegalAccessException e)
		{
			System.out.println("caught in main.");
		}
	}


}
