package UD3_03;

/*
 @Autores: Luis González, Guillermo Vallejo, Martin Cardona
 */
import java.util.Arrays;
import java.util.Scanner;

//Ordenara de menor a mayor las notas introducidas en el array para luego coger el dato menor y el mayor y restarlos para conocer la diferencia
public class Ejercicio1 {
	int[] notas;
	Scanner sc;

	public void pedirNotas(int cantidad) {
		sc = new Scanner(System.in);
		notas = new int[cantidad];
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Introduzca la nota del alumno %d: ", i + 1);
			notas[i] = sc.nextInt();
		}
	}

	/*
	 * TODO: Programa este método para que calcule la diferencia entre la nota mas
	 * alta y la mas baja
	 */

	public void calcularDiferencia() {
		System.out.println("La diferencia es: ");
		Arrays.sort(notas);
		int diferencia = notas[notas.length - 1] - notas[0];
		System.out.println(diferencia);
	}

	public static void main(String[] args) {
		Ejercicio1 ejemplo = new Ejercicio1();
// Averigua cómo introducir un número en args[0] desde eclipse
		int elementos = Integer.parseInt(args[0]);
		ejemplo.pedirNotas(elementos);
		ejemplo.calcularDiferencia();
	}
}
