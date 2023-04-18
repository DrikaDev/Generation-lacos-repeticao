/*
Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, 
onde o primeiro número deve ser menor do que o segundo número. 
Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido 
e sair do programa. 
Dentro do intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.
Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados
Laços Condicionais
Laço de Repetição FOR
*/

package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, x = 0;
		
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		
		if (n1 >= n2) {
			System.out.println("Intervalo Inválido");
		}
		
		for (x = n1 ; x <= n2; x++){
			if(x % 3 == 0 && x % 5 == 0) {
				System.out.println(x + " é multiplo de 3 e 5");
		}
			
		}
	}
}