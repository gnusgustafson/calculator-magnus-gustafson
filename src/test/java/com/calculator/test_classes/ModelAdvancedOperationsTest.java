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
	
	
	
	@Test
	public void testPi() {

		assertEquals(advanced.pi(), Math.PI);

		LOG.info("Testar om metoden returnerar pi: " + Math.PI);

	}
	
	@Test
	public void testpowerOfTwo(){
		
		double a = 0;
		double oracle = 0;
		
		for(int i = 0; i < 50; i++){
			
			a = random.nextDouble()*100;
			oracle = Math.pow(a, 2);
			assertEquals(advanced.powerOfTwo(a), oracle);
			
			LOG.info("Testar metoden för upphöjt med två (^2) : " + a + "^2 = " + oracle);
		}
		
		
		assertEquals(advanced.powerOfTwo(-3), 9.0);
		assertEquals(advanced.powerOfTwo(0), 0.0);
		
		
	}
	
}
