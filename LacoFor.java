package Lacos_Repeticao;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, media, somaMedia = 0, mediaGeral;
		//variavel de loop: x
		int x;
		
		for (x = 1; x <= 4; x++);{ //x++ é a mesma coisa que x = x + 1
			System.out.println("Entre com a primeira nota:");
			n1 = leia.nextFloat();
			System.out.println("Entre com a segunda nota:");
			n2 = leia.nextFloat();
			System.out.println("Entre com a terceira nota:");
			n3 = leia.nextFloat();
			
			media = (n1 + n2 + n3)/3;
			//printf serve para arredondar valor:
			System.out.printf("Média do aluno %d foi de: %.2f", x, media);
			//d é pra inteiro - f pra float
			//ou
			System.out.println("\nMédia do aluno " + x + " foi de:" + media);
			
			somaMedia += media; // somaMedia = somaMedia + media			
		}
		
		mediaGeral = somaMedia;
		System.out.printf("Média geral foi de : %.2f", mediaGeral);
	}
}
