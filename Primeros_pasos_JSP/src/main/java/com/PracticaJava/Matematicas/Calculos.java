package com.PracticaJava.Matematicas;

public class Calculos {
	private static int resultado;
	public int metodoSuma (int num1, int num2) {
		resultado = num1+num2;
		return resultado;
	}
	

	public static int metodoResta (int num1, int num2) {
		resultado = num1-num2;
		return resultado;
	}
	

	public static int metodoMultiplicar (int num1, int num2) {
		resultado = num1*num2;
		return resultado;
	}
}
