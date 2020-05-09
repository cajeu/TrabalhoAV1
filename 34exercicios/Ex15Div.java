package exercicios1;

import java.util.Scanner;

public class Ex15Div {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int int1 = 0;
		int int2 = 0;
		
		System.out.println("Digite um valor inteiro:");
		int1 = leia.nextInt();
		System.out.println("Digite outro valor inteiro:");
		int2 = leia.nextInt();
		
		double div = int1 / int2;
		double resto = int1 % int2;
		
		System.out.println("Quociente = " + div + " / Resto = " + resto);
		
		leia.close();
	}

}
