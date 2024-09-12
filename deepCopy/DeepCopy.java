package com.deepCopy;
// Deep Copy creates new object to store value.
// So, any change made in original object value, it does not reflect on original object value.
// It is slow because, To do operation it creates new object.

public class DeepCopy implements Cloneable{
	String name;
	int no;
	int[] arr;
	
	public DeepCopy(String name, int no) 
	{
		this.name = name;
		this.no = no;
		this.arr = new int[] {1,2,3,4,5}; 
	}
	
	public Object clone() throws CloneNotSupportedException 
	{
		DeepCopy copy = (DeepCopy)super.clone(); // It is a Shallow Copy.
		
		//Make a Deep Copy now.
		copy.arr = new int[copy.arr.length];
		
//		System.arraycopy(this.arr, 0, copy.arr, 0, copy.arr.length); // It is enhance type of copying object.
		
		//We can use for loop to copy as well
		for (int i=0; i<copy.arr.length;i++) 
		{
			copy.arr[i] = this.arr[i];
		}
		return copy;
		
	}
	
	
}
