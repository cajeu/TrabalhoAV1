package exercicios1;

import java.util.Scanner;

public class Ex25lanchonete {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double valor = 0.0;

		System.out.println("Especificação \t\t Preço Unitario \r\n" + "100 Cachorro quente 	1,10\r\n"
				+ "101 Bauru simples 	1,30\r\n" + "102 Bauru c/ovo 	1,50\r\n" + "103 Hamburger 	        1,10\r\n"
				+ "104 Cheeseburger 	1,30\r\n" + "105 Refrigerante 	1,00\r\n");

		System.out.println("Codigo do pedido:");
		int codigo = leia.nextInt();
		System.out.println("Quantidade:");
		int quant = leia.nextInt();

		switch (codigo) {
		case 100:
			valor = quant * 1.10;
			break;
		case 101:
			valor = quant * 1.30;
			break;
		case 102:
			valor = quant * 1.50;
			break;
		case 103:
			valor = quant * 1.10;
			break;
		case 104:
			valor = quant * 1.30;
			break;
		case 105:
			valor = quant * 1;
			break;
		default:
			System.out.println("Codigo invalido");

		}

		System.out.println("Valor total: " + valor);

		leia.close();

	}

}
