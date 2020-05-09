package exercicioprato;

import java.util.Scanner;

public class Pedido {
	public static void main(String[] args) {
		Pedido p = new Pedido();
		p.processar();

	}

	Scanner leia = new Scanner(System.in);

	Caixa cai = new Caixa();

	private String bebida;
	private String sobremesa;
	private String porcao;
	private double valor;

	private void lerDadosComuns() {
		System.out.println("Digite a bebida:");
		this.bebida = leia.next();
		System.out.println("Digite a sobremesa:");
		this.sobremesa = leia.next();
		System.out.println("Digite a porção:");
		this.porcao = leia.next();
		System.out.println("Digite o valor:");
		this.valor = leia.nextDouble();
	}

	private void processar() {
		int op = 0;
		do {
			System.out.println("1 - Prato Executivo");
			System.out.println("2 - Marmita");
			System.out.println("3 - Espeto");
			System.out.println("4 - Buffet");
			System.out.println("7 - Fechar pedido");
			System.out.println("9 - Encerrar Aplicação");
			System.out.println("Digite sua opção: ");
			op = leia.nextInt();
			switch (op) {
			case 1:
				System.out.println("Adicionar Prato Executivo");
				lerDadosComuns();

				Executivo ex = new Executivo();

				ex.setBebida(this.bebida);
				ex.setSobremesa(this.sobremesa);
				ex.setPorcao(this.porcao);
				ex.setValor(this.valor);
				
				this.cai.adicionarPrato(ex);

				break;
			case 2:
				System.out.println("Adicionar Marmita");
				lerDadosComuns();

				Marmita mar = new Marmita();

				mar.setBebida(this.bebida);
				mar.setSobremesa(this.sobremesa);
				mar.setPorcao(this.porcao);
				mar.setValor(this.valor);
				
				this.cai.adicionarPrato(mar);

				break;
			case 3:
				System.out.println("Adicionar Espeto Corrido");
				lerDadosComuns();

				Espeto esp = new Espeto();

				esp.setBebida(this.bebida);
				esp.setSobremesa(this.sobremesa);
				esp.setPorcao(this.porcao);
				esp.setValor(this.valor);
				
				this.cai.adicionarPrato(esp);

				break;
			case 4:
				System.out.println("Adicionar Buffet");
				lerDadosComuns();

				Buffet buf = new Buffet();

				System.out.println("Digite o kilo:");
				double kilo = this.leia.nextDouble();

				buf.setBebida(this.bebida);
				buf.setSobremesa(this.sobremesa);
				buf.setPorcao(this.porcao);
				buf.setValor(this.valor);
				buf.setKilo(kilo);
				
				this.cai.adicionarPrato(buf);

				break;
			case 7:
				System.out.println("Fechar Pedido");
				double tot = this.cai.fecharPedido();
				System.out.println("Valor total:" + tot);

				break;
			case 9:
				System.out.println("Encerrar aplicação");

				break;

			default:
				break;
			}
		} while (op != 9);
	}

}
