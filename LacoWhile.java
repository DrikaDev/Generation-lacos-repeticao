package Lacos_Repeticao;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, contPar = 0, somaImpar = 0;
		
		System.out.println("Entre com um número: ");
		numero = leia.nextInt();
		
		while(numero != 0) {
			
			if(numero % 2 == 0) {
				contPar++; //contPar = contPar + 1
			}else {
				somaImpar += numero; //somaImpar = somaImpar + numero;	
			}
			System.out.println("Entre com um número: ");
			numero = leia.nextInt();
		}
		System.out.println("Qtde dos Números Pares digitados: " + contPar);
		System.out.println("Soma dos Números Impares digitados: " + somaImpar);
	}

}
