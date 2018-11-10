package org.practice.generics;

import java.util.Arrays;

public class TestGenerics {
	
	public static void main(String[] args) {
		
		Integer[] intArr = {1, 2, 3, 4, 5};
		
		String strArray[] = {"abc", "def", "ijk", "lmn", "op"};
		
		intArr = retArray(intArr);
		strArray = retArray(strArray);
		
		printArray(intArr);
		printArray(strArray);
		
		
	}
	
	private static <E> void printArray(E[] array){
		Arrays.asList(array).stream().forEach(e-> System.out.print(e+ " "));
		System.out.println("");
	}
	
	private static <E, T> E[] retArray(E[] array){
		
		return array;
	}

}
