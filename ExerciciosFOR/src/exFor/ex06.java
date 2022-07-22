package exFor;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// Escrever um programa que receba vários números inteiros no teclado. 
		//E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		
		
		
	}
	Scanner ler = new Scanner(System.in);
	
	int num = 0, soma = 0, i = 0, media; 
	
	 do {
		System.out.println("Digite o número que deseja somar, e para finalizar digite 0: ");
		num = ler.nextInt();
		
    if(num % 3 == 0 && num != 0) {
		soma += num;
		i++;
       }	
    while(num != 0);
		media = soma/i;
		
		System.out.println("A media dos multiplis de 3 e: " + media);
		ler.close();
	}
	

	
}


