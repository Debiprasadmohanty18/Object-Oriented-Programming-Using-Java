package com.singleton;

public class MainSingleton {
	public static void main(String[] args) 
	{
		Singleton ob1 = Singleton.getObject();		
		
		Singleton ob2 = Singleton.getObject();
		
		Singleton ob3 = Singleton.getObject();
		
		
		// All these reference variable will refer to that one object or instance.
	}
}
