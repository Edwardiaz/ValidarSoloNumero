package com.calculadora.abst;

public abstract class Calculadora {
	
	double r;
	private double a, b;
	 
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
	
	public double sumar2() {
		return getA()+getB();
	}
	
	public Calculadora() {
		
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public Calculadora(double a1, double b1){
	this.a=a1;
	this.b=b1;
	}
	
}
