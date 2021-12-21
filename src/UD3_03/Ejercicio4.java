package UD3_03;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
//    El ejercicio nos pide buscar la pieza que falta para poder finalizar el puzle.

	public static boolean casoDePrueba(Scanner in) {
		// Variable que controla si el caso hay que analizarlo o finaliar
		boolean continuar = true;
		// Se lee la candidad de piezas o el caso especial que es 0
		int cantidad = in.nextInt();
		// Si es el caso especial, no se ejecuta nada y continuar = false
		if (cantidad == 0)
			continuar = false;
		else {
			// Declaración del array (tiene una pieza menos)
			int[] puzzle = new int[cantidad - 1];
			// Lectura de las piezas del puzzle
			for (int i = 0; i < puzzle.length; i++) {
				puzzle[i] = in.nextInt();
			}
			// Ordeno el Array
			Arrays.sort(puzzle);
			// Proceso -> Busco la pieza perdida
			/*
			 * Para comenzar necesitamos valorar la posibilad de que la pieza q falte sea la
			 * primera o la ultima. Para comprobar si es la primera pieza la q falta como el
			 * array esta ordenado de myor a menor, entendemos que la primera pieza tendra q
			 * ser un 1 por lo q si es distinta a 1 la pieza que falta es esa. Para el caso
			 * de q sea la ultima, si la ultima pieza es menor de la cantidad total la pieza
			 * que falta es la ultima. Si no es ninguna de las dos anteriores necesitamos
			 * recoorer el array entero, para eso y mediante un while, hacemos que entre en
			 * el bucle while cada vez que este la pieza y dentro guardamos la pieza que
			 * falta como el numero del array que cooresponda +1, asi cuando no entre en el
			 * while la variable pieza tendra guardada la pieza que se guardo.
			 */
			int pieza = 0;
			if (puzzle[0] != 1) {
				pieza = 1;
			} else if (puzzle[puzzle.length - 1] < cantidad) {
				pieza = cantidad;
			} else {
				for (int j = 0; j < puzzle.length; j++) {

				}
				int j = 0;
				while (j + 1 == (puzzle[j])) {
					pieza = puzzle[j] + 1;
					j++;
				}
			}

			System.out.println(pieza);
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