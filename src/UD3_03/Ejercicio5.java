package UD3_03;
import java.util.Scanner;

public class Ejercicio5 {
	// El ejercicio nos pide que busquemos los picos de la motaña rusa.
	public static boolean casoDePrueba(Scanner in) {
// Variable que controla si el caso hay que analizarlo o finaliar
		boolean continuar = true;
		int picos = 0;
// Se lee la candidad de piezas o el caso especial que es 0
		int cantidad = in.nextInt();
// Si es el caso especial, no se ejecuta nada y continuar = false
		if (cantidad == 0)
			continuar = false;
		else {
// Declaración del array con las alturas de las montañas
			int[] alturas = new int[cantidad];
// Lectura de las cotas (diferentes alturas)
			for (int i = 0; i < alturas.length; i++) {
				alturas[i] = in.nextInt();
			}
			// Proceso -> Búsqueda de picos
			/*
			 * Para comenzar necesitamos valorar la posibilad de que el pico sea en la
			 * primera medida o en la ultima. Para comprobar si es la primera medida la que
			 * es un pico tenemos que valorar que el primero sea mas alto que el siguiente y
			 * que el ultimo. Para el caso de q sea la ultima, si la ultima medida es mayor
			 * a la anterior y a la primera esa medida sera un pico. Si no tenemos que
			 * recorrer el array comparando si esa medida es mayor a la siguiente y mayor a
			 * la anterior sumaremos un pico mas. Para finalizar mostraremos por salida el
			 * numero de picos que hemos registrado.
			 */
			if (alturas[0] > alturas[1] && alturas[0] > alturas[cantidad - 1]) {
				picos++;
			} else if (alturas[cantidad - 1] > alturas[cantidad - 2] && alturas[cantidad - 1] > alturas[0]) {
				picos++;
			}

			for (int i = 1; i < cantidad - 1; i++) {
				if (alturas[i] > alturas[i + 1] && alturas[i] > alturas[i - 1]) {
					picos++;
				}
			}

			System.out.println(picos);
		}
		return continuar;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
// Casos de prueba limitado por un caso especial
		while (casoDePrueba(in))
			;
	}
}