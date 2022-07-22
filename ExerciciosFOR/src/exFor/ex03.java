package exFor;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

		Scanner in = new Scanner(System.in);
	int numero = -1, cont21 = 0, cont50 = 0;
			
	while(numero !=-99) {	//programa encerra	
		 System.out.println("Digite uma idade: ");
		 numero = in.nextInt();
    if(numero >= 0 && numero < 21) {
			 cont21++;
		}
    else if (numero > 50) { // duas condiciones else if
			 cont50++;
		}
		}
		System.out.println(" Numero de pessoas com menos de 21 anos: " + cont21);
		System.out.println("Numero de pessoas com mais de 50 anos: "   + cont50);
		in.close();
	}
		
		
	}


