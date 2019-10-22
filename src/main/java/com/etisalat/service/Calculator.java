package com.etisalat.service;

public class Calculator {
	public Integer add(int num1, int num2) {
		return num1 + num2;
	}

	public Double devide(double num1, double num2) {
		if (num2 == 0)
			new ArithmeticException("num2 should not be zero") ;		
    	return num1 / num2;
	}

	public Object square(Integer number1, Integer number2) {
		// TODO Auto-generated method stub
		return number1 * number2;
	}
	
	
}
