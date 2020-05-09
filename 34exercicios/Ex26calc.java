package exercicios1;

import java.util.Scanner;

public class Ex26calc {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double numero = 0;

		System.out.println("Digite um numero");
		numero = leia.nextDouble();

		System.out.println("101-Raiz quadrada\r\n" + "102-A metade\r\n" + "103-10% do número\r\n" + "104-O dobro\r\n"
				+ "Escolha a opção:");
		int opcao = leia.nextInt();

		switch (opcao) {
		case 101:
			numero *= numero;
			System.out.println(numero);
			break;
		case 102:
			numero = numero / 2;
			System.out.println(numero);
			break;
		case 103:
			numero = numero * 0.1;
			System.out.println(numero);
			break;
		case 104:
			numero = numero * 2;
			System.out.println(numero);
			break;
		default:
			System.out.println("Opção nao cadastrada!");
		}

		leia.close();

	}

}
