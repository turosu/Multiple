import java.util.Scanner;

public class Programa_Estudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner (System.in);
		int horas,faltas,id; 
 
		
		System.out.println("Ingrese el id del alumno");
		id=teclado.nextInt();
		
		System.out.println("Ingresar horas asignatura:");
		horas=teclado.nextInt();
		
		System.out.println("Ingresar faltas:");
		faltas=teclado.nextInt();
		
		int calculo1 = (faltas * 100);
		int calculo2 = (calculo1 / horas);
//		System.out.println(calculo2);
		
		if (calculo2 >= 15) {
			System.out.print("Has perdido el derecho a la evaluacion continua, tu numero de id es: ");
		System.out.println(id);
		System.out.print("Te has ausentado tantas veces:");
		System.out.println(faltas);
		System.out.print("Tu porcentaje de faltas es:");
		System.out.print(calculo2  + "%");
		}
		else if (calculo2 >= 5) {
				System.out.print("Has superado el: 5%");
				System.out.print("Tienes un" + calculo2 + "%" + "de faltas");
		}
	}   

}
