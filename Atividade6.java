/*
Escreva um algoritmo em Java, que leia números inteiros via teclado, 
até que o número zero seja digitado. 
Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3.
Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados
Operadores
Laços Condicionais
Laço de Repetição DO...WHILE
*/

package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numDig, qtdNum = 0;
		float media = 0, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			numDig = leia.nextInt();
			
			if (numDig % 3 == 0 && numDig != 0) {
				soma += numDig;
				qtdNum++;
				media = soma / qtdNum;
			}
		
		}while( numDig != 0);
		
		System.out.println("A média de todos os números que são múltiplos de 3 é: " + media );
		
	}

}
