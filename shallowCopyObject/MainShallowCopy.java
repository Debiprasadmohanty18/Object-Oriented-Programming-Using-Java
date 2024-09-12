package com.shallowCopyObject;

import java.util.Arrays;

public class MainShallowCopy {

	public static void main(String[] args) {
		ShallowCopy obj1 = new ShallowCopy("Virat", 18);
		
		System.out.println("Without Clone Method :- ");
		System.out.println(Arrays.toString(obj1.arr));
		//Without clone method.
		ShallowCopy obj2 = obj1;
		obj2.arr[1] = 50;
		System.out.println(Arrays.toString(obj2.arr));
		System.out.println(Arrays.toString(obj1.arr));
		
		//With Clone Method..
		System.out.println("With Clone Method :- ");
		try {
			ShallowCopy obj = (ShallowCopy)obj1.clone();
			System.out.println(Arrays.toString(obj1.arr));
			obj.arr[4] = 100;
			obj.no = 5;
			System.out.println(Arrays.toString(obj.arr) + " : " + obj.no);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
