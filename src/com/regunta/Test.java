package com.regunta;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		String[] strs = {"a", "b", "c", "a", "b", "a"};
		secondMostRepeatedStr(strs);
	}
	
	public static String secondMostRepeatedStr(String[] strs) {
		
		if (strs == null || strs.length == 0) {
			return null;
			//throw new IllegalArgumentException();
		}
		
		Map<String, Integer> countingMap = new HashMap<String, Integer>();
		for (String s : strs) {
			countingMap.put(s, countingMap.getOrDefault(s, 0) + 1);
		}
		
		System.out.println(countingMap);
		
		return null;
	}
	
	
	
}
