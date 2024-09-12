package com.shallowCopyObject;

//Shallow Copy pass the Reference to new reference .
//So, Any changes made by new object reference variable will be reflect on main Object value.
// It is fast because it does not create new memory. It just pass the reference to other object reference. 

public class ShallowCopy implements Cloneable{
	String name;
	int no;
	int[] arr;
	
	public ShallowCopy(String name, int no) {
		this.name = name;
		this.no = no;
		arr = new int[] {1,2,3,4,5,6};
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
