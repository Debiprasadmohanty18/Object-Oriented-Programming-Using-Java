package com.finalizer;

class Student {
	String name;
	Student(String name)
	{
		this.name = name;
	}
	
	protected void finalize() throws Throwable 
	{
		System.out.println("Object Destroyed");
	}
}
public class FinalizeMethodWorking {

	public static void main(String[] args) {
		Student obj;
		for(int i=0;i<10000000;i++)
		{
			obj = new Student("Dhoni");
		}
	}

}
