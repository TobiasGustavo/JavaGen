package Exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ex04 {
		
		// Faça um programa em que permita a entrada de um número qualquer e 
		//exiba se este número é par ou ímpar. 
		//Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o 
		//número elevado ao quadrado.

		public static void main(String[] args) {
			
			double n;
			
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite aqui o seu numero: "));
			
			if (n % 2 == 0 ) {
				JOptionPane.showMessageDialog(null, "O numero digitado e par e a sua raiz e: "
				+ Math.sqrt(n), "AVISO", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
			else {
				JOptionPane.showMessageDialog(null, "O numero e impar e elevado ao quadrado "
				+ "o resultado e "+ Math.pow(n, 2.0), "AVISO", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		}
		
	}

