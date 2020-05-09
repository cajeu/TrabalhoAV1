package view;

import java.util.Scanner;

public class Lab02Sistema {
	public static void main(String[] args) {
		Lab02Sistema lab = new Lab02Sistema();
		lab.processar();
	}

	Lab02ContaCorrente labConta = new Lab02ContaCorrente();

	Scanner leia = new Scanner(System.in);
	
	private void processar() {
		int op = 0;

		do {
			System.out.println("1 - Cadastramento");
			System.out.println("2 - Saque");
			System.out.println("3 - Deposito");
			System.out.println("4 - Consulta");
			System.out.println("9 - Fim");
			System.out.println("Digite sua opção:");
			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.println("Cadastramento:");
				execCadastramento();
				break;
			case 2:
				System.out.println("Saque:");
				execSaque();
				break;
			case 3:
				System.out.println("Deposito:");
				execDeposito();
				break;
			case 4:
				execImprimir();
				break;
			case 9:
				System.out.println("Fim");
				break;

			default:
				break;
			}

		} while (op != 9);
	}

	private void execCadastramento() {
		System.out.println("Numero da Agencia:");
		labConta.numAge = leia.nextInt();
		System.out.println("Numero da Conta:");
		labConta.numConta = leia.nextInt();
		leia.nextLine();
		System.out.println("Nome do Cliente:");
		labConta.nome = leia.nextLine();
		System.out.println("Saldo:");
		labConta.saldo = leia.nextDouble();
		System.out.println("Confirma cadastramento? (s/n)");
		String confirma = leia.next();
		if (confirma.equalsIgnoreCase("s")) {
			System.out.println("Cadastramento Realizado");
		} else {
			System.out.println("Cadastramento Cancelado");
		}
	}

	private void execSaque() {
		System.out.println("Numero da Agencia:");
		labConta.numAge = leia.nextInt();
		System.out.println("Numero da Conta:");
		labConta.numConta = leia.nextInt();
		System.out.println("Valor do Saque:");
		double valorSaque = leia.nextDouble();
		System.out.println("Confirma Saque? (s/n)");
		String confirma = leia.next();
		if (confirma.equalsIgnoreCase("s")) {
			if (labConta.sacar(valorSaque) == 1) {
				System.out.println("Saque Realizado");
			} else {
				System.out.println("Saldo Insuficiente");
			}

		} else {
			System.out.println("Saque Cancelado");
		}
	}

	private void execDeposito() {
		System.out.println("Numero da Agencia:");
		labConta.numAge = leia.nextInt();
		System.out.println("Numero da Conta:");
		labConta.numConta = leia.nextInt();
		System.out.println("Valor do Deposito:");
		double valorDeposito = leia.nextDouble();
		System.out.println("Confirma Deposito? (s/n)");
		String confirma = leia.next();
		if (confirma.equalsIgnoreCase("s")) {
			labConta.depositar(valorDeposito);
			System.out.println("Deposito Realizado");
		} else {
			System.out.println("Deposito Cancelado");
		}
	}

	private void execImprimir() {
		labConta.Imprimir();
	}
	

}
