package trabalhoav1;

import java.util.Scanner;

public class PrincipalContaCorrente {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();

		Scanner leia = new Scanner(System.in);

		int op = 0;

		do {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Depositar");
			System.out.println("4 - Consultar");
			System.out.println("9 - Fim");
			op = leia.nextInt();

			double valor = 0.0;

			switch (op) {
			case 1:
				System.out.println("Digite a agencia:");
				conta.agencia = leia.nextInt();
				System.out.println("Digite a conta:");
				conta.conta = leia.nextInt();
				System.out.println("Digite o nome");
				conta.nomeCliente = leia.next();
				break;
			case 2:
				System.out.println("Digite o valor do saque:");
				valor = leia.nextDouble();
				if (conta.sacar(valor) == 1) {
					System.out.println("Saque realizado");
				} else {
					System.out.println("Saque não realizado");
				}
				break;
			case 3:
				System.out.println("Digite o valor do deposito");
				valor = leia.nextDouble();
				conta.deposito(valor);
				break;
			case 4:
				System.out.println("Consulta");
				conta.imprimir();
				break;

			default:
				break;
			}

		} while (op != 9);

		leia.close();
	}

}
