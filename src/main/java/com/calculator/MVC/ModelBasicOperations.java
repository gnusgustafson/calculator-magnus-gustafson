package com.calculator.MVC;

import com.calculator.interfaces.CalculatorBasicOperationsInterface;


/**
 * 
 * Denna klass implementerar interfacet "CalculatorBasicOperationsInterface" och används har beräkning enligt de fyra 
 * räknesätten addition, subtraktion, multiplikation samt division, dvs. "+","-", "*", "/"
 * 
 * @author Magnus Gustafson - KVALIT18
 * @version 1.0 ALPHA, 2018-12-10
 * 
 *
 */

public class ModelBasicOperations implements CalculatorBasicOperationsInterface{

	
	/**
	 * Denna metod tar emot två double-värden som parameter. Värdena adderas med varandra och 
	 * resultatet lagras i variabeln result som sedan returneras.
	 * 
	 * @param a, b
	 * @return result
	 */
	
	public double addition(double a, double b) {
		
		double result = 0;
		result = a + b;
		return result;
	}
	
	/**
	 * Denna metod tar emot två double-värden som parameter. Värdena subtraheras med varandra och 
	 * resultatet lagras i variabeln result som sedan returneras.
	 * 
	 * @param a, b
	 * @return result
	 */

	public double substraction(double a, double b) {
		
		double result = 0;
		result = a - b;
		return result;
	}
	
	/**
	 * Denna metod tar emot två double-värden som parameter. Värdena multipliceras med varandra och 
	 * resultatet lagras i variabeln result som sedan returneras.
	 * 
	 * @param a, b
	 * @return result
	 */

	public double multiplication(double a, double b) {
		
		double result = 0;
		result = a * b;
		return result;
	}

	/**
	 * Denna metod tar emot två double-värden som parameter. Värdena divideras med varandra och 
	 * resultatet lagras i variabeln result som sedan returneras.
	 * 
	 * @param a, b
	 * @return result
	 */
	
	public double division(double a, double b) {
		
		double result = 0;
		result = a / b;
		return result;
	}
	


	
}
