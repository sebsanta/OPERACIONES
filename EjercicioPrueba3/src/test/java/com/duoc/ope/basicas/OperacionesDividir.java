package com.duoc.ope.basicas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperacionesDividir {
	
	private Operaciones opes;

	@Before
	public void setUp() throws Exception {
		this.opes = new Operaciones();
	}

	@Test
	public void test() {
		double resultado = this.opes.dividir(100, 10);
		assertTrue("DEBERIA SER 10 PERO ES: " + resultado,resultado == 10); 
	}
	
	
	@Test
	public void testpor0() {
		double resultado = this.opes.dividir(100, 0);
		assertTrue("DEBERIA SER 0 PERO ES: " + resultado,resultado == 0); 
	}
	
	
//	//aqui me cae un error
//	@Test
//	public void testDivision() {
//		double resultado = this.opes.dividir(100, 11);
//		assertTrue("DEBERIA SER 10 PERO ES: " + resultado,resultado == 10);
//	}

}
