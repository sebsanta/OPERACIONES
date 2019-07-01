package com.duoc.ope.basicas;

import static org.junit.Assert.*;

 
import org.junit.Before;
import org.junit.Test;

public class OperacionesTests {
	
	private Operaciones opes;

	@Before
	public void setUp() throws Exception {
		this.opes = new Operaciones();
	}

	@Test
	public void cuando15mas20entonces35() {
		 int resultado = this.opes.sumar(15, 20);
		 assertEquals(35,resultado);
	}

	
	@Test
	public void cuandoA0entonces0() {
		 int resultado = this.opes.sumar(0, 20);
		 assertEquals(0,resultado);
	}
	
	@Test
	public void cuandoB0entonces0() {
		 int resultado = this.opes.sumar(20, 0);
		 assertEquals(0,resultado);
	}
	
	@Test
	public void maxsumaconmax() {
		 int resultado = this.opes.sumar(-2, 0);
		 assertEquals(0,resultado);
	}
 
}





