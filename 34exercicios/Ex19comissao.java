package exercicios1;

import java.util.Scanner;

public class Ex19comissao {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String nome[] = new String[3];
		double venda[] = new double[3];
		double comissao[] = new double[3];
		int i = 0;

		for (i = 0; i < 3; i++) {
			System.out.println("Nome do corretor:");
			nome[i] = leia.next();
			System.out.println("Valor das vendas:");
			venda[i] = leia.nextDouble();
			if (venda[i] > 50000) {
				comissao[i] = venda[i] * 0.12;
			} else {
				if ((venda[i] <= 50000) && (venda[i] >= 30000)) {
					comissao[i] = venda[i] * 0.095;
				} else {
					comissao[i] = venda[i] * 0.07;
				}
			}

		}
		
		double totalvenda = venda[0] + venda[1] + venda[2];
		
		for (i=0; i<3; i++) {
			System.out.println("Nome: " + nome [i] + " / Valor das vendas: " + venda[i] + "/ Total de comissao: " + comissao[i]);
		}
		System.out.println("Total de vendas da empresa: " + totalvenda);

		leia.close();
	}
}
