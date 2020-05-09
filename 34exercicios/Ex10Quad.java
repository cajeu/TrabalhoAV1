package exercicios1;

import java.util.Scanner;

public class Ex10Quad {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//leia um valor inteiro e apresente os resultados do quadrado e do cubo do valor lido.
		int valor = 0;
		
		System.out.println("Digite um número inteiro:");
		valor = leia.nextInt();
		
		double quad = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		System.out.println(valor + " ao quadrado = " + quad + " / " + valor + "ao cubo = "+ cubo);
		
		leia.close();
	}

}
