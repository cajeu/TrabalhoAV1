package exercicios1;

import java.util.Scanner;

public class Ex11SomaQuad {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numa = 0;
		int numb = 0;

		System.out.println("Digite um valor inteiro:");
		numa = leia.nextInt();
		System.out.println("Digite outro valor inteiro:");
		numb = leia.nextInt();

		int soma = numa + numb;
		double quad = Math.pow(soma, 2);

		System.out.println(soma + " ao quadrado = " + quad);

		leia.close();
	}
}
