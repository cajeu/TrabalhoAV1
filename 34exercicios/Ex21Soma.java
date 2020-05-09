package exercicios1;

import java.util.Scanner;

public class Ex21Soma {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um valor inteiro para A:");
		int numa = leia.nextInt();
		System.out.println("Digite um valor inteiro para B:");
		int numb = leia.nextInt();
		System.out.println("Digite um valor inteiro para C:");
		int numc = leia.nextInt();

		int soma = numa + numb;
		
		if (soma > numc) {
			System.out.println("A soma de A + B é maior que o valor de C");
			System.out.println("Soma=" + soma + "/ C = " + numc);
		}
		else {
			System.out.println("A soma de A + B é menor que o valor de C");
			System.out.println("Soma= " + soma + "/ C= " + numc);
		}

		leia.close();
	}

}
