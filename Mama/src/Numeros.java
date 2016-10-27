//Programa que realiza suma y producto dependiendo de si el primer dato es negativo o positivo
import java.util.Scanner;
public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int num1,num2,num3,suma,producto;
		
		
		System.out.print ("Ingrese primer valor:");
		num1 = teclado.nextInt();
	
		System.out.print ("Ingrese segundo valor:");
		num2 = teclado.nextInt();
		
		System.out.print ("Ingrese tercer valor:");
		num3 = teclado.nextInt();
		
		System.out.println ("El primer numero seleccionado:");
		System.out.println (num1);
		
		
// Aqui se realiza la eleccion de si el primer numero es negativo o positivo
		if (num1 < 0) {
			producto = num1 * num2* num3;
			
			System.out.print ("El producto de los tres valores es:");
			System.out.println (producto);
			
		}else {
			suma = num1 + num2 + num3;
			
			System.out.print ("La suma de los tres valores es:");
			System.out.println (suma);
			
			
		}
		
		
	}

}
