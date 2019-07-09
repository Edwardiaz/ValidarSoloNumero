package com.calculadora.controlador;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		CalculadoraDigital cd = new CalculadoraDigital();

		Scanner sc = new Scanner(System.in);
		boolean validar = true;
		double x = 0, y = 0;
		System.out.println("Ingrese dos NUMEROS: ");

		do {
			try {

				x = Double.parseDouble(sc.nextLine());
				y = Double.parseDouble(sc.nextLine());

				System.out.println("Suma: ");
				System.out.println(cd.sumar(x, y));
				System.out.println("Resta: ");
				System.out.println(cd.restar(x, y));
				System.out.println("Multiplicación: ");
				System.out.println(cd.multiplicar(x, y));
				System.out.println("Division: ");
				System.out.println(cd.division(x, y));
				validar = false;

			} catch (Exception e) {
				System.out.println("ingrese solo numeros");
				validar = true;
			}

		} while (validar == true);
	}

}
