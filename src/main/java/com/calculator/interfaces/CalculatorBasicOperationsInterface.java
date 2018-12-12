package com.calculator.interfaces;

/**
 * 
 * Detta interface består av de abstrakta metoderna för att hantera de fyra 
 * räknesätten addition, subtraktion, multiplikation samt division, dvs. "+","-", "*", "/".
 * Implementeras av klassen ModelBasicOperations
 * 
 * @author Magnus Gustafson - KVALIT18
 * @version 1.0 ALPHA, 2018-12-10
 * 
 *
 */


public interface CalculatorBasicOperationsInterface {

	
	/**
	 * Denna abstrakta metod adderar värdena av parametrarna a och b samt returnerar resultatet
	 * 
	 * @param a
	 * @param b
	 * @return a+b
	 */
	double addition(double a, double b);
	
	/**
	 * Denna abstrakta metod subtraherar värdena av parametrarna a och b samt returnerar resultatet
	 * 
	 * @param a
	 * @param b
	 * @return a-b
	 */
	double substraction(double a, double b);
	
	/**
	 * Denna abstrakta metod multiplicerar värdena av parametrarna a och b samt returnerar resultatet
	 * 
	 * @param a
	 * @param b
	 * @return a*b
	 */
	double multiplication(double a, double b);
	
	/**
	 * Denna abstrakta metod dividerar värdena av parametrarna a och b samt returnerar resultatet
	 * 
	 * @param a
	 * @param b
	 * @return a/b
	 */
	double division(double a, double b);
	


}

