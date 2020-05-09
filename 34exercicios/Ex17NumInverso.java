package exercicios1;

import java.util.Scanner;

public class Ex17NumInverso {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n = 0;

		System.out.println("Digite um numero com 3 algarismos:");
		n = leia.nextInt();

		String m = String.valueOf(n);
		char vetorM[] = m.toCharArray();

		System.out.println("Inverso:" + vetorM[2] + vetorM[1] + vetorM[0]);

		leia.close();
	}
}
