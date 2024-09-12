package com.deepCopy;

import java.util.Arrays;

public class MainDeepCopy {
	public static void main(String[] args) {
		DeepCopy obj = new DeepCopy("Virat", 18);
		
		System.out.println(Arrays.toString(obj.arr));
		try {
			DeepCopy copy = (DeepCopy)obj.clone();
//			So here We tried to change the value of existing array but it created a new object of array instead of replace the value.
			copy.arr[0] = 45;
			System.out.println(Arrays.toString(copy.arr));
			System.out.println(Arrays.toString(obj.arr));
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
