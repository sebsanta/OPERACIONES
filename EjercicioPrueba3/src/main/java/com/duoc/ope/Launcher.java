package com.duoc.ope;

import com.duoc.ope.basicas.Operaciones;

public class Launcher {

	public static void main(String[] args) {
 
		Operaciones op = new Operaciones();
		
		
		//OPERACION DE SUMA
		System.out.println("La suma de 15 + 20 es: " + op.sumar(15, 20));
//		System.out.println("La suma de 10 + 0 es: " + op.sumar(10, 0));
		
		
		//OPERACION DE RESTA
		System.out.println("La resta de 15 - 20 es: " + op.restar(15, 20));
//		System.out.println("La resta de 5 - 10 es: " + op.restar(5, 10));
		
		
		//OPERACION MULTIPLICACION
		System.out.println("La multiplicacion de 15 * 20 es: " + op.multiplicar(15, 20));
//		System.out.println("La multiplicacion de 10 * 0 es: " + op.multiplicar(10, 0));
		
		
		//OPERACION DIVISION
		System.out.println("La division de 15 / 20 es: " +  op.dividir(15, 20));
//		System.out.println("La division de 10 / 0 es: " + op.dividir(10, 0));
		
		System.out.println("La suma de max con max es: " + op.sumar(Integer.MAX_VALUE, Integer.MAX_VALUE));

	}

}
