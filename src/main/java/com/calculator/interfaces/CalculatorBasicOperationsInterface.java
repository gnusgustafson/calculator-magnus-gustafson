package com.calculator.interfaces;

/**
 * 
 * Detta interface best�r av de abstrakta metoderna f�r att hantera de fyra 
 * r�knes�tten addition, subtraktion, multiplikation samt division, dvs. "+","-", "*", "/".
 * Implementeras av klassen ModelBasicOperations
 * 
 * @author Magnus Gustafson - KVALIT18
 * @version 1.0 ALPHA, 2018-12-10
 * 
 *
 */


public interface CalculatorBasicOperationsInterface {

	
	/**
	 * Denna abstrakta metod adderar v�rdena av parametrarna a och b samt returnerar resultatet
	 * 
	 * @param a
	 * @param b
	 * @return a+b
	 */
	double addition(double a, double b);
	
	/**
	 * Denna abstrakta metod subtraherar v�rdena av parametrarna a och b samt returnerar resultatet
	 * 
	 * @param a
	 * @param b
	 * @return a-b
	 */
	double substraction(double a, double b);
	
	/**
	 * Denna abstrakta metod multiplicerar v�rdena av parametrarna a och b samt returnerar resultatet
	 * 
	 * @param a
	 * @param b
	 * @return a*b
	 */
	double multiplication(double a, double b);
	
	/**
	 * Denna abstrakta metod dividerar v�rdena av parametrarna a och b samt returnerar resultatet
	 * 
	 * @param a
	 * @param b
	 * @return a/b
	 */
	double division(double a, double b);
	


}

