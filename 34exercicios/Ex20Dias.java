package exercicios1;

import java.util.Scanner;

public class Ex20Dias {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua idade em anos, meses e dias:");
		int idadeAno = leia.nextInt();
		int idadeMeses = leia.nextInt();
		int idadeDias = leia.nextInt();

		idadeDias += (idadeAno * 365) + (idadeMeses * 30);

		System.out.println("Você já viveu " + idadeDias + " dias.");

		leia.close();
	}

}
