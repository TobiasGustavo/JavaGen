package exFor;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
       
		Scanner ler = new Scanner(System.in);
		
		int p = 0,  i = 0, numeros; 
		
		for(int n = 0; n <=10; n++) {
			System.out.println("Digite numeros: ");
			numeros = ler.nextInt();
			
			
			
			if (numeros % 2 == 0) {

				p++;
		}
			else if (numeros % 2 !=0) {
				i++;
				
			}
			
		}
		System.out.println("Quantos numeros sao pares: ");
		System.out.println("Quantos numeros sao impares: ");
		
	}

}
