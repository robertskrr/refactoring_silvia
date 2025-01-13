package refactoring;

import java.util.*;

public class Ejercicio3 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.println("Introducir una frase: ");
		String frase = sc.nextLine();
		System.out.println("Introducir una palabra: ");
		String palabra = sc.nextLine();
		
		int contador = 0;
        int index = 0;
        
        while ((index = frase.indexOf(palabra, index)) != -1) {
            contador++;
            index += palabra.length();
        }
        
        System.out.println("La palabra \"" + palabra + "\" aparece " + contador + " veces en la frase");
		
        sc.close();
	}
}
