package com.calculadora.abst;

public abstract class Calculadora {
	
	double r;
	 
	public  double sumar(double x, double y){
		r=x+y;
		return r;
	}
	public  double restar(double x, double y){
		r=x-y;
		return r;
	}
	
	public  double multiplicar(double x, double y){
		r=x*y;
		return r;
	}
	
	public  double division(double x, double y){
		r=x/y;
		return r;
	}
	
	public Calculadora() {
		
	}
	
}
