import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner (System.in);
		int num_mes, mes; 


		System.out.print ("Introduzca número del mes:");
		num_mes=teclado.nextInt();
		System.out.print ("El número del mes introducido es:");
		System.out.println (num_mes );

		if (num_mes == 1) 
			System.out.print ("El número "+ num_mes + " corresponde al mes de Enero.");

		else {
			if 	(num_mes == 2)
				System.out.print ("El número "+ num_mes + " corresponde al mes de Febrero.");

			else {
				if 	(num_mes == 3)
					System.out.print ("El número "+ num_mes + " corresponde al mes de Marzo.");

				else {
					if 	(num_mes == 4)
						System.out.print ("El número "+ num_mes + " corresponde al mes de Abril.");		

					else {
						if 	(num_mes == 5)
							System.out.print ("El número "+ num_mes + " corresponde al mes de Mayo.");		

						else {
							if 	(num_mes == 6)
								System.out.print ("El número "+ num_mes + " corresponde al mes de Junio.");

							else {
								if 	(num_mes == 7)
									System.out.print ("El número "+ num_mes + " corresponde al mes de Julio.");

								else {
									if 	(num_mes == 8)
										System.out.print ("El número "+ num_mes + " corresponde al mes de Agosto.");

									else {
										if 	(num_mes == 9)
											System.out.print ("El número "+ num_mes + " corresponde al mes de Septiembre.");

										else {
											if 	(num_mes == 10)
												System.out.print ("El número "+ num_mes + " corresponde al mes de Octubre.");	

											else {
												if 	(num_mes == 11)
													System.out.print ("El número "+ num_mes + " corresponde al mes de Noviembre.");
												else {
													if 	(num_mes == 12)
														System.out.print ("El número "+ num_mes + " corresponde al mes de Diciembre.");	

													else {
														if 	(num_mes > 12)
															System.out.print ("El número "+ num_mes + " no se corresponde a ningun mes.");		

													}	
												}	
											}	
										}	
									}	
								}	
							}	
						}	
					}	
				}
			}
		}	

		switch (num_mes) {

		case 1: System.out.println ("Enero");
		break;
		case 2: System.out.println ("Febrero");
		break;
		case 3: System.out.println ("Marzo");
		break;
		case 4: System.out.println ("Abril");
		break;
		case 5: System.out.println ("Mayo");
		break;
		case 6: System.out.println ("Junio");
		break;
		case 7: System.out.println ("Julio");
		break;
		case 8: System.out.println ("Agosto");
		break;
		case 9: System.out.println ("Septiembre");
		break;
		case 10: System.out.println ("Octubre");
		break;
		case 11: System.out.println ("Noviembre");
		break;
		case 12: System.out.println ("Diciembre");
		break;
		}
	}

}
