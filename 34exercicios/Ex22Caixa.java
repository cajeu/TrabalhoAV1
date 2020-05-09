package exercicios1;

import java.util.Scanner;

public class Ex22Caixa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int troco100 = 0, troco10 = 0, troco1 = 0;

		System.out.println("Valor da compra:");
		int compra = leia.nextInt();
		System.out.println("Valor do pagamento:");
		int valor = leia.nextInt();

		valor = valor - compra;

		if (valor / 100 <= 0) {
			troco10 = valor / 10;
			troco1 = valor % 10;

		} else {
			troco100 = valor / 100;
			int sobra = valor - (troco100 * 100);
			troco10 = sobra / 10;
			troco1 = sobra % 10;

		}

		System.out.println("Valor total: " + compra);
		System.out.println("Valor do troco: " + valor);
		System.out.println("Notas de 100: " + troco100 + " Notas de 10: " + troco10 + " Notas de 1: " + troco1);

		leia.close();
	}

}
