package com.calculator.MVC;

import com.calculator.interfaces.CalculatorBasicOperationsInterface;


/**
 * 
 * Denna klass implementerar interfacet "CalculatorBasicOperationsInterface" och anv�nds har ber�kning enligt de fyra 
 * r�knes�tten addition, subtraktion, multiplikation samt division, dvs. "+","-", "*", "/"
 * 
 * @author Magnus Gustafson - KVALIT18
 * @version 1.0 ALPHA, 2018-12-10
 * 
 *
 */

public class ModelBasicOperations implements CalculatorBasicOperationsInterface{

	
	/**
	 * Denna metod tar emot tv� double-v�rden som parameter. V�rdena adderas med varandra och 
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
	 * Denna metod tar emot tv� double-v�rden som parameter. V�rdena subtraheras med varandra och 
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
	 * Denna metod tar emot tv� double-v�rden som parameter. V�rdena multipliceras med varandra och 
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
	 * Denna metod tar emot tv� double-v�rden som parameter. V�rdena divideras med varandra och 
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
