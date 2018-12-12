package com.calculator.main;


import com.calculator.MVC.*;
/**
 * 
 * Detta �r klassen som inneh�ller main-metoden och som startar programmet. Main-metoden instansierar
 * CalculatorController som i sin tur ModelBasicOperations, ModelAdvancedOperations samt CalculatorView som argument. 
 * 
 * Programmet f�ljer designm�nstret Model, View, Controller d�r "Model" genomf�r samtliga ber�kningar, "View" hanterar all grafik (GUI) och "Controller"
 * Sammanf�r de b�da f�r hantering och presentation. 
 * 
 * 
 * @author Magnus Gustafson - KVALIT18
 * @version 1.0 ALPHA, 2018-12-10
 * 
 *
 */

public class Main {

	/**
	 * Main-metoden instansierar CalculatorController som i sin tur ModelBasicOperations, 
	 * ModelAdvancedOperations samt CalculatorView som argument.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		

		
		@SuppressWarnings("unused") //Vet uppriktigt inte vad detta betyder, men eftersom objektet inte anv�nds s� ger den en varning annars. 
		CalculatorController c = new CalculatorController(new ModelBasicOperations(), new ModelAdvancedOperations(), new CalculatorView());
		

	}

}
