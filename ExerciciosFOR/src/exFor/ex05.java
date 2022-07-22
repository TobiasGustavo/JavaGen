package exFor;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		//No final, mostre a soma dos números digitados.(DO...WHILE)

   Scanner in = new Scanner(System.in);
   int soma = 0, numero;
	
   do  {
			System.out.println("Digite um número: ");
			numero = in.nextInt();
			soma += numero;
		}
   while(numero != 0);
		System.out.println("A soma dos números digitados é: " + soma);
		in.close();
		 
	}

}
