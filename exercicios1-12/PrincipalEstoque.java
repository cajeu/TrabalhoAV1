package trabalhoav1;

import java.util.Scanner;

public class PrincipalEstoque {
	public static void main(String[] args) {
		Estoque est = new Estoque();
		Estoque est1 = new Estoque();
		Estoque est2 = new Estoque();

		Scanner leia = new Scanner(System.in);

		est.nomeProduto = "Lapis";
		est.valor = 1.99;
		est.quantidade = 30;

		est1.nomeProduto = "Borracha";
		est1.valor = 0.50;
		est1.quantidade = 10;

		est2.nomeProduto = "Caneta";
		est2.valor = 2;
		est2.quantidade = 40;
		
		est.imprimir();
		est.verificarDisponibilidade();
		System.out.println("Quantidade de produtos para remover:");
		int remov = leia.nextInt();
		est.removerProdutos(remov);
		est.imprimir();
		est.verificarDisponibilidade();
		
		System.out.println("Quantidade de produtos para remover:");
		remov = leia.nextInt();
		est.removerProdutos(remov);
		est.imprimir();
		est.verificarDisponibilidade();		
		
		leia.close();
	}

}
