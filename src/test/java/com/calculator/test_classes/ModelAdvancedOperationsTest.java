package com.calculator.test_classes;


import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.calculator.MVC.ModelAdvancedOperations;

import junit.framework.TestCase;


/**
 * Test-klass för klassen ModelAdvancedOperation. 
 * Här testas samtliga funktioner i klassen, nämligen de avancerade utärkningarna: x^2, x^3, sqrt(), log, sin, cos, tan, pi
 * 
 * @author Magnus Gustafson - KVALIT18
 * @version 1.0 ALPHA, 2018-12-10
 * 
 *
 */


public class ModelAdvancedOperationsTest extends TestCase {

	
	
	ModelAdvancedOperations advanced = new ModelAdvancedOperations();
	
	Random random = new Random();
	
	public static final Logger LOG = Logger.getLogger(ModelAdvancedOperations.class.getName());
	
	
	
	
	/*
	 * Testar om funktionen pi från klassen ModelAdvancedOperations returnerar pi
	 */
	@Test
	public void testPi() {
		
		assertEquals(advanced.pi(), Math.PI);

		LOG.info("Testar om metoden returnerar pi: " + Math.PI);

	}
	
	
	/*
	 * Testar funktionen powerOfTwo (^2) från klassen ModelAdvancedOperations med positiva värden
	 */
	@Test
	public void testpowerOfTwoPositive(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*100;
			oracle = Math.pow(a, 2);
			assertEquals(advanced.powerOfTwo(a), oracle);
			
			LOG.info("Testar metoden för upphöjt med två med positivt värde(^2) : " + a + "^2 = " + oracle);
		}
		
		
	}
	
	/*
	 * Testar funktionen powerOfTwo (^2) från klassen ModelAdvancedOperations med negativa värden
	 */
	@Test
	public void testpowerOfTwoNegative(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*-100;
			oracle = Math.pow(a, 2);
			assertEquals(advanced.powerOfTwo(a), oracle);
			
			LOG.info("Testar metoden för upphöjt med två negativt värde (^2) : " + a + "^2 = " + oracle);
		}	
		
	}
	
	/*
	 * Testar funktionen powerOfTwo (^2) från klassen ModelAdvancedOperations med 0.0
	 */
	@Test
	public void testpowerOfTwoZero(){
		
		assertEquals(advanced.powerOfTwo(0), 0.0);	
		LOG.info("Testar metoden för upphöjt med 0.0 (^2)");
	}
	
	/*
	 * Testar funktionen powerOfThree (^3) från klassen ModelAdvancedOperations med positiva värden
	 */
	@Test
	public void testpowerOfThreePositive(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*100;
			oracle = Math.pow(a, 3);
			assertEquals(advanced.powerOfThree(a), oracle);
			
			LOG.info("Testar metoden för upphöjt med 3 med positivt värde(^3) : " + a + "^3 = " + oracle);
		}
		
		
	}
	
	/*
	 * Testar funktionen powerOfThree (^3) från klassen ModelAdvancedOperations med negativa värden
	 */
	@Test
	public void testpowerOfThreeNegative(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*-100;
			oracle = Math.pow(a, 3);
			assertEquals(advanced.powerOfThree(a), oracle);
			
			LOG.info("Testar metoden för upphöjt med 3 med negativt värde (^3) : " + a + "^3 = " + oracle);
		}	
		
	}
	
	/*
	 * Testar funktionen powerOfThree (^3) från klassen ModelAdvancedOperations med 0.0
	 */
	@Test
	public void testpowerOfThreeZero(){
		
		assertEquals(advanced.powerOfTwo(0), 0.0);	
		LOG.info("Testar metoden för upphöjt med 0.0 (^3)");
	}
	
	
	/*
	 * Testar funktionen squareRoot (sqrt) från klassen ModelAdvancedOperations med positiva värden
	 */
	@Test
	public void testSquareRootPositive(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*100;
			oracle = Math.sqrt(a);
			assertEquals(advanced.squareRoot(a), oracle);
			
			LOG.info("Testar metoden squareRoot med positiva värden" + " sqrt(" + a + ") = "+ oracle);
		}
		
		
	}
	
	/*
	 * Testar funktionen squareRoot (sqrt) från klassen ModelAdvancedOperations med negativa värden
	 */
	@Test
	public void testSquareRootNegative(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*-100;
			oracle = Math.sqrt(a);
			assertEquals(advanced.squareRoot(a), oracle);
			
			LOG.info("Testar metoden squareRoot med negativa värden" + " sqrt(" + a + ") = "+ oracle);
		}
		
		
	}
	
	/*
	 * Testar funktionen squareRoot (sqrt) från klassen ModelAdvancedOperations med 0.0
	 */
	@Test
	public void testSquareRootZero(){
		
			assertEquals(advanced.squareRoot(0.0), 0.0);
			
			LOG.info("Testar metoden squareRoot med 0.0" + " sqrt(" + 0 + ") = "+ Math.sqrt(0));
		}
	
	/*
	 * Testar funktionen log (log10) från klassen ModelAdvancedOperations med positiva värden
	 */
	@Test
	public void testLogPositive(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*100;
			oracle = Math.log10(a);
			assertEquals(advanced.log(a), oracle);
			
			LOG.info("Testar metoden för logaritm med positiva värden : "  + "log10("+ a + ") = " + oracle);
		}
		
		
	}
	
	/*
	 * Testar funktionen log (log10) från klassen ModelAdvancedOperations med negativa värden
	 */
	@Test
	public void testLogNegative(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*-100;
			oracle = Math.log10(a);
			assertEquals(advanced.log(a), oracle);
			
			LOG.info("Testar metoden för logaritm med negativa värden : "  + "log10("+ a + ") = " + oracle);
		}
		
		
	}
	
	/*
	 * Testar funktionen log (log10) från klassen ModelAdvancedOperations med 0.0
	 */
	@Test
	public void testLogZero() {

		double oracle = Math.log10(0.0);
		
		assertEquals(advanced.log(0.0), oracle);

		LOG.info("Testar metoden för logaritm med 0.0 : " + "log10(" + 0.0 + ") = " + oracle);
	}
	
	/*
	 * Testar funktionen sin (sin()) från klassen ModelAdvancedOperations med positiva värden
	 */
	@Test
	public void testSinPositive(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*100;
			oracle = Math.sin(a);
			assertEquals(advanced.sin(a), oracle);
			
			LOG.info("Testar metoden för sinus med positiva värden : "  + "sin("+ a + ") = " + oracle);
		}
		
		
	}
	
	/*
	 * Testar funktionen sin (sin()) från klassen ModelAdvancedOperations med negativa värden
	 */
	@Test
	public void testSinNegative(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*-100;
			oracle = Math.sin(a);
			assertEquals(advanced.sin(a), oracle);
			
			LOG.info("Testar metoden för sinus med negativa värden : "  + "sinus("+ a + ") = " + oracle);
		}
		
		
	}
	
	/*
	 * Testar funktionen sin (sin()) från klassen ModelAdvancedOperations med 0.0
	 */
	@Test
	public void testSinZero() {

		double oracle = Math.sin(0.0);
		
		assertEquals(advanced.sin(0.0), oracle);

		LOG.info("Testar metoden för sinus med 0.0 : " + "log10(" + 0.0 + ") = " + oracle);
	}
	
	/*
	 * Testar funktionen cos (cos()) från klassen ModelAdvancedOperations med positiva värden
	 */
	@Test
	public void testCosPositive(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*100;
			oracle = Math.cos(a);
			assertEquals(advanced.cos(a), oracle);
			
			LOG.info("Testar metoden för cosinus med positiva värden : "  + "cos("+ a + ") = " + oracle);
		}
		
		
	}
	
	/*
	 * Testar funktionen cos (cos()) från klassen ModelAdvancedOperations med negativa värden
	 */
	@Test
	public void testCosNegative(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*-100;
			oracle = Math.cos(a);
			assertEquals(advanced.cos(a), oracle);
			
			LOG.info("Testar metoden för cosinus med negativa värden : "  + "cos("+ a + ") = " + oracle);
		}
		
		
	}
	
	/*
	 * Testar funktionen cos (cos()) från klassen ModelAdvancedOperations med 0.0
	 */
	@Test
	public void testCosZero() {

		double oracle = Math.cos(0.0);
		
		assertEquals(advanced.cos(0.0), oracle);

		LOG.info("Testar metoden för cosinus med 0.0 : " + "cos(" + 0.0 + ") = " + oracle);
	}
	
	/*
	 * Testar funktionen tan (tan()) från klassen ModelAdvancedOperations med positiva värden
	 */
	@Test
	public void testTanPositive(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*100;
			oracle = Math.tan(a);
			assertEquals(advanced.tan(a), oracle);
			
			LOG.info("Testar metoden för tangens med positiva värden : "  + "tan("+ a + ") = " + oracle);
		}
		
		
	}
	
	/*
	 * Testar funktionen tan (tan()) från klassen ModelAdvancedOperations med negativa värden
	 */
	@Test
	public void testTanNegative(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*-100;
			oracle = Math.tan(a);
			assertEquals(advanced.tan(a), oracle);
			
			LOG.info("Testar metoden för tangens med negativa värden : "  + "tan("+ a + ") = " + oracle);
		}
		
		
	}
	
	/*
	 * Testar funktionen cos (cos()) från klassen ModelAdvancedOperations med 0.0
	 */
	@Test
	public void testTanZero() {

		double oracle = Math.tan(0.0);
		
		assertEquals(advanced.tan(0.0), oracle);

		LOG.info("Testar metoden för tangens med 0.0 : " + "tan(" + 0.0 + ") = " + oracle);
	}
		

	
}
