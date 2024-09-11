/*  What is Java WildCards ?
 Answer :- The Question Mark (?) in java called Wild Card. 
 --> it is a unknown type used to give the restriction to parameter.
 
 syntax:- (? extends Number)
 
  In this we cann't take string parameter.It will only take Number type and it's sub type.
 	
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
