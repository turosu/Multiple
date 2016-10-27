// Falta añadir contador de H y mensajes de cuantos errores has metido y cuentos errores de H
import java.util.Scanner;

public class Numeros_telefonos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* while (){*/
		Scanner teclado= new Scanner (System.in);
		String letra;
		int numero = 0;
		boolean terminar = false, correcto;
		int sumador = 0, contadorH =0;

		System.out.print (" Ingrese la letra:  ");
		letra = teclado.next();
		while (! terminar){
			correcto = true;
		switch (letra) {
		case "a": case "A": case "b": case"B": case "c": case "C":
			numero = 2;
			break;
		case "d": case "D": case "e": case"E": case "f": case"F":
			numero = 3;
			break;
		case "g": case"G": case "h": case"H": case "i": case "I":
			numero = 4;
			break;
		case "j": case"J": case "k": case"K": case "l": case"L":
			numero = 5;
			break;
		case "m": case"M": case "n": case"N": case "o": case"O":
			numero = 6;
			break;
		case "p": case "P": case "q": case"Q": case "r": case "R": case "s": case "S":
			numero = 7;
			break;
		case "t": case "T": case "u": case "U": case "v": case "V":
			numero = 8;
			break;
		case "w": case "W": case "x": case "X": case "y": case "Y": case "z": case "Z":
			numero = 9;
			break;
		case "0":
			terminar = true;
		break;

		default:
			sumador++;
		if (! terminar) {
	
		System.out.println(" La letra " + letra + " corresponde al numero " + numero);

		System.out.print (" Ingrese la letra:  ");
		letra = teclado.next();
		}

		}


	}





	}
}




