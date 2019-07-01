package com.duoc.ope.basicas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperacionesRestarTest {
	
	private Operaciones opes;

	@Before
	public void setUp() throws Exception {
		this.opes = new Operaciones();
	}

	@Test
	public void cuando15menos5entonces10() {
		
		int resultado = this.opes.restar(15, 5);
		assertTrue("DEBERIA SER 10 PERO ES: " + resultado,resultado == 10);
	}

}
