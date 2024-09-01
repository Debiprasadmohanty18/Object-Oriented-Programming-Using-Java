package com.singleton;


//Singleton is a class in which only one instance or object can be created.
public class Singleton {

	private Singleton() 
	{
		
	}
	
	private static Singleton object;
	
	public static Singleton getObject()
	{
		// Here it will check Whether the object is created or not.
		if(object == null)
		{
			object = new Singleton();
		}
		return object;
	}
	
}
