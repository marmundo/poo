package com.marcelodamasceno.calculadora.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.marcelodamasceno.calculadora.Calculadora;

public class CalcudadoraTest {
	
	Calculadora calc=null;
	
	@Before
	public void start(){
		calc=new Calculadora();
	}

	@Test
	public void somaTest() {
		assertEquals(calc.soma(2,2), 4);
		assertEquals(calc.soma(2,3), 5);
	}
	
	@Test
	public void isPositiveTest(){
		assertTrue(calc.isPositive(10));
	}

}
