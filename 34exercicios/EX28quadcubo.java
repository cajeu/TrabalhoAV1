package exercicios1;

import java.util.Scanner;

public class EX28quadcubo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int i;
		double quad[] = new double[10];
		double cubo[] = new double[10];

		for (i = 0; i < 10; i++) {
			quad[i] = Math.pow(i, 2);
			cubo[i] = Math.pow(i, 3);
		}

		System.out.println("Numero \t\t Quadrado \t Cubo");

		for (i = 0; i < 10; i++) {
			System.out.println(i + "\t\t" + quad[i] + "\t\t" + cubo[i]);
		}

		leia.close();
	}

}
