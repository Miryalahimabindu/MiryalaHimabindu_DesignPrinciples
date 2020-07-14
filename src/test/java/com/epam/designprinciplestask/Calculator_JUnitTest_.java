package com.epam.designprinciplestask;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
 public class Calculator_JUnitTest_{
	@Test
	/*
	 * TestCases for Addition
	 */
	public void testAdd() {
		
		Calculator c=new Calculator();
		assertEquals(8,c.add(5, 3));
		assertEquals(-6,c.add(3, -9));
		assertEquals(-14,c.add(-5, -9));
	}
	
	@Test
	/*
	 * Test Cases for Multiplication
	 */
	public void testMul() {
		Calculator c=new Calculator();
		assertEquals(35,c.mul(5, 7));
		assertEquals(-21,c.mul(-3, 7));
		assertEquals(20,c.mul(-5, -4));
	}
	@Test
	/*
	 * Test Cases for Division
	 */
	public void testDiv() {
		Calculator c=new Calculator();
		assertEquals(3,c.div(15, 5));
		assertEquals(-1,c.div(0, 0));
		assertEquals(-1,c.div(9, 99));
		assertEquals(-1,c.div(5, 0));
	}
}
