package com.codelovin.corejavaone;

import java.util.ArrayList;
import java.util.List;

public class ProducerList {

	//***************************************************************************************
	// Before understanding the code of this class, you should understand the below facts.
	// 
	// The class java.lang.Number extends java.lang.Object class
	// 
	// The class java.lang.Number has below direct known subclasses:
	// 		- java.util.concurrent.atomic.AtomicInteger
	// 		- java.util.concurrent.atomic.AtomicLong
	// 		- java.math.BigDecimal
	// 		- java.math.BigInteger
	// 		- java.lang.Byte
	// 		- java.lang.Double
	// 		- java.lang.Float
	// 		- java.lang.Integer
	// 		- java.lang.Long
	// 		- java.lang.Short
	//
	// Theory: 
	// When you cast one object to a super-type, it is called Upcasting. 
	// Upcasting is always allowed.
	//
	// When you cast one object to a sub-type, it is called Downcasting. 
	// Downcasting involves a type check and can throw a ClassCastException if
	// downcasting is not possible.
	//
	//************************************************************************************

	
	/*
	 * "List<? extends Number>" means you can pass following type of List objects as parameter:
	 * 	 	- List<AtomicInteger>
	 * 	 	- List<AtomicLong>
	 * 	 	- List<BigDecimal>
	 * 	 	- List<BigInteger>
	 * 	 	- List<Byte>
	 * 	 	- List<Byte>
	 * 		- List<Double>
	 * 		- List<Float>
	 * 		- List<Integer>
	 * 		- List<Long>
	 * 		- List<Short>
	 * 
	 */
	public static void printNumbers(List<? extends Number> numberList) {
		
		// We can read anything from numberList, that is Number or 
		// that can be upcast to Number (e.g. Number cab be upcast to Number,
		// AtomicInteger can be upcast to Number, Integer can be upcast to Number etc.
		for (Number n : numberList) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Printing list that contains Number objects...");
		List<Number> numberList = new ArrayList<Number>();
		Number n1 = 12.8;
		Number n2 = 15;
		numberList.add(n1);
		numberList.add(n2);
		printNumbers(numberList);
		
		System.out.println("\nPrinting list that contains Integer objects...");
		List<Integer> integerList = new ArrayList<Integer>();
		Integer i1 = 10;
		Integer i2 = 55;
		integerList.add(i1);
		integerList.add(i2);
		printNumbers(integerList);
		
		System.out.println("\nPrinting list that contains Double objects...");
		List<Double> doubleList = new ArrayList<Double>();
		Double d1 = 20.24;
		Double d2 = 67.5;;
		doubleList.add(d1);
		doubleList.add(d2);
		printNumbers(doubleList);
	}
}
