package Exercicios;

import java.util.Scanner;

public class ex03 {

	
	public static void main(String[] args) { 
		
		Scanner leia = new Scanner(System.in); 
		
		
		int idade;
		String grupo = "";
		
		
		System.out.println("Digite a sua idade: "); 
		idade = leia.nextInt();
		
		if (idade >= 0 && idade <= 12) {
			grupo = "infantil";
		} else if (idade >= 13 && idade <= 17) {
			grupo = "Juvenil";
		} else if (idade >=18 && idade <= 60) {
			grupo = "adulto";
		}
		
		
		switch (grupo) {
		
		 case "infantil": 
		        System.out.println(idade + " anos pertence ao grupo Infantil."); 
		                break;


		 case "Juvenil":
		        System.out.println(idade + " anos pertence ao grupo Juvenil."); 
		                break;


		  case "adulto":
		            System.out.println(idade + " anos pertence ao grupo Adulto."); 
		                break;
		  default: 
		             System.out.println("Nao existe essa opcao!");
		        }


		        leia.close();
		        }
		        }
		        
		     
	