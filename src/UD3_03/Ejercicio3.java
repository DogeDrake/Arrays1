package UD3_03;

import java.util.Scanner;

public class Ejercicio3 {
	public static void casoDePrueba(Scanner in) {

// Array que contiene los d�as de cada mes del a�o
		int DaysMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
// Lectura del d�a
		int day = in.nextInt();
// Lectura del mes
		int month = in.nextInt();
// Variable que contiene el total con el resultado
		int total = 0;
//Proceso -> Obt�n en total, la cantidad de d�as que faltan utilizando el array
//Salida
		total = DaysMonth[month - 1] - day;
		for (int i = month; i < 12; i++)
			total += DaysMonth[i];

		System.out.println(total);
	}

//Conociendo el orden en el que cual acaban los 12 meses del a�o 
//Hacemos una operacion para saber en que dia del a�o estamos y luego iteraremos con el for un total de 12 veces hasta dar con la diferencia de dias hasta dar con el ultimo dia del a�o
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
//Casos de prueba limitado
		int numCasos = Integer.parseInt(in.nextLine());
		for (int i = 0; i < numCasos; i++)
			casoDePrueba(in);
	}
}