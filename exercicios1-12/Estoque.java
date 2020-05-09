package trabalhoav1;

public class Estoque {
	String nomeProduto;
	double valor;
	int quantidade;
	
	public void imprimir() {
		System.out.println("Nome do Produto: " + nomeProduto);
		System.out.println("Valor: "+ valor);
		System.out.println("Quantidade: " + quantidade);
	}

	public int verificarDisponibilidade() {
		if (this.quantidade > 0) {
			System.out.println("Produto disponivel");
			return 1;
		}else {
			System.out.println("Produto indisponivel");
			return 0;
		}
	}
	
	public int removerProdutos(int remov) {
		if (verificarDisponibilidade() == 1) {
			this.quantidade = this.quantidade - remov;
			return 1;
		}else {
			System.out.println("Não foi possivel remover o produto");
			return 0;
		}
	}
}
