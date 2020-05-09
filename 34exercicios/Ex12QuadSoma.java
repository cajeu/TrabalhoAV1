package exercicios1;

import java.util.Scanner;

public class Ex12QuadSoma {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um valor inteiro:");
		int numa = leia.nextInt();
		System.out.println("Digite outro valor inteiro");
		int numb = leia.nextInt();

		double quada = Math.pow(numa, 2);
		double quadb = Math.pow(numb, 2);

		System.out.println("Quadrado de " + numa + " = " + quada + " / Quadrado de " + numb + " = " + quadb);

		leia.close();
	}
}
