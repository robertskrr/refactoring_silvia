package refactoring;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Jugador 1, introduce la contraseña: ");
		String contraseña = sc.nextLine();

		mostrarPistas(contraseña);
		
		System.out.print("Jugador 2, intenta adivinar la contraseña: ");
		String intento = sc.nextLine();

		boolean esCorrecto = verificarIntento(contraseña, intento);

		if (esCorrecto) {
			System.out.println("¡Acertaste!");
		} else {
			System.out.println("Fallaste.");
		}

		sc.close();
	}

	public static void mostrarPistas(String contraseña) {
		int longitud = contraseña.length();
		char primeraLetra = contraseña.charAt(0);
		char ultimaLetra = contraseña.charAt(longitud - 1);

		System.out.println("Pistas:");
		System.out.println("Número de caracteres: " + longitud);
		System.out.println("Primera letra: " + primeraLetra);
		System.out.println("Última letra: " + ultimaLetra);
	}

	public static boolean verificarIntento(String contraseña, String intento) {
		if (intento.length() != contraseña.length()) {
			return false;
		}

		for (int i = 0; i < contraseña.length(); i++) {
			if (intento.charAt(i) != contraseña.charAt(i)) {
				return false;
			}
		}

		return true;
	}
}
