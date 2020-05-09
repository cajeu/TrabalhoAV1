package exercicioCamiseta;

import java.util.Scanner;

public class Caixa {
	public static void main(String[] args) {
		new Caixa().processar();

	}

	Scanner leia = new Scanner(System.in);
	private String marca;
	private String modelo;
	private double preco;

	// modularizar
	private void lerDadosComuns() {
		System.out.println("Digite a marca");
		marca = leia.next();
		System.out.println("Digite o modelo");
		modelo = leia.next();
		System.out.println("Digite o preço");
		preco = leia.nextDouble();
	}

	private void processar() {
		int op = 0;
		Carrinho car = new Carrinho();
		do {
			System.out.println("1 - Adicionar Camisa.");
			System.out.println("2 - Adicionar Calca.");
			System.out.println("3 - Adicionar Sapato.");
			System.out.println("7 - Fechar Pedido.");
			System.out.println("9 - Encerrar sistema.");
			System.out.println("Digite sua opção:");
			op = leia.nextInt();

			switch (op) {
			case 1:
				// camisa
				System.out.println("Adicionar Camisa");
				Camisa cam = new Camisa();
				lerDadosComuns();
				System.out.println("Digite tipo de gola");
				String tpGola = leia.next();
				cam.setMarca(marca);
				cam.setModelo(modelo);
				cam.setValor(preco);
				cam.setTpGola(tpGola);

				break;
			case 2:
				// calça
				System.out.println("Adicionar Calça");
				Calca cal = new Calca();
				lerDadosComuns();
				System.out.println("Digite se tem cinto (s/n)");
				String temCinto = leia.next();
				if (temCinto.equalsIgnoreCase("s")) {
					cal.setTemCinto(true);
				}
				cal.setMarca(marca);
				cal.setModelo(modelo);
				cal.setValor(preco);

				break;
			case 3:
				// sapato
				System.out.println("Adicionar Sapato");
				Sapato sap = new Sapato();
				lerDadosComuns();
				System.out.println("Digite se é de couro (s/n)");
				String eCouro = leia.next();
				if (eCouro.equalsIgnoreCase("s")) {
					sap.seteCouro(true);
				}
				sap.setMarca(marca);
				sap.setModelo(modelo);
				sap.setValor(preco);
				
				break;
			case 7:
				// fecha
				System.out.println("Fechar pedido");
				double totalCompra = car.fecharPedidoVestuario();
				System.out.println("Total Compra: " + totalCompra);
				break;
			default:
				break;
			}

		} while (op != 9);

	}

}
