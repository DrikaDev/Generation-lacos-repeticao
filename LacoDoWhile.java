package Lacos_Repeticao;

import java.util.Scanner;

public class LacoDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tabuada, x = 1, resultado;
		
		System.out.println("Qual tabuada vc quer ver? ");
		tabuada = leia.nextInt();
		
		do {
			resultado = tabuada * x;
			System.out.println(tabuada + " x " + x + " = " + resultado);
			x++;
			
		}while(x <= 10);
			
	}
}
