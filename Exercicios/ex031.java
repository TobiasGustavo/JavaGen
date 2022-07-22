package Exercicios;

import java.util.Scanner;

public class ex031 {

public static void main(String[] args) {
		
		int idade = 0;
		
		Scanner leia = new Scanner(System.in);
		
	
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 0 && idade <= 12) {
			System.out.println(idade +" anos pertence ao grupo Infantil.");
		}
		
		else if (idade >= 13 && idade <= 17) {
			System.out.println(idade +" anos pertence ao grupo Juvenil.");
		}
		
		else if (idade >= 18 && idade <= 60) {
			System.out.println(idade +" anos pertence ao grupo Adulto.");
		}
		
		else {
			System.out.println("Nenhuma grupo valido.");
		}
		
		leia.close();
		
		

	}

}