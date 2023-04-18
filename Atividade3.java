/*
Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e 
o total de pessoas cuja idade seja maior que 50 anos. 
A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados
Operadores
Laços Condicionais
Laço de Repetição WHILE
*/
package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, contPessoasMenor = 0, contPessoasMaior = 0;
		
		while(idade >= 0  ) {
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			if (idade >= 1 && idade < 21) {
				contPessoasMenor++;
			}else if (idade > 50) {
				contPessoasMaior++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + contPessoasMenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + contPessoasMaior);

	}

}
