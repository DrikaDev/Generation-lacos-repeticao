/*
Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento e precisam de um sistema para analisar os dados. Escreva um algoritmo em Java, que leia via teclado as seguintes informações de cada colaborador:
Idade (Número inteiro)
Sexo (Número Inteiro): 
1 – Masculino
2 – Feminino
3 – Outros
Categoria (Número Inteiro):
1 – Backend
2 – Frontend
3 – Mobile
4 – FullStack
Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja continuar a leitura dos dados de um novo colaboradore ou não (S/N). Caso seja pressionada a tecla N, mostre na tela:

O número de pessoas desenvolvedoras Backend
O número de mulheres desenvolvedoras Frontend
O número de homens desenvolvedores Mobile maiores de 40 anos
O número de mulheres desenvolvedoras FullStack menores de 30 anos

Na construção do Algoritmo, utilize os seguintes conteúdos:
Entrada e Saída de dados
Operadores
Laços Condicionais
Laço de Repetição WHILE
*/

package Lacos_Repeticao;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		int idade, genero, cat, contNumBack = 0, contNumMFront = 0, contNumHMob = 0, contNumMFull = 0;
		String escolha = "s";
		
		Scanner leia = new Scanner(System.in);
		
		while(escolha.equalsIgnoreCase("s")) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("Digite seu gênero: ");
			System.out.println("1 - Masculino / 2 - Feminino / 3 - Não se aplica");
			genero = leia.nextInt();
			
			System.out.println("Digite a categoria:");
			System.out.println("1 - Backend / 2 - Frontend / 3 - Mobile / 4 - FullStack");
			cat = leia.nextInt();
			
			System.out.println("Deseja continuar? S ou N");
			escolha = leia.next();
			
			if(cat == 1) {
				contNumBack ++;
			}
			if(genero == 2 && cat == 2) {
				contNumMFront++;
			}
			if(idade > 40 && genero == 1 && cat == 3) {
				contNumHMob++;
			}
			if(idade > 30 && genero == 2 && cat == 4) {
				contNumMFull++;
			}
		}
		System.out.println("Total de pessoas desenvolvedoras Backend: " + contNumBack);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + contNumMFront);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + contNumHMob);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + contNumMFull);
	}
}
