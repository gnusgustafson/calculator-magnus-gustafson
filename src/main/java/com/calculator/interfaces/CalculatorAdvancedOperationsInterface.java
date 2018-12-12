package com.calculator.interfaces;

/**
 * Interface med abstrakta metoder f�r att hantera de avancerade utr�kningarna. 
 * Implementeras av klassen ModelAdvancedInterface, 
 * 
 * @author Magnus Gustafson - KVALIT18
 * @version 1.0 ALPHA, 2018-12-10
 * 
 *
 */

public interface CalculatorAdvancedOperationsInterface {

	
	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar
	 * d�refter talet upph�jt till 2, dvs. a^2. 
	 * 
	 * @param a 
	 * @return a^2
	 */
	double powerOfTwo(double a);
	
	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar
	 * d�refter talet upph�jt till 2, dvs. a^3. 
	 * 
	 * @param a
	 * @return a^3
	 */
	double powerOfThree(double a);
	
	/**
	 * Returnerar pi, dvs. 3,14........
	 * @return pi
	 */
	double pi();
	
	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar
	 * d�refter log10(a) 
	 * 
	 * @param a
	 * @return log10(a)
	 */
	double log(double a);
	
	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar
	 * d�refter sin(a) 
	 * 
	 * @param a
	 * @return sin(a)
	 */
	double sin(double a);
	
	
	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar
	 * d�refter cos(a) 
	 * 
	 * @param a
	 * @return cos(a)
	 */
	double cos(double a);
	
	
	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar
	 * d�refter tan(a) 
	 * 
	 * @param a
	 * @return tan(a)
	 */
	double tan(double a);
	
	/**
	 * Denna funktion tar ett double-v�rde som parameter och ber�knar
	 * d�refter kvadratroten ur a 
	 * 
	 * @param a
	 * @return sqrt(a)
	 */
	double squareRoot(double a);
	
}
