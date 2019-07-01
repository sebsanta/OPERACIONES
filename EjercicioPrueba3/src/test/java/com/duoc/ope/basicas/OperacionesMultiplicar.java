package com.duoc.ope.basicas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperacionesMultiplicar {

	private Operaciones opes;
	
	@Before
	public void setUp() throws Exception {
		this.opes = new Operaciones();
	}

	@Test
	public void test() {
		int resultado = this.opes.multiplicar(15, 10);
		assertTrue("DEBERIA SER 150 PERO ES: " + resultado,resultado == 150);
	}

	
	
	
}
