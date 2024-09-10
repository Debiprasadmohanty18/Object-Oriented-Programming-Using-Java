/*
 To Overcome the problem we faced in ArrayList We need to create the new Custom ArrayList using Java-Generics.
 
 GENERICS :- 
 
 --> Java-Generics means parameterized types. 
 --> The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics.
 --> It is possible to create classes that work with different data types. 
 
*/

package com.javaWildCards;

import java.util.Arrays;

public class WildCard<E> {
	
	private Object[] arr;
	private static int DEFAULT_VALUE = 5;
	int size = 0;

	public WildCard() 
	{
		this.arr = new Object[DEFAULT_VALUE];
	}

	public void add(E num)
	{
		if(isFull())
		{
			resizeArr();
		}
		arr[size] = num;
		size++;
//		System.out.println(num + " Added");
//		System.out.println("Length :- " + size);
	}
	
	private void resizeArr() 
	{
		Object[] temp = new Object[arr.length*2];
		
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
	
	public E remove()
	{
		if(isEmpty())
		{
			System.out.println("Empty ArrayList.");
		}
		size--;
		return (E) (arr[size]);
//		System.out.println(size);
	}
	
	
	private boolean isEmpty() 
	{
		return size == 0;
	}
	
	public E get(int index)
	{
		return (E)(arr[index]);
	}
	
	public int size()
	{
		return size;
	}
	
	public void set(int index , E value)
	{
		arr[index] = value;
	}
	
	
	
	@Override
	public String toString() 
	{
		return "arr=" + Arrays.toString(arr) + ", size=" + size;
	}

	public static void main(String[] args) {
		WildCard<Integer> list = new WildCard<>();
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
