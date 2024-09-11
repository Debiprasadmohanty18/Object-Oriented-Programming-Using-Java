package com.lambdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;


interface Calculator {
	int operation(int a, int b);
}

public class LambdaExpression {
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) 
		{
			list.add(i * 2);
		}
		
//		System.out.println(list);
		
//		list.forEach((item)-> System.out.println(item));
		
//		forEach internally works like :-
		Consumer<Integer> list2 = (item)-> System.out.print(item + " ");
		list.forEach(list2);
		
		
		System.out.println();
		
		
		Calculator sum = (a,b) -> a+b;
		Calculator sub = (a,b) -> a-b;
		Calculator product = (a,b) -> a*b;
		
		LambdaExpression calc = new LambdaExpression();
		System.out.println(calc.operate(8, 2, product));
		System.out.println(calc.operate(8, 2, sum));
		System.out.println(calc.operate(8, 2, sub));
	}
	
	
	private int operate(int a, int b, Calculator op)
	{
		return op.operation(a,b);
	}
}

