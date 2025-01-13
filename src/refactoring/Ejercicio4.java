package refactoring;

public class Ejercicio4 {

	public static void main(String[] args) {

		int[] tabla = {1, 2, 2, 3, 4, 4, 5};

        System.out.println("Array sin repetidos:");

        boolean[] visto = new boolean[tabla.length];
        
        for (int i = 0; i < tabla.length; i++) {
            if (!visto[i]) {
                System.out.print(tabla[i] + " ");
                
                for (int j = i + 1; j < tabla.length; j++) {
                    if (tabla[i] == tabla[j]) {
                        visto[j] = true;
                    }
                }
            }
        }
    }
}
