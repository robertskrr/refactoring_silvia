package refactoring;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		int[] numeros = {9, 19, 5, 4, 14, 6, 10, 55, 18, 17};
        int tamaño = numeros.length;
        
        while (tamaño > 0) {
        	System.out.println("Tabla actual: ");
        	
        	for (int i = 0; i < tamaño; i++) {
        		System.out.print(numeros[i] + " ");
        	}
        	
        	System.out.println();
        	
        	System.out.println("Introducir el índice del elemento que quieres eliminar de la tabla (-1 para salir): ");
        	int indice = sc.nextInt();
        	
        	if (indice < 0) {
                System.out.println("Fin del programa.");
                break;
            }
        	
        	boolean valido = false;
            for (int i = 0; i < tamaño; i++) {
                if (numeros[i] == indice) {
                    for (int j = i; j < tamaño - 1; j++) {
                        numeros[j] = numeros[j + 1];
                    }
                    tamaño--;
                    valido = true;
                    System.out.println("Número " + indice + " eliminado.");
                    break;
                }
            }
        	
            if (!valido) {
                System.out.println("Índice no válido.");
            }
        }
        
        if (tamaño == 0) {
            System.out.println("No quedan más elementos que eliminar.");
        }
        
        sc.close();
	}
}
