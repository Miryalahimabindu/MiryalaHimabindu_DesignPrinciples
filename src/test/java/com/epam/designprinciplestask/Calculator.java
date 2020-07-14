package com.epam.designprinciplestask;
/*Write Calculator program-
 *Should calculate addition of numbers
 *Should calculate multiplication of numbers
 *Should calculate division of number
 */

public class Calculator {
	
	public int add(int a,int b) {
		return a + b;
	}
	/*
	 * @Perform multiplication of two integer numbers
	 * @param a
	 * @param b
	 * returns product of two numbers
	 */
	public int mul(int a,int b) {
		return a * b;
	}
	/*
	 * Perform division of two integer numbers
	 * @param a
	 * @param b
	 * returns quotient of two numbers
	 */
	public int div(int a,int b) {
		if(a == 0 && b == 0)
			return -1;
		else if(b > a || b == 0)
			return -1;
		else 
			return a / b;
	}
}