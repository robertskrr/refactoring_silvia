package refactoring;

import java.util.Random;

public class Ejercicio2 {
		
	public static void main(String[] args) {
        
        Random random = new Random();
        
        int[] frecuencia = new int[5];
        char[] tabla = new char[20];
        
        for (int i = 0; i < tabla.length; i++) {
            char[] vocales = {'a', 'e', 'i', 'o', 'u'};
            int indiceAleatorio = random.nextInt(vocales.length);
            char vocal = vocales[indiceAleatorio];
            tabla[i] = vocal;
            
            switch (vocal) {
                case 'a': frecuencia[0]++; break;
                case 'e': frecuencia[1]++; break;
                case 'i': frecuencia[2]++; break;
                case 'o': frecuencia[3]++; break;
                case 'u': frecuencia[4]++; break;
            }
        }

        System.out.println("Tabla de vocales aleatoria:");
        for (char vocal : tabla) {
            System.out.print(vocal + " ");
        }
        System.out.println();

        System.out.println("\nFrecuencia de cada vocal:");
        System.out.println("a: " + frecuencia[0]);
        System.out.println("e: " + frecuencia[1]);
        System.out.println("i: " + frecuencia[2]);
        System.out.println("o: " + frecuencia[3]);
        System.out.println("u: " + frecuencia[4]);
    }
}
