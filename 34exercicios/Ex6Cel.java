package exercicios1;

import java.util.Scanner;

public class Ex6Cel {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double celsius = 0.0;

		System.out.println("Digite a temperatura em graus Celsius:");
		celsius = leia.nextDouble();

		double fah = (9 * celsius + 160) / 5;
		System.out.println("Conversão para Fahrenheit = " + fah);

		leia.close();
	}

}
