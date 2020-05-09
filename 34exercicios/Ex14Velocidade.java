package exercicios1;

import java.util.Scanner;

public class Ex14Velocidade {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int velocidade = 0;

		System.out.println("Digite a velocidade do veiculo em km/h");
		velocidade = leia.nextInt();

		double ms = velocidade / 3.6;
		System.out.println("Velocidade em m/s = " + ms);

		leia.close();
	}

}
