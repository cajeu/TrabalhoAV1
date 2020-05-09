package exercicios1;

import java.util.Scanner;

public class Ex16SalarioDesc {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double sb = 0.0;

		System.out.println("Insira o valor de seu Salario Bruto:");
		sb = leia.nextDouble();

		sb = sb - (sb * 0.1);
		sb = sb - (sb * 0.05);
		
		System.out.println("Salario Liquido =  " + sb);

		leia.close();
	}

}
