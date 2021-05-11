package com.regunta;

import org.apache.commons.lang3.StringUtils;

/**
 * String-based programming questions
Can you write a method that will erase any character from a string?
How would you define the term 'string' to someone who is not in IT?
How can you write a code to check if a string is a palindrome or not?
What is the difference between a string and a string builder in Java?
How do you convert a numeric string to int in Java?
How do you find the maximum occurring character in a given string?
How do you find the first unrepeated character of a given string?
How do you split a string in Java?



LinkedList programming questions
When should you use LinkedList programming?
How do you reverse a linked list?
How can you figure out if a linked list contains a cycle?
How do you find a cycle's starting node?
How do you remove an Nth Node from the end of a linked list?
How do you find the start of a loop?
What is the difference between a linked list and an array data structure?
How would you merge two sorted linked lists?
Binary Tree programming questions
When should you use binary tree programming?
Do you know how to find the depth of a binary tree?
What are leaf nodes and why are they important in a binary tree?
What is a postorder traversal algorithm and how do you use it?
What is the difference between preorder, inorder and postorder traversals?
What is the depth-first search algorithm for a binary tree?
Can you traverse a binary tree in postorder traversal without recursion?
How are leaves printed?
Searching and sorting questions
How do you write a program that sorts numbers?
What is the difference in implementation for insertion sort and bubble sort in Java?
How do you implement a merge sort algorithm?
What is a binary search algorithm and how do you use it in Java vs. C++?
What is the difference between a stable and unstable sorting algorithm?
What is an iterative quicksort algorithm and how do you implement it?
Do you know what an insertion sort algorithm is?
Can you tell me the difference between the terms searching and sorting?

 * @author rregunta
 *
 */
public class ProgrammingQuestions {

	public static void main(String[] args) {
//		System.out.println(isPalindrome(null));
//		System.out.println(isPalindrome(""));
//		System.out.println(isPalindrome("a"));
//		System.out.println(isPalindrome("ab"));
//		System.out.println(isPalindrome("aba"));
//		System.out.println(isPalindrome("abba"));

		String[] words = { "bat", "tab", "cat" };
		System.out.println(pairOfIndices(words));

		System.out.println(reverse(null));
		System.out.println(reverse(""));
		System.out.println(reverse("a"));
		System.out.println(reverse("rajkumar"));
	}

	public static String reverse(String str) {
		if (StringUtils.isEmpty(str) || str.length() == 1) {
			return str;
		} else {
			return reverse(str.substring(1, str.length())) + str.charAt(0);
		}
		// return reverse(str, "");
	}

	public static String pairOfIndices(String[] words) {
		String outputString = "";

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (i == j) {
					continue;
				}

				if (isPalindrome(words[i] + words[j])) {
					outputString += String.format("(%d, %d) ", i, j);
				}
			}
		}
		return outputString;
	}

	public static boolean isPalindrome(String str) {
		if (str == null || str.length() == 0) {
			throw new IllegalArgumentException("");
		}

		for (int i = 0; i <= str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

//	public String reverse(String str, String output) {
//		if(str == null) {
//			return str;
//		} else if (str.length() == 0) {
//			return output;
//		} else {
//			return reverse(str.substring(1, str.length()), str.charAt(0) + output);
//		}
//	}

}
