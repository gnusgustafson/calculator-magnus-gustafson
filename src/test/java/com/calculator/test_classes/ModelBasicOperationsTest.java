package com.calculator.test_classes;


import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;
import com.calculator.MVC.ModelBasicOperations;
import junit.framework.TestCase;

/**
 * Test-klass för klassen ModelBasicOperation. 
 * Här testas samtliga funktioner i klassen, nämligen de fyra räknesätten +,-,*,/
 * 
 * @author Magnus Gustafson - KVALIT18
 * @version 1.0 ALPHA, 2018-12-10
 * 
 *
 */

public class ModelBasicOperationsTest extends TestCase {
	
	ModelBasicOperations basic = new ModelBasicOperations(); //instans av klassen skapas för testning
	
	Random random = new Random();
	
	public static final Logger LOG = Logger.getLogger(ModelBasicOperations.class.getName());
	
	
	/*
	 * Testar metoden addition i klassen ModelBasicOperations med enbart positiva värden
	 */
	@Test
	public void testAdditionPositiveValues(){
		
		double a = 0;
		double b = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*100;
			b = random.nextDouble()*100;
			oracle = a + b;
			
			assertEquals(basic.addition(a, b), oracle,0);
			
			LOG.info("Testar metoden addition med positiva värden: " + a + " + " + b + " = " + oracle);
		}
		
	}
	
	
	/*
	 * Testar metoden addition i klassen ModelBasicOperations med enbart negativa värden
	 */
	@Test
	public void testAdditionNegativeValues(){
		
		double a = 0;
		double b = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*-100;
			b = random.nextDouble()*-100;
			oracle = a + b;
			
			assertEquals(basic.addition(a, b), oracle,0);
			
			LOG.info("Testar metoden addition med negativa värden: " + a + " + " + b + " = " + oracle);
		}
		
	}
	
	/*
	 * Testar metoden addition i klassen ModelBasicOperations med ett positivt argument samt med 0.0 som värde. 
	 */
	@Test
	public void testAdditionWithZeroAndPositiveValue() {

		double a = 0;
		double b = 0;
		double oracle = 0;

		for (int i = 0; i < 50; i++) {

			if (i % 2 == 1) {
				a = random.nextDouble() * 0;
				b = random.nextDouble() * 100;
			} else {
				a = random.nextDouble() * 100;
				b = random.nextDouble() * 0;
			}
			oracle = a + b;

			assertEquals(basic.addition(a, b), oracle, 0);

			LOG.info("Testar metoden addition med noll som ett av argumenten " + a + " + " + b + " = " + oracle);
		}

	}
	
	
	/*
	 * Testar metoden addition i klassen ModelBasicOperations med ett negativt argument samt med 0.0 som värde. 
	 */
	@Test
	public void testAdditionWithZeroAndNegativeValue() {

		double a = 0;
		double b = 0;
		double oracle = 0;

		for (int i = 0; i < 50; i++) {

			if (i % 2 == 1) {
				a = random.nextDouble() * 0;
				b = random.nextDouble() * -100;
			} else {
				a = random.nextDouble() * -100;
				b = random.nextDouble() * 0;
			}
			oracle = a + b;

			assertEquals(basic.addition(a, b), oracle, 0);

			LOG.info("Testar metoden addition med noll som ett av argumenten " + a + " + " + b + " = " + oracle);
		}

	}
	
	/*
	 * Testar metoden addition i klassen ModelBasicOperations med enbart 0 och 0.0 som värde. 
	 */
	@Test
	public void testAdditionWithZeroOnly() {

		
		assertEquals(basic.addition(0, 0),0,0);
		
		LOG.info("Testar metoden addition med värdena: " + 0 + " + " + 0 + " = " + 0);
		
		assertEquals(basic.addition(0.0, 0.0),0.0,0.0);
		
		LOG.info("Testar metoden addition med värdena: " + 0.0 + " + " + 0.0 + " = " + 0.0);

	}

	
	/*
	 * Testar metoden substraction i klassen ModelBasicOperations med enbart positiva värden
	 */
	@Test
	public void testSubstractionPositiveValues(){
		
		double a = 0;
		double b = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*100;
			b = random.nextDouble()*100;
			oracle = a - b;
			
			assertEquals(basic.substraction(a, b), oracle,0);
			
			LOG.info("Testar metoden subtraktion med positiva värden: " + a + " + " + b + " = " + oracle);
		}
		
	}
	
	
	/*
	 * Testar metoden substraction i klassen ModelBasicOperations med enbart negativa värden
	 */
	@Test
	public void testSubstractionNegativeValues(){
		
		double a = 0;
		double b = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*-100;
			b = random.nextDouble()*-100;
			oracle = a - b;
			
			assertEquals(basic.substraction(a, b), oracle,0);
			
			LOG.info("Testar metoden subtraktion med negativa värden: " + a + " + " + b + " = " + oracle);
		}
		
	}
	
	/*
	 * Testar metoden substraction i klassen ModelBasicOperations med positiva värden samt 0.0
	 */
	@Test
	public void testSubstractioWithZeroAndPositiveValue() {

		double a = 0;
		double b = 0;
		double oracle = 0;

		for (int i = 0; i < 50; i++) {

			if (i % 2 == 1) {
				a = random.nextDouble() * 0;
				b = random.nextDouble() * 100;
			} else {
				a = random.nextDouble() * 100;
				b = random.nextDouble() * 0;
			}
			oracle = a - b;

			assertEquals(basic.substraction(a, b), oracle, 0);

			LOG.info("Testar metoden subtraktion med noll som ett av argumenten " + a + " + " + b + " = " + oracle);
		}

	}
	
	/*
	 * Testar metoden substraction i klassen ModelBasicOperations med negativa värden samt 0.0
	 */
	@Test
	public void testSubstractionWithZeroAndNegativeValue() {

		double a = 0;
		double b = 0;
		double oracle = 0;

		for (int i = 0; i < 50; i++) {

			if (i % 2 == 1) {
				a = random.nextDouble() * 0;
				b = random.nextDouble() * -100;
			} else {
				a = random.nextDouble() * -100;
				b = random.nextDouble() * 0;
			}
			oracle = a - b;

			assertEquals(basic.substraction(a, b), oracle, 0);

			LOG.info("Testar metoden subtraktion med noll som ett av argumenten " + a + " + " + b + " = " + oracle);
		}

	}
	
	/*
	 * Testar metoden substraction i klassen ModelBasicOperations med enbart 0 samt 0.0
	 */
	@Test
	public void testSubstractionWithZeroOnly() {

		
		assertEquals(basic.substraction(0, 0),0,0);
		
		LOG.info("Testar metoden subtraktion med värdena: " + 0 + " + " + 0 + " = " + 0);
		
		assertEquals(basic.substraction(0.0, 0.0),0.0,0.0);
		
		LOG.info("Testar metoden subtraktion med värdena: " + 0.0 + " + " + 0.0 + " = " + 0.0);

	}

	
	/*
	 * Testar metoden multiplication i klassen ModelBasicOperations med enbart positiva värden
	 */
	@Test
	public void testMultiplicationPositiveValues(){
		
		double a = 0;
		double b = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*100;
			b = random.nextDouble()*100;
			oracle = a * b;
			
			assertEquals(basic.multiplication(a, b), oracle,0);
			
			LOG.info("Testar metoden multiplikation med positiva värden: " + a + " + " + b + " = " + oracle);
		}
		
	}
	
	/*
	 * Testar metoden multiplication i klassen ModelBasicOperations med enbart negativa värden
	 */
	@Test
	public void testMultiplicationNegativeValues(){
		
		double a = 0;
		double b = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*-100;
			b = random.nextDouble()*-100;
			oracle = a * b;
			
			assertEquals(basic.multiplication(a, b), oracle,0);
			
			LOG.info("Testar metoden multiplikation med negativa värden: " + a + " + " + b + " = " + oracle);
		}
		
	}
	
	
	/*
	 * Testar metoden multiplication i klassen ModelBasicOperations med ett positivt värde samt 0
	 */
	@Test
	public void testMultiplicationWithZeroAndPositiveValue() {

		double a = 0;
		double b = 0;
		double oracle = 0;

		for (int i = 0; i < 50; i++) {

			if (i % 2 == 1) {
				a = random.nextDouble() * 0;
				b = random.nextDouble() * 100;
			} else {
				a = random.nextDouble() * 100;
				b = random.nextDouble() * 0;
			}
			oracle = a * b;

			assertEquals(basic.multiplication(a, b), oracle, 0);

			LOG.info("Testar metoden multiplikation med noll som ett av argumenten "
					+ "samt ett positivt värde som det andra " + a + " + " + b + " = " + oracle);
		}

	}
	
	/*
	 * Testar metoden multiplication i klassen ModelBasicOperations med ett negativt värde samt 0
	 */
	@Test
	public void testMultiplicationWithZeroAndNegativeValue() {

		double a = 0;
		double b = 0;
		double oracle = 0;

		for (int i = 0; i < 50; i++) {

			if (i % 2 == 1) {
				a = random.nextDouble() * 0;
				b = random.nextDouble() * -100;
			} else {
				a = random.nextDouble() * -100;
				b = random.nextDouble() * 0;
			}
			oracle = a * b;

			assertEquals(basic.multiplication(a, b), oracle, 0);

			LOG.info("Testar metoden multiplikation med noll som ett av argumenten " + a + " + " + b + " = " + oracle);
		}

	}
	
	/*
	 * Testar metoden multiplication i klassen ModelBasicOperations med enbart 0 samt 0.0
	 */
	@Test
	public void testMultiplicationWithZeroOnly() {

		
		assertEquals(basic.multiplication(0, 0),0,0);
		
		LOG.info("Testar metoden multiplikation med värdena: " + 0 + " + " + 0 + " = " + 0);
		
		assertEquals(basic.multiplication(0.0, 0.0),0.0,0.0);
		
		LOG.info("Testar metoden multiplikation med värdena: " + 0.0 + " + " + 0.0 + " = " + 0.0);

	}

	/*
	 * Testar metoden division i klassen ModelBasicOperations med enbart positiva värden
	 */
	@Test
	public void testDivisionPositiveValues(){
		
		double a = 0;
		double b = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*100;
			b = random.nextDouble()*100;
			oracle = a / b;
			
			assertEquals(basic.division(a, b), oracle,0);
			
			LOG.info("Testar metoden division med positiva värden: " + a + " + " + b + " = " + oracle);
		}
		
	}
	
	/*
	 * Testar metoden division i klassen ModelBasicOperations med enbart negativa värden
	 */
	@Test
	public void testDivisionNegativeValues(){
		
		double a = 0;
		double b = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*-100;
			b = random.nextDouble()*-100;
			oracle = a / b;
			
			assertEquals(basic.division(a, b), oracle,0);
			
			LOG.info("Testar metoden division med negativa värden: " + a + " + " + b + " = " + oracle);
		}
		
	}
	
	/*
	 * Testar metoden division i klassen ModelBasicOperations med ett positivt värde samt 0
	 */
	@Test
	public void testDivisionWithZeroAndPositiveValue() {

		double a = 0;
		double b = 0;
		double oracle = 0;

		for (int i = 0; i < 50; i++) {

			if (i % 2 == 1) {
				a = random.nextDouble() * 0;
				b = random.nextDouble() * 100;
			} else {
				a = random.nextDouble() * 100;
				b = random.nextDouble() * 0;
			}
			oracle = a / b;
			assertEquals(basic.division(a, b), oracle, 0);

			LOG.info("Testar metoden division med noll som ett av argumenten " + a + " + " + b + " = " + oracle);
		}

	}
	
	/*
	 * Testar metoden division i klassen ModelBasicOperations med ett negativt värde samt 0
	 */
	@Test
	public void testDivisionWithZeroAndNegativeValue() {

		double a = 0;
		double b = 0;
		double oracle = 0;

		for (int i = 0; i < 50; i++) {

			if (i % 2 == 1) {
				a = random.nextDouble() * 0;
				b = random.nextDouble() * -100;
			} else {
				a = random.nextDouble() * -100;
				b = random.nextDouble() * 0;
			}
			oracle = a / b;

			assertEquals(basic.division(a, b), oracle, 0);

			LOG.info("Testar metoden division med noll som ett av argumenten " + a + " + " + b + " = " + oracle);
		}

	}
	

}
