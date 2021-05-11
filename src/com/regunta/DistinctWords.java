package com.regunta;

public class DistinctWords {
	public static void main(String[] args) {
		System.out.println("factorial of 16 : " + factorial(1));
		System.out.println("factorial of 17 : " + factorial(4));
	}

	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}
}
