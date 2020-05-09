package exercicios1;

import java.util.Scanner;

public class Ex29Fibonacci {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int primeiro = 0;
		int segundo = 1;
		int novo = 0;
		int n = 0;
		int sequencia[] = new int[90];

		

		System.out.println("Digite um numero inteiro:");
		n = leia.nextInt();

		if (n >= 2) {
			for (int i = 2; i < n; i++) {
				novo = primeiro + segundo;
				sequencia[i] = novo;
				primeiro = segundo;
				segundo = novo;
				
			}
		}
		
		sequencia[0] = 0;
		sequencia[1] = 1;

		leia.close();
		
		System.out.println( n + " primeiros numero de Fibonacci:");
		for (int i = 0; i <n; i++) {
			System.out.println(sequencia[i]);
		}
	}

}
