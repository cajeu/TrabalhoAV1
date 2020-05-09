package exercicios1;

import java.util.Scanner;

public class Ex23Reajuste {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		char categoria;
		String nome;
		double salario = 0.0;

		System.out.println("Digite nome do Funcionario:");
		nome = leia.next();

		System.out.println("Digite sua categoria:");
		categoria = leia.next().charAt(0);

		System.out.println("Digite o salario:");
		salario = leia.nextDouble();

		if ((categoria == 'A') || (categoria == 'C') || (categoria == 'F') || (categoria == 'H')) {
			salario += salario * 0.10;
		}
		if ((categoria == 'B') || (categoria == 'D') || (categoria == 'E') || (categoria == 'I') || (categoria == 'J')
				|| (categoria == 'T')) {
			salario += salario * 0.15;
		}
		if ((categoria == 'K') || (categoria == 'R')) {
			salario += salario * 0.25;
		}
		if ((categoria == 'L') || (categoria == 'M') || (categoria == 'N') || (categoria == 'O') || (categoria == 'P')
				|| (categoria == 'Q') || (categoria == 'S')) {
			salario += salario * 0.35;
		}
		if ((categoria == 'U') || (categoria == 'V') || (categoria == 'X') || (categoria == 'Y') || (categoria == 'W')
				|| (categoria == 'Z')) {
			salario += salario * 0.50;
		}

		System.out.println("Nome do funcionario: " + nome + "\n Categoria: " + categoria + "\n Salario reajustado: " + salario);

		leia.close();
	}

}
