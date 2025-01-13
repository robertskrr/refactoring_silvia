package refactoring;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.print("Jugador 1, introduce la contraseña: ");
        String contraseña = sc.nextLine();
        System.out.print("Jugador 2, intenta adivinar la contraseña: ");
        String intento = sc.nextLine();

        int longitud = contraseña.length();
        char primeraLetra = contraseña.charAt(0);
        char ultimaLetra = contraseña.charAt(longitud - 1);

        System.out.println("Pistas:");
        System.out.println("Número de caracteres: " + longitud);
        System.out.println("Primera letra: " + primeraLetra);
        System.out.println("Última letra: " + ultimaLetra);
        
        boolean acerto = true;
        if (intento.length() == contraseña.length()) {
            for (int i = 0; i < longitud; i++) {
                if (intento.charAt(i) != contraseña.charAt(i)) {
                    acerto = false;
                    break;
                }
            }
        } else {
            acerto = false;
        }

        if (acerto) {
            System.out.println("¡Acertaste!");
        } else {
            System.out.println("Fallaste.");
        }
		
        sc.close();
	}
}
