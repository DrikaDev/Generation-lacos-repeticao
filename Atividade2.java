/*
Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e 
mostre na tela quantos números são pares e quantos número são ímpares.
Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados
Operadores
Laços Condicionais
Laço de Repetição FOR
*/

package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, quantPar = 0, quantImpar = 0, i;
		
		for ( i = 1; i <= 100; i++);{
			System.out.printf("Digite o %d número: ", i);
			num = leia.nextInt();
			
			if( num % 2 == 0) {
				quantPar++;
			}else {
				quantImpar++;
			}	
		}
		
		System.out.println("Total de números pares: " + quantPar);
		System.out.println("Total de números ímpares: " + quantImpar);
		
	}

}
