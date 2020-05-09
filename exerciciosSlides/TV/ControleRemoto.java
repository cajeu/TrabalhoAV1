package exercicioTelefoneTV;

import java.util.Scanner;

public class ControleRemoto {

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.processar();
	}

	Scanner leia = new Scanner(System.in);

	private void processar() {
		int op;
		Televisao cr = new Televisao();

		do {
			System.out.println("1 - Aumentar Volume");
			System.out.println("2 - Diminuir Volume");
			System.out.println("3 - Aumentar Canal");
			System.out.println("4 - Diminuir Canal");
			System.out.println("5 - Ligar TV");
			System.out.println("6 - Escolher Canal");
			System.out.println("7 - Mute");
			System.out.println("8 - Configurações");
			System.out.println("9 - Sair");
			System.out.println("10 - Ultimo Canal");
			System.out.println("Digite sua opção: ");
			op = this.leia.nextInt();
			switch (op) {
			case 1:
				cr.aumentarVolume();
				break;
			case 2:
				cr.diminuirVolume();
				break;
			case 3:
				cr.aumentarCanal();
				break;
			case 4:
				cr.diminuirCanal();
				break;
			case 5:
				cr.ligarTV();
				break;
			case 6:
				int canalNovo = this.leia.nextInt();
				cr.aplicarCanal(canalNovo);
				break;
			case 7:
				cr.mute();
				break;
			case 8:
				System.out.println(cr.toString());
				break;
			case 9:
				System.out.println("Saindo do sistema");
				break;
			case 10:
				cr.getUltimoCanal();
				break;

			default:
				System.out.println("Opção Invalida");
				break;
			}

		} while (op != 9);
	}

}
