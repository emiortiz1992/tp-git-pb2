package ar.edu.unlam.pb2;

import java.util.Scanner;

public class Ahorcado {
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println(
					"Ingrese su operaci�n /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
			opcion = teclado.nextInt();
		} while (opcion < 1 && opcion > 4);
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		switch (opcion) {
		case 1:
			resultado = a + b;
			break;
			
		case 2:
			resultado = a - b;
			break;
			
		case 3:
			resultado = a * b;
			break;
			
		case 4:
			resultado = a / b;
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + 1);
		}
		System.out.println("El resultado es " + resultado.toString());
	}
}
