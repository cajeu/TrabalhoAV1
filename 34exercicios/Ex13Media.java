package exercicios1;

import java.util.Scanner;

public class Ex13Media {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double val1 = 0.0;
		double val2 = 0.0;
		double media = 0.0;

		System.out.println("Digite o primeiro valor:");
		val1 = leia.nextDouble();
		System.out.println("Digite o segundo valor:");
		val2 = leia.nextDouble();

		media = (val1 + val2) / 2;

		System.out.println("Media = " + media);

		leia.close();
	}
}
