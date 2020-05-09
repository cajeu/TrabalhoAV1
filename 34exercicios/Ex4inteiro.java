package exercicios1;

import java.util.Scanner;

public class Ex4inteiro {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o primeiro numero:");
		int num1 = leia.nextInt();
		System.out.println("Digite o segundo numero:");
		int num2 = leia.nextInt();
		
		int soma = num1 + num2;
		System.out.println("Resultado da soma = " + soma);
		
		leia.close();
	}

}
