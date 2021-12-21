package UD3_03;

import java.util.Arrays;

public class Ejercicio2 {
	public static void main(String[] args) {
		int[] numeros = { 1, 4, 9, 7, 3, 2, 5, 11, 0, 9 };
//Utiliza este for para realizar el intercambio tal y como muestra el gráfico
		for (int i = 0; i < numeros.length - 5; i++) {
			int aux = numeros[i];
			numeros[i] = numeros[i + 5];
			numeros[i + 5] = aux;
//Tomando en cuenta que solo hay que usar la mitad del array cojo los 5 primeros valores
//y como ya tienen valores previamente dados simplemente hago un cambio de  variables adaptado a los arrays
//usando una variables extra llamada Aux
		}
		System.out.println(Arrays.toString(numeros));
	}
}