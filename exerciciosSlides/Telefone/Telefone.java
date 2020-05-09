package exercicioTelefoneTV;

import java.util.Scanner;

public class Telefone {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in).useDelimiter("\r\n");
		BaseTelefone telefone = new BaseTelefone();
		int op = 0;
		String numero;
		String conversa;
		int ddd;
		int indAudio;
		telefone.ligarTelefone();
		while (op != 9) {
			System.out.println("\n");
			System.out.println("1 - Efetuar ligação");
			System.out.println("2 - Efetuar ligação com DDD");
			System.out.println("3 - Gravar áudio");
			System.out.println("4 - Recuperar áudio (1..5)");
			System.out.println("9 - Desligar Telefone \n");
			System.out.println("Digite sua opção do telefone:");
			op = entrada.nextInt();
			switch (op) {
			case 1:
				System.out.println("Digitar o número:");
				numero = entrada.next();
				telefone.efetuarLigacao(numero);
				break;
			case 2:
				System.out.println("Digitar o DDD:");
				ddd = entrada.nextInt();
				System.out.println("Digitar o número:");
				numero = entrada.next();
				telefone.efetuarLigacaoDDD(numero, ddd);
				break;
			case 3:
				System.out.println("Digitar a conversa:");
				conversa = entrada.next();
				telefone.gravarConversa(conversa);
				break;
			case 4:
				indAudio = entrada.nextInt();
				String conv = telefone.obterConversaGravada(indAudio);
				System.out.println("Conversa gravada na posição: 0" + indAudio + " - " + conv);
				break;
			case 9:
				System.out.println("Desligando o telefone");
				telefone.desligarTelefone();
				System.exit(0);
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
		entrada.close();

	}

}
