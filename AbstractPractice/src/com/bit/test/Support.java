package com.bit.test;

public class Support extends Demo 
{

	@Override
	public void m2() 
	{
	 System.out.println("hi2");
		
	}
	Support()
	{
		super();//you can call
		System.out.println("constractor");
	}

	@Override
	public void m3() 
	{
	 System.out.println("hi3");	
		
	}
   //Demo x= new Demo();abstract class cannot create an object but only can extend.
}
