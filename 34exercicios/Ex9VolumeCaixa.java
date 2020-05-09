package exercicios1;

import java.util.Scanner;

public class Ex9VolumeCaixa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double comprimento = 0.0;
		double altura = 0.0;
		double largura = 0.0;

		System.out.println("Digite o comprimento:");
		comprimento = leia.nextDouble();
		System.out.println("Digite a altura:");
		altura = leia.nextDouble();
		System.out.println("Digite a largura:");
		largura = leia.nextDouble();

		double volume = comprimento * largura * altura;
		System.out.println("Volume total = " + volume);

		leia.close();
	}

}
