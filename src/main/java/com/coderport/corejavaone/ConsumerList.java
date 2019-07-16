package com.coderlovin.corejavaone;

import java.util.ArrayList;
import java.util.List;

public class ConsumerList {
	
	public static void main(String[] args) {
		
		// We can store/write anything to integerList, that is Integer or 
		// something Integer can be upcast to (e.g. Integer cab be upcast to Integer,
		// Integer can be upcast to Number, Integer can be upcast to Object etc.)
		List<? super Integer> integerList;
		
		System.out.println("Scenario: Storing Number in List<? super Integer>");
		List<Number> numberList = new ArrayList<Number>();
		Number n1 = 12.8;
		Number n2 = 15;
		numberList.add(n1);
		numberList.add(n2);
		
		// Point List<? super Integer> to List<Number>
		// It is possible because Integer can be upcast to Number
		integerList = numberList;
		
		for (Object n : integerList) {
			if (n instanceof Integer) {
				System.out.println("Integer: " + n);
			} else if (n instanceof Number) {
				System.out.println("Number: " + n);
			}
		}		
		
		System.out.println("\nScenario: Storing Integer in List<? super Integer>");
		List<Integer> iList = new ArrayList<Integer>();
		Integer i1 = 10;
		Integer i2 = 55;
		iList.add(i1);
		iList.add(i2);
		
		// Point List<? super Integer> to List<Integer>
		// It is possible because Integer can be upcast to Integer
		integerList = iList; 
		
		for (Object n : integerList) {
			if (n instanceof Integer) {
				System.out.println("Integer: " + n);
			}
		}
		
		System.out.println("\nScenario: Storing Object in List<? super Integer>");
		List<Object> ojectList = new ArrayList<Object>();
		Object o = 20.24;
		ojectList.add(o);
		
		// Point List<? super Integer> to List<Object>
		// It is possible because Integer can be upcast to Object
		integerList = ojectList;  
		
		for (Object n : integerList) {
			if (n instanceof Object) {
				System.out.println("Object: " + n);
			}
		}

	}
}
