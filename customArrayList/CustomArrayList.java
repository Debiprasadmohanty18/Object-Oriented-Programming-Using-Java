package com.customArrayList;

import java.util.Arrays;

public class CustomArrayList {
	
	private int[] arr;
	private static int DEFAULT_VALUE = 5;
	int size = 0;

	public CustomArrayList() 
	{
		this.arr = new int[DEFAULT_VALUE];
	}

	public int add(int num)
	{
		if(isFull())
		{
			resizeArr();
		}
		arr[size] = num;
		size++;
		return num;
//		System.out.println(num + " Added");
//		System.out.println("Length :- " + size);
	}
	
	private void resizeArr() 
	{
		int[] temp = new int[arr.length*2];
		
		for (int i=0;i<arr.length;i++) 
		{
			temp[i] = arr[i];
		}
		arr = temp;
	}

	private boolean isFull()
	{
		return size == arr.length;
	}
	
	public int remove()
	{
		if(isEmpty())
		{
			System.out.println("Empty ArrayList.");
		}
		size--;
		return arr[size];
//		System.out.println(size);
	}
	
	
	private boolean isEmpty() 
	{
		return size == 0;
	}
	
	public int get(int index)
	{
		return arr[index];
	}
	
	public int size()
	{
		return size;
	}
	
	public void set(int index , int value)
	{
		arr[index] = value;
	}
	
	
	
	@Override
	public String toString() 
	{
		return "arr=" + Arrays.toString(arr) + ", size=" + size;
	}

	public static void main(String[] args) {
		CustomArrayList list = new CustomArrayList();
		list.add(5);
		list.add(7);
		list.add(8);
		list.remove();
		list.add(10);
		list.add(18);
		list.add(98);
		list.add(90);
		list.get(2);
		list.size();
		
		System.out.println(list);
	}
}

/*
   Dis-Advantage we face in this type is :- 
  					By default we can take only integer value to perform every operation of ArrayList.
    
*/