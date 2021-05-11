package com.regunta;

import java.util.Arrays;

//Array programming questions
//How do you find a missing number in an array of 1-100?
//How do you reverse an array in place in Java?
//Can you find duplicate numbers in an array?
//Can you remove duplicates from an array?
//How do you convert a byte array into a string?

public class ArrayProgrammingQuestions {
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 5, 7};
		System.out.println(max(array));
		//System.out.println(min(array));
		System.out.println(reverse(array));
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
	
//	public static int max(int[] arrs) {
//		if(arrs.length == 0) {
//			throw new IllegalArgumentException();
//		}
//		
//		int max = arrs[0];
//		for (int i : arrs) {
//			if(i > max) max = i;
//		}
//		
//		return max;
//	}
	
//	public static int min(int[] arrs) {
//		if(arrs == null || arrs.length == 0) {
//			throw new IllegalArgumentException();
//		}
//		
//		int min = arrs[0];
//		for (int i : arrs) {
//			if(i < min) min = i;
//		}
//		
//		return min;
//	}
	
	public static int[] reverse(int[] arrs) {
		if(arrs == null || arrs.length == 0) {
			throw new IllegalArgumentException();
		}
		
		int l = arrs.length;
		
		for (int i = 0; i < l/2; i++) {
			arrs[i] = arrs[i] + arrs[l-i-1];
			arrs[l-i-1] = arrs[i] - arrs[l-i-1];
			arrs[i] = arrs[i] - arrs[l-i-1];
		}
		
		return arrs;
	}
	
	/**
	 * []
	 * [1]
	 * 
	 * @param arrs
	 * @return
	 */
	public static int maxr(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("....");
		}
		
		if(arr.length == 1) return arr[0];
		else return 1;//TODO:...
	}
	
	/**
	 * 
	 *  [1, 4, 2, 6]
	 *  [3, 5]
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] missingElements(int[] arr) {
		int max = max(arr);
		int missingCount = arr.length - max;
		
		int[] array = new int[max];
		for (int i : array) {
			array[i - 1] = i;
		}
		
		int[] missingElementsArr = new int[missingCount];
		
		return null;
	}

	private static int max(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException("max can not be computed on an empty array");
		}
		
		int max = arr[0];
		for (int i : arr) {
			if(max < i) max = i;
		}
		return max;
	}
}
