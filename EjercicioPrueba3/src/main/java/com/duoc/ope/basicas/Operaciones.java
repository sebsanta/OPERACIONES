package com.duoc.ope.basicas;

public class Operaciones {

	public int sumar(int a, int b) {
		if(a==0 || b==0) {
			return 0;
		}
		return a+b;
	}
	
	public int restar(int a, int b) {
		if(a < b) {
			return 0;
		}
		return a-b;
	}
	
	public int multiplicar(int a, int b) {
		if(b == 0) {
			return 1;
		}
		return a*b;
	}
	
	public int dividir(int a, int b) {
		if(b == 0) {
			return 0;
		}
		return a/b;
	}
	
}

 


//-	sumar(int a, int b): Retorna la suma de los valores, pero cuando alguno de ellos es 0, retorna 0.
//-	restar(int a, int b): Retorna la resta de a – b, pero cuando b es mayor que a siempre retorna 0.
//-	multiplicar(int a, int b): Retorna la multiplicación, pero cuando b es 0 retorna 1.
//-	dividir(int a, int b): Retorna la división de a / b pero cuando B es 0 retorna 0
