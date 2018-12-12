package com.calculator.MVC;

import com.calculator.interfaces.CalculatorAdvancedOperationsInterface;

/**
 * Denna klass genomf�r minir�knarens avancerade ber�kningar med hj�lp av att implementera interface CalculatorAdvancedOperations.  
 * 
 * @author Magnus Gustafson - KVALIT18
 * @version 1.0 ALPHA, 2018-12-10
 * 
 *
 */

public class ModelAdvancedOperations implements CalculatorAdvancedOperationsInterface{

	 
	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar d�refter
	 * talet upph�jt till 2. Resultatet lagras i variabeln result som sedan returneras.
	 * 
	 * @param a
	 * @return result
	 */
	public double powerOfTwo(double a) {
		
		double result = 0;
		result = Math.pow(a, 2);
		
		return result;
	}

	
	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar d�refter
	 * talet upph�jt till 3. Resultatet lagras i variabeln result som sedan returneras.
	 * 
	 * @param a
	 * @return result
	 */
	public double powerOfThree(double a) {
		
		double result = 0;
		result = Math.pow(a, 3);
		
		return result;
	}

	
	/**
	 * Denna funktion returnerar v�rdet av pi som en double. 
	 * 
	 * @return Math.PI
	 */
	public double pi() {
		
		return Math.PI;
	}

	
	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar d�refter
	 * log10(a) vilket lagras i double-variabeln result som sedan returneras. 
	 * 
	 * @param a
	 * @return result
	 */
	public double log(double a) {
		
		double result = 0;
		result = Math.log10(a);
		
		return result;
		
	}

	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar d�refter
	 * sin(a) vilket lagras i double-variabeln result som sedan returneras. 
	 * 
	 * @param a
	 * @return result
	 */
	public double sin(double a) {

		double result = 0;
		result = Math.sin(a);
		//result = Math.toRadians(result);
		
		return result;
				
	}
	
	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar d�refter
	 * cos(a) vilket lagras i double-variabeln result som sedan returneras. 
	 * 
	 * @param a
	 * @return result
	 */
	public double cos(double a) { // Ovservera - GRADER och inte radianer. 

		double result = 0;
		result = Math.cos(a);
		
		return result;
	
	}

	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar d�refter
	 * tan(a) vilket lagras i double-variabeln result som sedan returneras. 
	 * 
	 * @param a
	 * @return result
	 */
	public double tan(double a) {
		
		double result = 0;
		result = Math.tan(a);
		
		return result;

	}

	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar d�refter
	 * kvadratroten ur parametern a. Detta lagras i double-variabeln result som sedan returneras. 
	 * 
	 * @param a
	 * @return result
	 */
	public double squareRoot(double a) {

		double result = 0;
		result = Math.sqrt(a);
		
		return result;

	}



}
