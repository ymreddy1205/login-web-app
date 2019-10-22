package com.etisalat.service;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest {

	private Integer number1;
	private Integer number2;
	Calculator calculator = null ;
	public CalculatorTest(Integer number1, Integer number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] { { 25, 5 }, { -10, 4 }, { 100, 100 }, { -1, 1 } });
	}

	@Before
	public void beforeEachMethod() {
		calculator = new Calculator();
		System.out.println("execute before each method.........");
	}

	@After
	public void afterEachMethod() {
		calculator = null ;
		System.out.println("execute after each method..........");
	}

	@BeforeClass
	public static void beforeAllTestMethods() {
		System.out.println("Connecting to Database.........");
	}

	@AfterClass
	public static void afterAllTestMethods() {
		System.out.println("Closing connectios..........");
	}

	@Test
	public void testValidAdd() throws Exception {
		//Calculator calculator = new Calculator();
		assertEquals(new Integer(number1+number2), calculator.add(number1, number2));
	}

	@Test
	public void testInvalidAdd() throws Exception {
		Calculator calculator = new Calculator();
		assertNotSame(new Integer(12), calculator.add(number1, number2));
	}

	@Test
	public void testValidateSquare(){
		assertEquals(new Integer(number1*number2), calculator.square(number1, number2));
	}
	
}
