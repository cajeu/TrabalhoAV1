package exercicios1;

import java.util.Scanner;

public class Ex31vetor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int vetor1[] = new int[5];
		int vetor2[] = new int[5];
		int vetor3[] = new int[5];
		int i = 0;

		vetor1[0] = 10;
		vetor1[1] = 20;
		vetor1[2] = 30;
		vetor1[3] = 40;
		vetor1[4] = 50;

		vetor2[0] = 5;
		vetor2[1] = 5;
		vetor2[2] = 5;
		vetor2[3] = 5;
		vetor2[4] = 5;

		for (i = 0; i < 5; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
			System.out.println(vetor3[i]);
		}

		leia.close();
	}
}
