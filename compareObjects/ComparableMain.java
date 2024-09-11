package com.compareObjects;

import java.util.Arrays;

public class ComparableMain {

	public static void main(String[] args) 
	{
		ComparableConcept papu = new ComparableConcept(27, 72);
		ComparableConcept debi = new ComparableConcept(15, 83);
		ComparableConcept rama = new ComparableConcept(52, 78);
		ComparableConcept sonu = new ComparableConcept(37, 63);
		ComparableConcept raku = new ComparableConcept(9, 59);
		ComparableConcept papu2 = new ComparableConcept(27, 72);
		
		ComparableConcept[] list = {papu,debi,rama,sonu,raku,papu2};
		
		System.out.println(Arrays.toString(list));
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		
		
//		if(sonu.compareTo(rama) == 0)
//		{
//			System.out.println("Results Are Same.");
//		}
//		else if (sonu.compareTo(rama) < 0) 
//		{			
//			System.out.println("rama is Greater.");
//		}
//		else
//		{
//			System.out.println("sonu is Greater.");
//		}

	}

}
