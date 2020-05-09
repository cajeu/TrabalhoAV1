package exercicios1;

import java.util.Scanner;

public class Ex7Fah {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double fah = 0.0;

		System.out.println("Digite a temperatura em Fahrenheit:");
		fah = leia.nextDouble();

		double cel = (fah - 32) * 5 / 9;
		System.out.println("Conversão para Celsius = " + cel);

		leia.close();
	}
}
