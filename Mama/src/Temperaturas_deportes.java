import java.util.Scanner;
public class Temperaturas_deportes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado= new Scanner (System.in);
		int temperatura;
		
		System.out.print("Ingresar la temperatura:");
		temperatura=teclado.nextInt();
		
		System.out.print("El deporte recomendando es:");
		
	
		if (temperatura < 29 ) 
			System.out.println("natación");
		else if (temperatura > 21)
			System.out.println("tenis");
		else if (temperatura > 0)
			System.out.println("golf");
		}
			
	}

