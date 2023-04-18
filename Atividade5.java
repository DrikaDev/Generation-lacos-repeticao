/*
Escreva um algoritmo em Java, que leia números inteiros via teclado, 
até que o número zero seja digitado. 
Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.
Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados
Operadores
Laços Condicionais
Laço de Repetição DO...WHILE
*/

package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num = 0, soma = 0;
				
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();	
			
			if ( num > 0) {		
			soma = soma + num;
			}
			
		}while( num != 0 );
		
		System.out.println("A soma dos números positivos é: " + soma);
	}
}
